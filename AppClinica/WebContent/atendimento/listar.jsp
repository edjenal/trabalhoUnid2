<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="f"  uri="http://java.sun.com/jsf/core"%>
<%@ taglib prefix="h"  uri="http://java.sun.com/jsf/html"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Listar Atendimentos</title>
</head>
<body>
	<f:view>
		<h:form>
			<h:selectOneMenu id="sexo" value="#{ListarAtendimentoBeans.atendido}">
	  			<f:selectItem itemValue="S" itemLabel="Sim"/>
	  			<f:selectItem itemValue="N" itemLabel="Não"/>
	  		</h:selectOneMenu>
	  		
	  		<h:commandButton value="Filtrar" action="#{ListarAtendimentoBeans.filtrar}">
	  			<f:param value="#{ListarAtendimentoBeans.atendido}" name="atendido"/>
	  		</h:commandButton>
	  		
	  		<h:dataTable value="#{ListarAtendimentoBeans.atendimentos}" border="1" var="rs">
				<f:facet name="header">Lista de Clientes</f:facet >
				
				<h:column>
				    <f:facet name="header">
				    	<h:outputText value="Código do atendimento" />
				    </f:facet>        
				    <h:outputText value="#{rs.codAtendimento}" />    
				</h:column>
				
				<h:column>
				    <f:facet name="header">
				    	<h:outputText value="Data da consulta" />
				    </f:facet>        
				    <h:outputText value="#{rs.dataConsulta}" />    
				</h:column>
				
				<h:column>
				    <f:facet name="header">
				    	<h:outputText value="Data do cadastro" />
				    </f:facet>        
				    <h:outputText value="#{rs.dataCadastro}" />    
				</h:column>
				
				<h:column>
				    <f:facet name="header">
				    	<h:outputText value="Nome do médico" />
				    </f:facet>        
				    <h:outputText value="#{rs.nomeMedico}" />    
				</h:column>
				
				<h:column>
				    <f:facet name="header">
				    	<h:outputText value="Nome cliente" />
				    </f:facet>        
				    <h:outputText value="#{rs.nomeCLiente}" />    
				</h:column>
				
				<h:column>
				    <f:facet name="header">
				    	<h:outputText value="Atendido" />
				    </f:facet>        
				    <h:outputText value="#{rs.atendimento}" />    
				</h:column>
				
				<h:column>
		    		<f:facet name="header">
		    			<h:outputText value="Funções" />
		    		</f:facet>
		    		<h:commandButton value="Editar" action="editar">
		    			<f:param value="#{rs.codAtendimento}" name="codigo"/>
		    		</h:commandButton>
				</h:column>
	
		
			</h:dataTable >
	  		
		</h:form>	
	</f:view>
</body>
</html>