package br.fanese.edu.cli.bo;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import br.fanese.edu.cli.to.AtendimentoTO;

public class AtendimentoBO {
	private String SQL_create =	"insert into atendimentos(dataCadastro, dataConsulta, codCliente, crm, atdRealizado)" +
			"values (getdate(), ?, ?, ?, ?)";
	private String SQL_update = "update atendimentos set atdRealizado = ? where codAtendimento = ?";
	private String SQL_remove= "delete from atendimentos where codAtendimento = ?";
	private String SQL_findByPrimayKey=
			"select codAtendimento, dataCadastro, dataConsulta, atendimentos.codCliente, atendimentos.crm, atdRealizado," +
			" clientes.nome as nomeCliente, medicos.nome as nomeMedico" +
			" from atendimentos inner join clientes on clientes.codCliente =  atendimentos.codCliente "+
			" inner join medicos on medicos.crm = atendimentos.crm where codAtendimento = ?";
	private String SQL_findByAtendido=
			"select codAtendimento, dataCadastro, dataConsulta, atendimentos.codCliente, atendimentos.crm, atdRealizado," +
			" clientes.nome as nomeCliente, medicos.nome as nomeMedico" +
			" from atendimentos inner join clientes on clientes.codCliente =  atendimentos.codCliente "+
			" inner join medicos on medicos.crm = atendimentos.crm where atdRealizado = ";
//			" inner join medicos on medicos.crm = atendimentos.crm";
	private String SQL_findAll="select codAtendimento, dataCadastro, dataConsulta, codCliente, crm, atdRealizado form atendimentos";
	
	public boolean insert(Date dataConsulta, int codCliente, String crm, String atdRealizado) {
		boolean retorno = true;
		Connection con = Conexao.getConnection();
		PreparedStatement st = null;
		try {
			st = con.prepareStatement(SQL_create);
			st.setDate(1, dataConsulta);
			st.setInt(2, codCliente);
			st.setString(3, crm);
			st.setString(4, atdRealizado);
			retorno = st.execute();
		} catch (Exception e) {
			e.printStackTrace();
			retorno = false;
		} finally{
			try{
				st.close();
				con.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		return retorno;
	}
	
	public AtendimentoTO findByPrimaryKey(int cod){
		Connection con = Conexao.getConnection();
		PreparedStatement st = null;
		ResultSet rs = null;
		try{
			st = con.prepareStatement(SQL_findByPrimayKey);
			st.setInt(1, cod);
			rs = st.executeQuery();
			if(rs.next()){
				AtendimentoTO atendimentoTO = new AtendimentoTO();
				atendimentoTO.setCodAtendimento(rs.getInt("codAtendimento"));
				atendimentoTO.setDataCadastro(rs.getDate("dataCadastro"));
				atendimentoTO.setDataConsulta(rs.getDate("dataConsulta"));
				atendimentoTO.setCodCliente(rs.getInt("codCliente"));
				atendimentoTO.setCRM(rs.getString("crm"));
				atendimentoTO.setAtdRealizado(rs.getString("atdRealizado"));
				atendimentoTO.setNomeCLiente(rs.getString("nomeCLiente"));
				atendimentoTO.setNomeMedico(rs.getString("nomeMedico"));
				return atendimentoTO;
				} else 
					return null;
		} catch (Exception e){
			e.printStackTrace();
			return null;
		} finally{
			try{
				rs.close();
				st.close();
				con.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
	
	public List<AtendimentoTO> findAll() {
		List<AtendimentoTO> resultado = new ArrayList<AtendimentoTO>();
		Connection con = Conexao.getConnection();
		Statement st = null;
		ResultSet rs = null;
		try {
			st = con.createStatement();
			rs = st.executeQuery(SQL_findAll);
			while (rs.next()) {
				AtendimentoTO atendimentoTO = new AtendimentoTO();
				atendimentoTO.setCodAtendimento(rs.getInt("codAtendimento"));
				atendimentoTO.setDataCadastro(rs.getDate("dataCadastro"));
				atendimentoTO.setDataConsulta(rs.getDate("dataConsulta"));
				atendimentoTO.setCRM(rs.getString("crm"));
				atendimentoTO.setAtdRealizado(rs.getString("atdRealizado"));
				resultado.add(atendimentoTO);
		    }
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally{
			try{
				rs.close();
				st.close();
				con.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		return resultado;
	}
	
	public boolean update(String atdRealizado, int codAtendimento){
		boolean retorno = true;
		Connection con = Conexao.getConnection();
		PreparedStatement st = null;
		try{
			st = con.prepareStatement(SQL_update);
			st.setString(1, atdRealizado);
			st.setInt(2, codAtendimento);
			retorno = st.execute();
		} catch (Exception e){
			e.printStackTrace();
			retorno=false;
		} finally{
			try{
				st.close();
				con.close();
			}catch (Exception e) {
				e.printStackTrace();
			}
		}
		return retorno;
	}
	
	public boolean remove(int cod){
		Connection con = Conexao.getConnection();
		PreparedStatement st = null;
		try{
			st = con.prepareStatement(SQL_remove);
			st.setInt(1, cod);
			return st.execute();
		} catch (Exception e){
			e.printStackTrace();
			return false;
		} finally{
			try{
				st.close();
				con.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
	public List<AtendimentoTO> findByAtendido(String atendido){
		atendido = "'"+atendido+"'";
		Connection con = Conexao.getConnection();
		Statement st = null;
		ResultSet rs = null;
		try {
			List<AtendimentoTO> resultado = new ArrayList<AtendimentoTO>();
			st = con.createStatement();
			rs = st.executeQuery(SQL_findByAtendido+atendido);
			while(rs.next()){
				AtendimentoTO atendimentoTO = new AtendimentoTO();
				atendimentoTO.setCodAtendimento(rs.getInt("codAtendimento"));
				atendimentoTO.setDataCadastro(rs.getDate("dataCadastro"));
				atendimentoTO.setDataConsulta(rs.getDate("dataConsulta"));
				atendimentoTO.setCodCliente(rs.getInt("codCliente"));
				atendimentoTO.setCRM(rs.getString("crm"));
				atendimentoTO.setAtdRealizado(rs.getString("atdRealizado"));
				atendimentoTO.setNomeCLiente(rs.getString("nomeCLiente"));
				atendimentoTO.setNomeMedico(rs.getString("nomeMedico"));
				resultado.add(atendimentoTO);
			}
			return resultado;
		} catch (Exception e) {
			return null;
		} finally {
			try {
				rs.close();
				st.close();
				con.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}

	
}
