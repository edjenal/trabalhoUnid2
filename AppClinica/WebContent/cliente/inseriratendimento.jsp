<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="f"  uri="http://java.sun.com/jsf/core"%>
<%@ taglib prefix="h"  uri="http://java.sun.com/jsf/html"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Cadastrar Atendimento</title>
</head>
<body>
	<f:view>
	<h:form>
		<h:inputHidden value="#{InserirAtendimentoClienteBeans.codigo}"/>
		<br/>
		<h:outputLabel value="Data da consulta:" for="dataConsulta"/>
  		<h:inputText id="dataConsulta" value="#{InserirAtendimentoClienteBeans.dataConsulta}">
  			<f:convertDateTime type="date" dateStyle="short" pattern="yyyy-MM-dd"/>
  		</h:inputText>
  		<br/>
  		
		
		<h:outputLabel value="Medico:" for="crm"/>
		<h:selectOneMenu id="crm" value="#{InserirAtendimentoClienteBeans.CRM}"> 
			<f:selectItems value="#{InserirAtendimentoClienteBeans.medico}"  var="medico" itemLabel="#{medico.nome}" itemValue="#{medico.CRM}"/>
		</h:selectOneMenu>
  		<br/><%-- 
  		<h:outputLabel value="Atendimento Realizado:" for="atdRealizado"/>
  		<h:selectOneMenu id="atdRealizado" value="#{InserirAtendimentoClienteBeans.atdRealizado}">
  			<f:selectItem itemValue="S" itemLabel="Sim"/>
  			<f:selectItem itemValue="N" itemLabel="Nao"/>
  		</h:selectOneMenu> --%>
  		<br/>
		<br/>
		<br/>
		 <h:commandButton 
			value="Confirmar" 
			action="#{InserirAtendimentoClienteBeans.Inserir}" >
			<f:param value="#{InserirAtendimentoClienteBeans.codigo}" name="codigo"/>	
		</h:commandButton>
		<h:commandButton 
			value="Cancelar" 
			action="listar"
			immediate="true" />
	</h:form>
	</f:view>
</body>
</html>