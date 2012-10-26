package managedbeans;


import java.util.ArrayList;
import java.util.List;

import javax.faces.context.FacesContext;

import br.fanese.edu.cli.bo.AtendimentoBO;
import br.fanese.edu.cli.to.AtendimentoTO;

public class ListarAtendimentoBeans {
	
	private List<AtendimentoTO> atendimentos = new ArrayList<AtendimentoTO>();
	private String atendido = "S";
	
	public List<AtendimentoTO> getAtendimentos() {
		AtendimentoBO atendimentoBO = new AtendimentoBO();
		atendimentos = atendimentoBO.findByAtendido(atendido);
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
	public void filtrar(){
		AtendimentoBO atendimentoBO = new AtendimentoBO();
		atendimentos = atendimentoBO.findByAtendido(atendido);
	}
	
}
