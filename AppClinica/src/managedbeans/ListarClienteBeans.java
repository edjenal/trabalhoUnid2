package managedbeans;

import java.util.List;

import javax.faces.context.FacesContext;

import br.fanese.edu.cli.bo.ClienteBO;
import br.fanese.edu.cli.to.ClienteTO;

public class ListarClienteBeans {

	private List<ClienteTO> clientes;
	private int codigo;

	public List<ClienteTO> getClientes() {
		ClienteBO clienteBO = new ClienteBO();		
		return clienteBO.findAll();
	}

	public void setClientes(List<ClienteTO> clientes) {
		this.clientes = clientes;
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

	public String deletar(){
		try {
			ClienteBO clienteBO = new ClienteBO();
			clienteBO.remove(getCodigo());
			return "listar";
		}catch (Exception e) {
			// TODO: handle exception
			return null;
		}
	}
	
}
