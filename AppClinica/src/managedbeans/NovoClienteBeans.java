package managedbeans;

import java.util.Date;
import java.util.List;

import br.fanese.edu.cli.bo.ClienteBO;
import br.fanese.edu.cli.bo.ConvenioBO;
import br.fanese.edu.cli.to.ConvenioTO;

public class NovoClienteBeans {
	
	private int codCliente;
	private String nome;
	private String sexo;
	private Date dataNascimento;
    private String logradouro;
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
    
    private List<ConvenioTO> convenio;
    
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
	public Date getDataNascimento() {
		return dataNascimento;
	}
	public void setDataNascimento(Date dataNascimento) {
		this.dataNascimento = dataNascimento;
	}
	public String getLogradouro() {
		return logradouro;
	}
	public void setLogadouro(String logradouro) {
		this.logradouro = logradouro;
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
	
	public List<ConvenioTO> getConvenio() {
		ConvenioBO convenioBO = new ConvenioBO();
		return convenioBO.findAll();
	}
	public void setConvenio(List<ConvenioTO> convenio) {
		this.convenio = convenio;
	}
	public String Inserir(){
		try{
			ClienteBO clienteBO = new ClienteBO();
			clienteBO.insert(nome, sexo, new java.sql.Date(dataNascimento.getTime()), logradouro, cep, cidade, UF, telefoneResidencial, 
					telefoneCelular, qtdDependentes, identidade, orgaoExpedidor, codConvenio, 
					matriculaConvenio, validadeConvenio);
			return "listar";
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
		
	}
	    
}
