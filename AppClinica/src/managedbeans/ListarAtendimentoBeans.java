package managedbeans;


import java.util.ArrayList;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.faces.context.FacesContext;

import br.fanese.edu.cli.bo.AtendimentoBO;
import br.fanese.edu.cli.to.AtendimentoTO;

public class ListarAtendimentoBeans {
	
	private List<AtendimentoTO> atendimentos = new ArrayList<AtendimentoTO>();
	private String atendido;
	
	@PostConstruct
	public void init(){
		String vazia  = FacesContext.getCurrentInstance().getExternalContext().getRequestParameterMap().get("atendido");
		if(vazia!=null){
			atendido = vazia;
		}		
	}
	
	public List<AtendimentoTO> getAtendimentos() {
		return atendimentos;
	}
	public void setAtendimentos(List<AtendimentoTO> atendimentos) {
		this.atendimentos = atendimentos;
	}
	public String getAtendido() {
		return atendido;
	}
	public void setAtendido(String atendido) {
		this.atendido = atendido;
	}
	public String filtrar(){
		AtendimentoBO atendimentoBO = new AtendimentoBO();
		atendimentos = atendimentoBO.findByAtendido(atendido);
		return "listar";
	}
	
}
