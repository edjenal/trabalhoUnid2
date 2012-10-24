package br.fanese.edu.cli.to;

import java.util.Date;

public class MedicoTO {
	
	private String CRM;
	private String nome;
	private String sexo;
	private Date dataNascimento;
	private String logadouro;
	private String cep;
	private String cidade;
	private String UF;
	private String telefoneResidencial;
	private String telefoneCelular;
	private int tempoMedioAtendimento;
	
	public String getCRM() {
		return CRM;
	}
	public void setCRM(String cRM) {
		CRM = cRM;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getSexo() {
		return sexo;
	}
	public void setSexo(String sexo) {
		this.sexo = sexo;
	}
	public Date getDataNascimento() {
		return dataNascimento;
	}
	public void setDataNascimento(Date dataNascimento) {
		this.dataNascimento = dataNascimento;
	}
	public String getLogadouro() {
		return logadouro;
	}
	public void setLogadouro(String logadouro) {
		this.logadouro = logadouro;
	}
	public String getCep() {
		return cep;
	}
	public void setCep(String cep) {
		this.cep = cep;
	}
	public String getCidade() {
		return cidade;
	}
	public void setCidade(String cidade) {
		this.cidade = cidade;
	}
	public String getUF() {
		return UF;
	}
	public void setUF(String uF) {
		UF = uF;
	}
	public String getTelefoneResidencial() {
		return telefoneResidencial;
	}
	public void setTelefoneResidencial(String telefoneResidencial) {
		this.telefoneResidencial = telefoneResidencial;
	}
	public String getTelefoneCelular() {
		return telefoneCelular;
	}
	public void setTelefoneCelular(String telefoneCelular) {
		this.telefoneCelular = telefoneCelular;
	}
	public int getTempoMedioAtendimento() {
		return tempoMedioAtendimento;
	}
	public void setTempoMedioAtendimento(int tempoMedioAtendimento) {
		this.tempoMedioAtendimento = tempoMedioAtendimento;
	}

}
