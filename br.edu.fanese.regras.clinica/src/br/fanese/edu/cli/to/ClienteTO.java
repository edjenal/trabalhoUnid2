package br.fanese.edu.cli.to;

import java.sql.Date;

public class ClienteTO {
	
	private int codCliente;
	private String nome;
	private String sexo;
	private String sexoTela;
	private Date dataNascimento;
    private String logadouro;
    private String cep;
    private String cidade;
    private String UF;
    private String telefoneResidencial;
    private String telefoneCelular;
    private int qtdDependentes;
    private String identidade;
    private String orgaoExpedidor;
    private int codConvenio;
    private String matriculaConvenio;
    private String validadeConvenio;
    private String nomeConvenio;
    
	public int getCodCliente() {
		return codCliente;
	}
	public void setCodCliente(int codCliente) {
		this.codCliente = codCliente;
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
	public String getSexoTela() {
		return getSexo().equalsIgnoreCase("M") ? "Masculino" : "Feminino";
	}
	public void setSexoTela(String sexoTela) {
		this.sexoTela = sexoTela;
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
	public int getQtdDependentes() {
		return qtdDependentes;
	}
	public void setQtdDependentes(int qtdDependentes) {
		this.qtdDependentes = qtdDependentes;
	}
	public String getIdentidade() {
		return identidade;
	}
	public void setIdentidade(String identidade) {
		this.identidade = identidade;
	}
	public String getOrgaoExpedidor() {
		return orgaoExpedidor;
	}
	public void setOrgaoExpedidor(String orgaoExpedidor) {
		this.orgaoExpedidor = orgaoExpedidor;
	}
	public int getCodConvenio() {
		return codConvenio;
	}
	public void setCodConvenio(int codConvenio) {
		this.codConvenio = codConvenio;
	}
	public String getMatriculaConvenio() {
		return matriculaConvenio;
	}
	public void setMatriculaConvenio(String matriculaConvenio) {
		this.matriculaConvenio = matriculaConvenio;
	}
	public String getValidadeConvenio() {
		return validadeConvenio;
	}
	public void setValidadeConvenio(String validadeConvenio) {
		this.validadeConvenio = validadeConvenio;
	}
	public String getNomeConvenio() {
		return nomeConvenio;
	}
	public void setNomeConvenio(String nomeConvenio) {
		this.nomeConvenio = nomeConvenio;
	}
    
    
}
