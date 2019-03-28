package command;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @author florianpuzenat
 * @see controler.FrontController
 * command return JPS catologue 
 */
public class CommandFiltre implements ICommand {

	@Override
	public String execute(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		
		return "/WEB-INF/jsp/catalogue.jsp";	
		}

}
