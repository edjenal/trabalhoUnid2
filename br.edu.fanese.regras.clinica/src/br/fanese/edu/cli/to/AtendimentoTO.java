package br.fanese.edu.cli.to;

import java.sql.Date;

public class AtendimentoTO {
	
	private int codAtendimento;
	private Date dataCadastro;
	private Date dataConsulta;
	private int codCliente;
	private String CRM;
	private String atdRealizado; 
	
	
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
	
}
