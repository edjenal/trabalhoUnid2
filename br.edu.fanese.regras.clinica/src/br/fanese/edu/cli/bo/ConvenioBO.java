package br.fanese.edu.cli.bo;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import br.fanese.edu.cli.to.ConvenioTO;

public class ConvenioBO {
	
	private String SQL_findAll="select codConvenio, descricao from convenios";
	
	public List<ConvenioTO> findAll() {
		List<ConvenioTO> resultado = new ArrayList<ConvenioTO>();
		Connection con = Conexao.getConnection();
		Statement st = null;
		ResultSet rs = null;
		try {
			st = con.createStatement();
			rs = st.executeQuery(SQL_findAll);
			while (rs.next()) {
				ConvenioTO convenio = new ConvenioTO();
				convenio.setCodConvenio(rs.getInt(1));
				convenio.setDescricao(rs.getString(2));
				resultado.add(convenio);
		    }
		} catch (Exception e) {
			// TODO Auto-generated catch block
			
		} finally{
			try{
				rs.close();
				st.close();
				con.close();
			}catch (Exception e) {
				e.printStackTrace();
			}
		}
		return resultado;
	}
	
}
