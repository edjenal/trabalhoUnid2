package br.fanese.edu.cli.to;

import java.sql.Date;

public class AtendimentoTO {
	
	private int codAtendimento;
	private Date dataCadastro;
	private Date dataConsulta;
	private int codCliente;
	private String CRM;
	private String atdRealizado;
	
	private String nomeCLiente;
	private String nomeMedico;
	private String atendimento;
	
	public int getCodAtendimento() {
		return codAtendimento;
	}
	public void setCodAtendimento(int codAtendimento) {
		this.codAtendimento = codAtendimento;
	}
	public Date getDataCadastro() {
		return dataCadastro;
	}
	public void setDataCadastro(Date dataCadastro) {
		this.dataCadastro = dataCadastro;
	}
	public Date getDataConsulta() {
		return dataConsulta;
	}
	public void setDataConsulta(Date dataConsulta) {
		this.dataConsulta = dataConsulta;
	}
	public int getCodCliente() {
		return codCliente;
	}
	public void setCodCliente(int codCliente) {
		this.codCliente = codCliente;
	}
	public String getCRM() {
		return CRM;
	}
	public void setCRM(String cRM) {
		CRM = cRM;
	}
	public String getAtdRealizado() {
		return atdRealizado;
	}
	public void setAtdRealizado(String atdRealizado) {
		this.atdRealizado = atdRealizado;
	}
	public String getNomeCLiente() {
		return nomeCLiente;
	}
	public void setNomeCLiente(String nomeCLiente) {
		this.nomeCLiente = nomeCLiente;
	}
	public String getNomeMedico() {
		return nomeMedico;
	}
	public void setNomeMedico(String nomeMedico) {
		this.nomeMedico = nomeMedico;
	}
	public String getAtendimento() {
		return getAtdRealizado().equalsIgnoreCase("S") ? "Sim" : "N‹o";
	}
	public void setAtendimento(String atendimento) {
		this.atendimento = atendimento;
	}
	
	
}
