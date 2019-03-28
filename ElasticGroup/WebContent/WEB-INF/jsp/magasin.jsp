<%@page import="bean.BeanBrowser"%>
<%@page import="service.Service"%>

<div>
	<%= Service.getSessionBeanBrowser(request).getRequeteFiltre() %>

</div>