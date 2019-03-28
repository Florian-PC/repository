package controller;

import java.io.IOException;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import bean.BeanBrowser;
import bean.BlocFiltre;
import bean.Filtre;
import command.ICommand;
import service.Service;

/**
 * Servlet implementation class FrontController
 */
@WebServlet("/frontcontroller")

public class FrontController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public FrontController() {
        super();
    }

	/**
	 * @see Servlet#init(ServletConfig)
	 */
	public void init(ServletConfig config) throws ServletException {
	}

	/**
	 * @see Servlet#destroy()
	 */
	public void destroy() {
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doProcess(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doProcess(request, response);
	}

	/**
	 * @param request
	 * @param response
	 * @throws ServletException
	 * @throws IOException
	 */
	protected void doProcess(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		// session or create it if it does not exist yet
		HttpSession session = request.getSession(true);
		//create a beanbrowser if none are
		if (session.getAttribute("beanBrowser") == null) {
			session.setAttribute("beanBrowser", new BeanBrowser());
		}		
		
		//Update beanbrowser with checked filter
		for (BlocFiltre indiceBlocFiltre : Service.getSessionBeanBrowser(request).getListBlocFiltre()) 
		{ 
		    for (Filtre indiceFiltre : indiceBlocFiltre.getListFiltre()) {
		    	if (request.getParameterValues(indiceBlocFiltre.getIdBlocFiltre()+" "+indiceFiltre.getIdFiltre())==null) {
		    		indiceFiltre.setChecked(false);
		    	} else {
		    		indiceFiltre.setChecked(true);
		    	};
		    }
		}
		
		
		//get cmd parameter from the url from action used in JSP
		String cmd = request.getParameter("cmd");
				
		String urlSuivante = null;
		
		// Selecting the right command to call and executing it to get URL for to dispatch next
		// calling login jsp as default new entry
		if (cmd != null) {
			try {
				ICommand command = (ICommand) Class.forName("command." + cmd).newInstance();
				urlSuivante = command.execute(request, response);
			} 
			catch (ClassNotFoundException | InstantiationException | IllegalAccessException e) {
				e.printStackTrace();
				urlSuivante = "/WEB-INF/jsp/unknowcmd.jsp";
			}


		}else {
			urlSuivante = "/WEB-INF/jsp/login.jsp";
		}
		//forward to the selected url 
		request.getRequestDispatcher(urlSuivante).forward( request, response );
	}
	
	
}
