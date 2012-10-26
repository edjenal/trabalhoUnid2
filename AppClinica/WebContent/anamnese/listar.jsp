<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="f"  uri="http://java.sun.com/jsf/core"%>
<%@ taglib prefix="h"  uri="http://java.sun.com/jsf/html"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Anamnese</title>
</head>
<body>
	<f:view>
		<h:form>
			<!-- ListarAnamneseBeans -->
			<h:inputHidden value="#{ListarAnamneseBeans.codAtendimento}"/>
			<h:outputLabel value="Descricao da Anamnese:" /><br/>
	  		<h:inputTextarea value="#{ListarAnamneseBeans.descricao}" disabled="#{ListarAnamneseBeans.tem}"/>
	  		<br/> 
	  		<h:commandButton 
	  			value="Salvar" 
	  			action="#{ListarAnamneseBeans.Salvar}" disabled="#{ListarAnamneseBeans.tem}">
	  		</h:commandButton><br/>
	  		<h:commandButton 
	  			value="Voltar" 
	  			action="/atendimento/listar"/>
		</h:form>	
	</f:view>
</body>
</html>