package service;

import javax.servlet.http.HttpServletRequest;

import bean.BeanBrowser;

/**
 * @author florianpuzenat
 * Class used to call beanbrowser
 */
public class Service {
	
	/**
	 * @param request
	 * @return beanbrowser
	 */
	public static BeanBrowser getSessionBeanBrowser(HttpServletRequest request) {
		return ((BeanBrowser) request.getSession().getAttribute("beanBrowser"));
	}
}
