<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="f"  uri="http://java.sun.com/jsf/core"%>
<%@ taglib prefix="h"  uri="http://java.sun.com/jsf/html"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Clientes</title>
</head>
<body>

<f:view>
<h:form>
	<h:commandButton value="Novo" action="novo"/>
	<h:dataTable value="#{ListarClienteBeans.clientes}" border="1" var="rs">
			<f:facet name="header">Lista de Clientes</f:facet >
			
			<h:column>
			    <f:facet name="header">
			    	<h:outputText value="Codigo" />
			    </f:facet>        
			    <h:outputText value="#{rs.nome}" />    
			</h:column>
			
			<h:column>
			    <f:facet name="header">
			    	<h:outputText value="Sexo" />
			    </f:facet>        
			    <h:outputText value="#{rs.sexoTela}" />    
			</h:column>
			
			<h:column>
	    		<f:facet name="header">
	    			<h:outputText value="Funções" />
	    		</f:facet>
	    		<h:commandButton value="Alterar" action="editar">
	    			<f:param value="#{rs.codCliente}" name="codigo"/>
	    		</h:commandButton>
	    		<h:commandButton value="Deletar" action="#{ListarClienteBeans.deletar}" onclick="if (!confirm('Quer realmente deletar esse Cliente?')) return false">
	    			<f:param value="#{rs.codCliente}" name="codigo"/>
	    		</h:commandButton>
			</h:column>

	
	</h:dataTable >
	
</h:form>
</f:view>

</body>
</html>