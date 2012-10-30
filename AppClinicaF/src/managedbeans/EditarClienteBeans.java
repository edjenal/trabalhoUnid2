package managedbeans;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import javax.faces.context.FacesContext;
import br.fanese.edu.cli.bo.ClienteBO;
import br.fanese.edu.cli.bo.ConvenioBO;
import br.fanese.edu.cli.to.ClienteTO;
import br.fanese.edu.cli.to.ConvenioTO;

public class EditarClienteBeans {
	
	private ClienteTO cliente;
	private int codigo;
	private List<ConvenioTO> convenio;
	private String nome;
	private String sexo;
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
    
	
	public ClienteTO getCliente() {
		ClienteBO clienteBO = new ClienteBO();
		cliente = clienteBO.findByPrimaryKey(getCodigo());
		nome = cliente.getNome();
		sexo = cliente.getSexo();
		dataNascimento = cliente.getDataNascimento();
		logadouro = cliente.getLogadouro();
		cep = cliente.getCep();
		cidade = cliente.getCidade();
		UF = cliente.getUF();
		telefoneResidencial = cliente.getTelefoneResidencial();
		telefoneCelular = cliente.getTelefoneCelular();
		qtdDependentes = cliente.getQtdDependentes();
		identidade = cliente.getIdentidade();
		orgaoExpedidor = cliente.getOrgaoExpedidor();
		codConvenio = cliente.getCodConvenio(); 
		matriculaConvenio = cliente.getMatriculaConvenio();
		validadeConvenio = cliente.getValidadeConvenio();
		return cliente;
	}
	public void setCliente(ClienteTO cliente) {
		this.cliente = cliente;
	}
	public int getCodigo() {
		String vazia = FacesContext.getCurrentInstance().getExternalContext().getRequestParameterMap().get("codigo");
		if(vazia!=null){
			codigo = Integer.parseInt(vazia);
		} 	
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public List<ConvenioTO> getConvenio() {
		ConvenioBO convenioBO = new ConvenioBO();
		return convenioBO.findAll();
	}
	public void setConvenio(List<ConvenioTO> convenio) {
		this.convenio = convenio;
	}
	
	public String getNome() {
		getCliente();
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
	public String Salvar(){
		try{
			//.replaceAll("[^0-9]", "")
			java.sql.Date data = new java.sql.Date(dataNascimento.getTime());
			ClienteBO clienteBO = new ClienteBO();
			clienteBO.update(nome, sexo, data, logadouro, cep.replaceAll("[^0-9]", ""), cidade, UF, telefoneResidencial.replaceAll("[^0-9]", ""), 
					telefoneCelular.replaceAll("[^0-9]", ""), qtdDependentes, identidade, orgaoExpedidor, codConvenio, 
					matriculaConvenio, validadeConvenio.replaceAll("[^0-9]", ""), codigo);
			return "listar";
		} catch (Exception e) {
			e.printStackTrace();
			return "";
		}
		
	}

	
}
