<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="f"  uri="http://java.sun.com/jsf/core"%>
<%@ taglib prefix="h"  uri="http://java.sun.com/jsf/html"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Cadastrar Cliente</title>
</head>
<body>
	<f:view>
		<h:form>
			<h:outputLabel value="Nome:" for="nome"/>
	  		<br/>
	  		<h:inputText id="nome" value="#{NovoClienteBeans.nome}"/>
	  		<br/>
	  		<h:outputLabel value="Sexo:" for="sexo"/>
	  		<h:selectOneMenu id="sexo" value="#{NovoClienteBeans.sexo}">
	  			<f:selectItem itemValue="M" itemLabel="Masculino"/>
	  			<f:selectItem itemValue="F" itemLabel="Feminino"/>
	  		</h:selectOneMenu>
	  		<br/>
	  		<h:outputLabel value="Data De Nascimento:" for="dataNascimento"/>
	  		<br/>
	  		<h:inputText id="dataNascimento" value="#{NovoClienteBeans.dataNascimento}"/>
	  		<br/>
	  		<h:outputLabel value="Logradouro:" for="logradouro"/>
	  		<br/>
	  		<h:inputText id="logradouro" value="#{NovoClienteBeans.logadouro}"/>
	  		<br/>
	  		<h:outputLabel value="CEP:" for="cep"/>
	  		<br/>
	  		<h:inputText id="cep" value="#{NovoClienteBeans.cep}"/>
	  		<br/>
	  		<h:outputLabel value="Cidade:" for="cidade"/>
	  		<br/>
	  		<h:inputText id="cidade" value="#{NovoClienteBeans.cidade}"/>
	  		<br/>
	  		<h:outputLabel value="UF:" for="uf"/>
	  		<br/>
	  		<h:inputText id="uf" value="#{NovoClienteBeans.UF}"/>
	  		<br/>
	  		<h:outputLabel value="Telefone Residencial:" for="telefoneResidencial"/>
	  		<br/>
	  		<h:inputText id="telefoneResidencial" value="#{NovoClienteBeans.telefoneResidencial}"/>
	  		<br/>
	  		<h:outputLabel value="Telefone Celular:" for="telefoneCelular"/>
	  		<br/>
	  		<h:inputText id="telefoneCelular" value="#{NovoClienteBeans.telefoneCelular}"/>
	  		<br/>
	  		<h:outputLabel value="Quantidade de dependentes:" for="qtdDependentes"/>
	  		<br/>
	  		<h:inputText id="qtdDependentes" value="#{NovoClienteBeans.qtdDependentes}"/>
	  		<br/>
	  		<h:outputLabel value="Identidade:" for="identidade"/>
	  		<br/>
	  		<h:inputText id="identidade" value="#{NovoClienteBeans.identidade}"/>
	  		<br/>
	  		<h:outputLabel value="Orgao Expedidor:" for="orgaoExpedidor"/>
	  		<br/>
	  		<h:inputText id="orgaoExpedidor" value="#{NovoClienteBeans.orgaoExpedidor}"/>
	  		<br/>
	  		<h:outputLabel value="Convenio:" for="codConvenio"/>
	  		<h:selectOneMenu id="codConvenio" value="#{NovoClienteBeans.codConvenio}"> 
				<f:selectItems value="#{NovoClienteBeans.convenio}"  var="convenio" itemLabel="#{convenio.descricao}" itemValue="#{convenio.codConvenio}"/>
			</h:selectOneMenu>
	  		<br/>
	  		<h:outputLabel value="Matricula do convenio:" for="matricula"/>
	  		<br/>
	  		<h:inputText id="matricula" value="#{NovoClienteBeans.matriculaConvenio}"/>
	  		<br/>
	  		<h:outputLabel value="Validade do convenio:" for="validade"/>
	  		<br/>
	  		<h:inputText id="validade" value="#{NovoClienteBeans.validadeConvenio}"/>
	  		<br/>
	  		<br/>
	  		 <h:commandButton 
	  			value="Cadastrar Tanque" 
	  			action="#{NovoClienteBeans.Inserir}" />
		</h:form>	
	</f:view>
</body>
</html>