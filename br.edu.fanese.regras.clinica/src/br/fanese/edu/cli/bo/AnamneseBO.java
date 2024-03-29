package br.fanese.edu.cli.bo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import br.fanese.edu.cli.to.AnamneseTO;

public class AnamneseBO {
	private String SQL_create =	"insert into anamneses(codAtendimento, descricao) values (?, ?)";
	
	private String SQL_findByPrimayKey=
			"select codAnamnese, codAtendimento, descricao from anamneses where codAnamnese = ?";
	
	private String SQL_findByCodAtendimento=
			"select codAnamnese, codAtendimento, descricao from anamneses where codAtendimento = ";
	
	private String SQL_findAll="select codAnamnese, codAtendimento, descricao from anamneses";
	
	public boolean insert(int codAtendimento, String descricao) {
		boolean retorno = true;
		
		Connection con = Conexao.getConnection();
		PreparedStatement st = null;
		
		try {
			st = con.prepareStatement(SQL_create);
			st.setInt(1, codAtendimento);
			st.setString(2, descricao);
			retorno = st.execute();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			retorno = false;
		} finally {
			try{
				st.close();
				con.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
			
		}
		return retorno;
	}
	
	public AnamneseTO findByPrimaryKey(int cod){
		Connection con = Conexao.getConnection();
		PreparedStatement st = null;
		ResultSet rs = null;
		try{
			st = con.prepareStatement(SQL_findByPrimayKey);
			st.setInt(1, cod);
			rs = st.executeQuery();
			if(rs.next()){
				AnamneseTO anamneseTO = new AnamneseTO();
				anamneseTO.setCodAnamnese(rs.getInt("codAnamnese"));
				anamneseTO.setCodAtendimento(rs.getInt("codAtendimento"));
				anamneseTO.setDescricao(rs.getString("descricao"));
				return anamneseTO;
				} else 
					return null;
		} catch (Exception e){
			e.printStackTrace();
			return null;
		} finally {
			try{
				rs.close();
				st.close();
				con.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
	
	public AnamneseTO findByCodAtendimento(int codAtendimento){
		Connection con = Conexao.getConnection();
		Statement st = null;
		ResultSet rs = null;
		try {
			st = con.createStatement();
			rs = st.executeQuery(SQL_findByCodAtendimento+codAtendimento);
			if(rs.next()){
				AnamneseTO anamneseTO = new AnamneseTO();
				anamneseTO.setCodAnamnese(rs.getInt("codAnamnese"));
				anamneseTO.setCodAtendimento(rs.getInt("codAtendimento"));
				anamneseTO.setDescricao(rs.getString("descricao"));
				return anamneseTO;
			} else {
				return null;
			}
		} catch (Exception e) {
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
	
	public List<AnamneseTO> findAll() {
		List<AnamneseTO> resultado = new ArrayList<AnamneseTO>();
		Connection con = Conexao.getConnection();
		Statement st = null;
		ResultSet rs = null;
		try {
			st = con.createStatement();
			rs = st.executeQuery(SQL_findAll);
			while (rs.next()) {
				AnamneseTO anamneseTO = new AnamneseTO();
				anamneseTO.setCodAnamnese(rs.getInt("codAnamnese"));
				anamneseTO.setCodAtendimento(rs.getInt("codAtendimento"));
				anamneseTO.setDescricao(rs.getString("descricao"));
				resultado.add(anamneseTO);
		    }
		} catch (Exception e) {
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
}
