package managedbeans;

import javax.annotation.PostConstruct;
import javax.faces.context.FacesContext;
import br.fanese.edu.cli.bo.AnamneseBO;
import br.fanese.edu.cli.bo.AtendimentoBO;
import br.fanese.edu.cli.to.AnamneseTO;

public class ListarAnamneseBeans {
	
	private AnamneseTO anamnese = new AnamneseTO();
	private int codAtendimento;
	private Boolean tem;
	private String descricao;
	private int codAnamnese;
	
	@PostConstruct
	public void init(){
		String vazia  = FacesContext.getCurrentInstance().getExternalContext().getRequestParameterMap().get("codigo");
		if(vazia!=null){
			codAtendimento = Integer.parseInt(vazia);
			getAnamnese();
		}		
		
	}
	
	public AnamneseTO getAnamnese() {
			AnamneseBO anamneseBO = new AnamneseBO();
			anamnese = anamneseBO.findByCodAtendimento(codAtendimento);
			tem = anamnese!=null ? true : false;
			if(tem){
				descricao = anamnese.getDescricao();
				codAnamnese = anamnese.getCodAnamnese();
			}
		return anamnese;
	}
	
	public void setAnamnese(AnamneseTO anamnese) {
		this.anamnese = anamnese;
	}
	
	public int getCodAtendimento() {
		return codAtendimento;
	}
	
	public void setCodAtendimento(int codAtendimento) {
		this.codAtendimento = codAtendimento;
	}

	public Boolean getTem() {
		return tem;
	}

	public void setTem(Boolean tem) {
		this.tem = tem;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public int getCodAnamnese() {
		return codAnamnese;
	}

	public void setCodAnamnese(int codAnamnese) {
		this.codAnamnese = codAnamnese;
	}
	
	public String Salvar(){
		try{
			AnamneseBO anamneseBO = new AnamneseBO();
			anamneseBO.insert(codAtendimento, descricao);
			return "/atendimento/listar";
		} catch (Exception e) {
			e.printStackTrace();
			return "";
		}
		
	}
	
	
}
