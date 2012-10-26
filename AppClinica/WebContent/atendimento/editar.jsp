<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="f"  uri="http://java.sun.com/jsf/core"%>
<%@ taglib prefix="h"  uri="http://java.sun.com/jsf/html"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Editar Atendimento</title>
</head>
<body>
<f:view>
	<h:form>
			<h:inputHidden value="#{EditarAtendimentoBeans.codAtendimento}"></h:inputHidden>
			<h:outputLabel value="Nome do cliente:" />
	  		<h:outputLabel value="#{EditarAtendimentoBeans.atendimenTO.nomeCLiente}"/>
	  		<br/>
	  		<h:outputLabel value="Nome do médico:" />
	  		<h:outputLabel value="#{EditarAtendimentoBeans.atendimenTO.nomeMedico}"/>
	  		<br/>
	  		<h:outputLabel value="Data da consulta:" />
	  		<h:outputLabel value="#{EditarAtendimentoBeans.atendimenTO.dataConsulta}"/>
	  		<br/>
	  		<h:outputLabel value="Data de cadastro: " />
	  		<h:outputLabel value="#{EditarAtendimentoBeans.atendimenTO.dataCadastro}"/>
	  		<br/>
	  		<h:outputLabel value="Atedimento:" for="atedimento"/>
	  		<h:selectOneMenu id="atedimento" value="#{EditarAtendimentoBeans.atendido}" disabled="#{EditarAtendimentoBeans.mostrar}">
	  			<f:selectItem itemValue="S" itemLabel="Sim"/>
	  			<f:selectItem itemValue="N" itemLabel="Não"/>
	  		</h:selectOneMenu>
	  		<h:commandButton 
	  			value="Salvar" 
	  			action="#{EditarAtendimentoBeans.Salvar()}" disabled="#{EditarAtendimentoBeans.mostrar}">
	  		</h:commandButton>
	  		<h:commandButton 
	  			value="Cancelar" 
	  			action="listar"
	  			immediate="true" />
	 </h:form>
</f:view>
</body>
</html>