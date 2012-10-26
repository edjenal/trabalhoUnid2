package managedbeans;

import javax.faces.context.FacesContext;

import br.fanese.edu.cli.bo.AtendimentoBO;
import br.fanese.edu.cli.to.AtendimentoTO;

public class EditarAtendimentoBeans {
	private int codAtendimento;
	private AtendimentoTO atendimenTO = new AtendimentoTO();
	private String atendido;
	private Boolean mostrar;

	public int getCodAtendimento() {
		String vazia  = FacesContext.getCurrentInstance().getExternalContext().getRequestParameterMap().get("codigo");
		if(vazia!=null){
			codAtendimento = Integer.parseInt(vazia);
		}
		return codAtendimento;
	}

	public void setCodAtendimento(int codAtendimento) {
		this.codAtendimento = codAtendimento;
	}

	public AtendimentoTO getAtendimenTO() {
		AtendimentoBO atendimentoBO = new AtendimentoBO();
		atendimenTO = atendimentoBO.findByPrimaryKey(codAtendimento);
		atendido = atendimenTO.getAtdRealizado();
		mostrar = atendimenTO.getAtdRealizado().equalsIgnoreCase("S") ? true : false;
		return atendimenTO;
	}

	public void setAtendimenTO(AtendimentoTO atendimenTO) {
		this.atendimenTO = atendimenTO;
	}

	public String getAtendido() {
		return atendido;
	}

	public void setAtendido(String atendido) {
		this.atendido = atendido;
	}
	
	public Boolean getMostrar() {
		return mostrar;
	}

	public void setMostrar(Boolean mostrar) {
		this.mostrar = mostrar;
	}

	public String Salvar(){
		try{
			AtendimentoBO clienteBO = new AtendimentoBO();
			clienteBO.update(atendido, codAtendimento);
			return "listar";
		} catch (Exception e) {
			e.printStackTrace();
			return "";
		}
		
	}
	
}
