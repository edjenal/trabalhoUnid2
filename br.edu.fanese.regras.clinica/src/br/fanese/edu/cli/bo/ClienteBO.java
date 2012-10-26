package br.fanese.edu.cli.bo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.sql.Date;
import java.util.List;

import br.fanese.edu.cli.to.ClienteTO;


public class ClienteBO {
	private String SQL_create =	"insert into clientes(nome, sexo, dataNascimento, logradouro, " +
			"cep, cidade, uf, telefoneresidencial, telefonecelular, qtddependentes, identidade, orgaoexpedidor, codConvenio, matriculaconvenio, validadeconvenio) " +
			"values (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
	private String SQL_update = "update clientes set " +
			"nome = ?, sexo = ?, dataNascimento = ?, logradouro = ?, cep = ?, cidade = ?, uf = ?, telefoneresidencial = ?, " +
			"telefonecelular = ?, qtddependentes = ?, identidade = ?, orgaoexpedidor = ?, codConvenio = ?, matriculaconvenio = ?, validadeconvenio = ? " +
			"where codCliente = ?";
	private String SQL_remove= "delete from clientes where codCliente = ?";
	private String SQL_findByPrimayKey="select codCliente, nome, sexo, dataNascimento, logradouro, cep, cidade, uf, telefoneresidencial, telefonecelular, qtddependentes, " +
			"identidade, orgaoexpedidor, clientes.codConvenio, matriculaconvenio, validadeconvenio, descricao " +
			"from clientes inner join convenios on convenios.codConvenio = clientes.codConvenio where codCliente = ?";
	private String SQL_findAll="select codCliente, nome, sexo, dataNascimento, logradouro, cep, cidade, uf, telefoneresidencial, telefonecelular, qtddependentes, " +
			"identidade, orgaoexpedidor, clientes.codConvenio, matriculaconvenio, validadeconvenio, descricao " +
			"from clientes inner join convenios on convenios.codConvenio = clientes.codConvenio";
	
	public boolean insert(String nome, String sexo, Date dataNascimento, String logradouro, 
			String cep, String cidade, String UF, String telefoneResidencial, String telefoneCelular, 
			int qtdDependentes, String identidade, String orgaoExpedidor, int codConvenio, String matriculaConvenio, String validadeConvenio) {
		boolean retorno = true;
		try {
			Connection con = Conexao.getConnection();
			PreparedStatement st = con.prepareStatement(SQL_create);
			st.setString(1, nome);
			st.setString(2, sexo);
			st.setDate(3, dataNascimento);
			st.setString(4, logradouro);
			st.setString(5, cep);
			st.setString(6, cidade);
			st.setString(7, UF);
			st.setString(8, telefoneResidencial);
			st.setString(9, telefoneCelular);
			st.setInt(10, qtdDependentes);
			st.setString(11, identidade);
			st.setString(12, orgaoExpedidor);
			st.setInt(13, codConvenio);
			st.setString(14, matriculaConvenio);
			st.setString(15, validadeConvenio);
			retorno = st.execute();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			retorno = false;
		}
		return retorno;
	}
		
	public ClienteTO findByPrimaryKey(int cod){
		try{
			Connection con = Conexao.getConnection();
			PreparedStatement st = con.prepareStatement(SQL_findByPrimayKey);
			st.setInt(1, cod);
			ResultSet rs = st.executeQuery();
			if(rs.next()){
				ClienteTO clienteTO = new ClienteTO();
				clienteTO.setCodCliente(rs.getInt("codCliente"));
				clienteTO.setNome(rs.getString("nome"));
				clienteTO.setSexo(rs.getString("sexo"));
				clienteTO.setDataNascimento(rs.getDate("dataNascimento"));
				clienteTO.setLogadouro(rs.getString("logradouro"));
				clienteTO.setCep(rs.getString("cep"));
				clienteTO.setCidade(rs.getString("cidade"));
				clienteTO.setUF(rs.getString("uf"));
				clienteTO.setTelefoneResidencial(rs.getString("telefoneresidencial"));
				clienteTO.setTelefoneCelular(rs.getString("telefonecelular"));
				clienteTO.setQtdDependentes(rs.getInt("qtddependentes"));
				clienteTO.setIdentidade(rs.getString("identidade"));
				clienteTO.setOrgaoExpedidor(rs.getString("orgaoexpedidor"));
				clienteTO.setCodConvenio(rs.getInt("codConvenio"));
				clienteTO.setMatriculaConvenio(rs.getString("matriculaconvenio"));
				clienteTO.setValidadeConvenio(rs.getString("validadeconvenio"));
				clienteTO.setNomeConvenio(rs.getString("descricao"));
				return clienteTO;
				} else 
					return null;
		} catch (Exception e){
			e.printStackTrace();
			return null;
		}
	}
	
	public List<ClienteTO> findAll() {
		List<ClienteTO> resultado = new ArrayList<ClienteTO>();
		try {
			Connection con = Conexao.getConnection();
			Statement st = con.createStatement();
			ResultSet rs = st.executeQuery(SQL_findAll);
			while (rs.next()) {
				ClienteTO clienteTO = new ClienteTO();
				clienteTO.setCodCliente(rs.getInt("codCliente"));
				clienteTO.setNome(rs.getString("nome"));
				clienteTO.setSexo(rs.getString("sexo"));
				clienteTO.setDataNascimento(rs.getDate("dataNascimento"));
				clienteTO.setLogadouro(rs.getString("logradouro"));
				clienteTO.setCep(rs.getString("cep"));
				clienteTO.setCidade(rs.getString("cidade"));
				clienteTO.setUF(rs.getString("uf"));
				clienteTO.setTelefoneResidencial(rs.getString("telefoneresidencial"));
				clienteTO.setTelefoneCelular(rs.getString("telefonecelular"));
				clienteTO.setQtdDependentes(rs.getInt("qtddependentes"));
				clienteTO.setIdentidade(rs.getString("identidade"));
				clienteTO.setOrgaoExpedidor(rs.getString("orgaoexpedidor"));
				clienteTO.setCodConvenio(rs.getInt("codConvenio"));
				clienteTO.setMatriculaConvenio(rs.getString("matriculaconvenio"));
				clienteTO.setValidadeConvenio(rs.getString("validadeconvenio"));
				clienteTO.setNomeConvenio(rs.getString("descricao"));
				resultado.add(clienteTO);
		    }
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return resultado;
	}

	public boolean update(String nome, String sexo, Date dataNascimento, String logadouro, 
			String cep, String cidade, String UF, String telefoneResidencial, String telefoneCelular, 
			int qtdDependentes, String identidade, String orgaoExpedidor, int codConvenio, String matriculaConvenio, String validadeConvenio, int codCliente){
		boolean retorno = true;
		try{
			Connection con = Conexao.getConnection();
			PreparedStatement st = con.prepareStatement(SQL_update);
			st.setString(1, nome);
			st.setString(2, sexo);
			st.setDate(3, dataNascimento);
			st.setString(4, logadouro);
			st.setString(5, cep);
			st.setString(6, cidade);
			st.setString(7, UF);
			st.setString(8, telefoneResidencial);
			st.setString(9, telefoneCelular);
			st.setInt(10, qtdDependentes);
			st.setString(11, identidade);
			st.setString(12, orgaoExpedidor);
			st.setInt(13, codConvenio);
			st.setString(14, matriculaConvenio);
			st.setString(15, validadeConvenio);
			st.setInt(16, codCliente);
			retorno = st.execute();
		} catch (Exception e){
			e.printStackTrace();
			retorno=false;
		}
		return retorno;
	}
	
	public boolean remove(int cod){
		try{
			Connection con = Conexao.getConnection();
			PreparedStatement st = con.prepareStatement(SQL_remove);
			st.setInt(1, cod);
			return st.execute();
		} catch (Exception e){
			e.printStackTrace();
			return false;
		}
	}

}
