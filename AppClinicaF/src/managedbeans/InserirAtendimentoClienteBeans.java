package managedbeans;

import java.text.SimpleDateFormat;
import java.util.List;

import javax.faces.context.FacesContext;

import br.fanese.edu.cli.bo.AtendimentoBO;
import br.fanese.edu.cli.bo.MedicoBO;
import br.fanese.edu.cli.to.MedicoTO;

public class InserirAtendimentoClienteBeans {
	
	private int codigo;
	
	private List<MedicoTO> medico;

	private String dataConsulta;
	private String CRM;
	

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

	public List<MedicoTO> getMedico() {
		MedicoBO medicoBO = new MedicoBO();
		return medicoBO.findAll();
	}

	public void setMedico(List<MedicoTO> medico) {
		this.medico = medico;
	}

	public String getDataConsulta() {
		return dataConsulta;
	}

	public void setDataConsulta(String dataConsulta) {
		this.dataConsulta = dataConsulta;
	}

	public String getCRM() {
		return CRM;
	}

	public void setCRM(String cRM) {
		CRM = cRM;
	}
	
	public String Inserir(){
		try{
			SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
			java.sql.Date data = new java.sql.Date(format.parse(dataConsulta).getTime());
			AtendimentoBO atendimentoBO = new AtendimentoBO();
			atendimentoBO.insert(data, codigo, CRM, "N");
			return "listar";
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
		
	}
}
