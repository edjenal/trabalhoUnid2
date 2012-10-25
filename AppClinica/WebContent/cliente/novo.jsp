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
	  		<h:inputText id="nome" value="#{NovoClienteBeans.nome}"/>
	  		<br/>
	  		<h:outputLabel value="Sexo:" for="sexo"/>
	  		<h:selectOneMenu id="sexo" value="#{NovoClienteBeans.sexo}">
	  			<f:selectItem itemValue="M" itemLabel="Masculino"/>
	  			<f:selectItem itemValue="F" itemLabel="Feminino"/>
	  		</h:selectOneMenu>
	  		<br/>
	  		<h:outputLabel value="Data De Nascimento:" for="dataNascimento"/>
	  		<h:inputText id="dataNascimento" value="#{NovoClienteBeans.dataNascimento}"/>
	  		<br/>
	  		<h:outputLabel value="Logradouro:" for="logradouro"/>
	  		<h:inputText id="logradouro" value="#{NovoClienteBeans.logadouro}"/>
	  		<br/>
	  		<h:outputLabel value="CEP:" for="cep"/>
	  		<h:inputText id="cep" value="#{NovoClienteBeans.cep}"/>
	  		<br/>
	  		<h:outputLabel value="Cidade:" for="cidade"/>
	  		<h:inputText id="cidade" value="#{NovoClienteBeans.cidade}"/>
	  		<br/>
	  		<h:outputLabel value="UF:" for="uf"/>
	  		<h:selectOneMenu id="uf" value="#{EditarClienteBeans.UF}">
	  			<f:selectItem itemValue="AC" itemLabel="Acre"/>
	  			<f:selectItem itemValue="AL" itemLabel="Alagoas"/>
	  			<f:selectItem itemValue="AM" itemLabel="Amazonas"/>
	  			<f:selectItem itemValue="AP" itemLabel="Amapa"/>
	  			<f:selectItem itemValue="BA" itemLabel="Bahia"/>
	  			<f:selectItem itemValue="CE" itemLabel="Ceara"/>
	  			<f:selectItem itemValue="DF" itemLabel="Distrito Federal"/>
	  			<f:selectItem itemValue="ES" itemLabel="Espirito Santo"/>
	  			<f:selectItem itemValue="MA" itemLabel="Maranhao"/>
	  			<f:selectItem itemValue="MG" itemLabel="Minas Gerais"/>
	  			<f:selectItem itemValue="MS" itemLabel="Mato Grosso do Sul"/>
	  			<f:selectItem itemValue="MT" itemLabel="Mato Grosso"/>
	  			<f:selectItem itemValue="PA" itemLabel="Para"/>
	  			<f:selectItem itemValue="PB" itemLabel="Paraiba"/>
	  			<f:selectItem itemValue="PE" itemLabel="Pernambuco"/>
	  			<f:selectItem itemValue="PI" itemLabel="Piaui"/>
	  			<f:selectItem itemValue="PR" itemLabel="Parana"/>
	  			<f:selectItem itemValue="RJ" itemLabel="Rio de Janeiro"/>
	  			<f:selectItem itemValue="RN" itemLabel="Rio Grande do Norte"/>
	  			<f:selectItem itemValue="RO" itemLabel="Rondonia"/>
	  			<f:selectItem itemValue="RR" itemLabel="Roraima"/>
	  			<f:selectItem itemValue="RS" itemLabel="Rio Grande do Sul"/>
	  			<f:selectItem itemValue="SC" itemLabel="Santa Catarina"/>
	  			<f:selectItem itemValue="SE" itemLabel="Sergipe"/>
	  			<f:selectItem itemValue="SP" itemLabel="Sao Paulo"/>
	  			<f:selectItem itemValue="TO" itemLabel="Tocantins"/>
	  		</h:selectOneMenu>
	  		<br/>
	  		<h:outputLabel value="Telefone Residencial:" for="telefoneResidencial"/>
	  		<h:inputText id="telefoneResidencial" value="#{NovoClienteBeans.telefoneResidencial}"/>
	  		<br/>
	  		<h:outputLabel value="Telefone Celular:" for="telefoneCelular"/>
	  		<h:inputText id="telefoneCelular" value="#{NovoClienteBeans.telefoneCelular}"/>
	  		<br/>
	  		<h:outputLabel value="Quantidade de dependentes:" for="qtdDependentes"/>
	  		<h:inputText id="qtdDependentes" value="#{NovoClienteBeans.qtdDependentes}"/>
	  		<br/>
	  		<h:outputLabel value="Identidade:" for="identidade"/>
	  		<h:inputText id="identidade" value="#{NovoClienteBeans.identidade}"/>
	  		<br/>
	  		<h:outputLabel value="Orgao Expedidor:" for="orgaoExpedidor"/>
	  		<h:inputText id="orgaoExpedidor" value="#{NovoClienteBeans.orgaoExpedidor}"/>
	  		<br/>
	  		<h:outputLabel value="Convenio:" for="codConvenio"/>
	  		<h:selectOneMenu id="codConvenio" value="#{NovoClienteBeans.codConvenio}"> 
				<f:selectItems value="#{NovoClienteBeans.convenio}"  var="convenio" itemLabel="#{convenio.descricao}" itemValue="#{convenio.codConvenio}"/>
			</h:selectOneMenu>
	  		<br/>
	  		<h:outputLabel value="Matricula do convenio:" for="matricula"/>
	  		<h:inputText id="matricula" value="#{NovoClienteBeans.matriculaConvenio}"/>
	  		<br/>
	  		<h:outputLabel value="Validade do convenio:" for="validade"/>
	  		<h:inputText id="validade" value="#{NovoClienteBeans.validadeConvenio}"/>
	  		<br/>
	  		<br/>
	  		 <h:commandButton 
	  			value="Cadastrar" 
	  			action="#{NovoClienteBeans.Inserir}" />
		</h:form>	
	</f:view>
</body>
</html>