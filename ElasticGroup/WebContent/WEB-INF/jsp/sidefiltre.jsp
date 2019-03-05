<%@page import="bean.BeanBrowser" %>
<%@page import="bean.BlocFiltre" %>
<%@page import="bean.Filtre" %>
<%@page import="service.Service" %>

<% for (BlocFiltre indiceBlocFiltre : Service.getSessionBeanBrowser(request).getListBlocFiltre()) { %>
<fieldset id= "indiceBlocFiltre.getFieldIdBlocFiltre()">

	<legend><%= indiceBlocFiltre.getLibelleBlocFiltre() %></legend>
	
 	<% for (Filtre indiceFiltre : indiceBlocFiltre.getListFiltre()) { %>
  		<input type="checkbox" 
  			id="<%= indiceBlocFiltre.getLibelleBlocFiltre()+ " " +indiceFiltre.getLibelleFiltre() %>" 
  			name="<%= indiceBlocFiltre.getLibelleBlocFiltre()+ " " +indiceFiltre.getLibelleFiltre() %>"
  			<%= indiceFiltre.getChecked()%>
  		>
  			
  		<label 
  		
  		for="<%= indiceBlocFiltre.getLibelleBlocFiltre()+ " " +indiceFiltre.getLibelleFiltre() %>"
  		>
  		<% if( indiceFiltre.getColorFiltre() != null) { %>
  			<div 
  				style='width:30px;height:20px; display:inline-block; background-color:<%= indiceFiltre.getColorFiltre() %>'
  			> 
  			</div>
  		<%} %>
  			<%= indiceFiltre.getLibelleFiltre() %>
  		</label>
  		<br>
	<%} %>

</fieldset>
<%} %>
