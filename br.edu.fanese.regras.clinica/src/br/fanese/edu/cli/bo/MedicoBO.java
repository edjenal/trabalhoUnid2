package br.fanese.edu.cli.bo;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import br.fanese.edu.cli.to.MedicoTO;

public class MedicoBO {
	
	private String SQL_findAll="select crm, nome, sexo, dataNascimento, logradouro, cep, cidade, uf, telefoneResidencial," +
			" telefoneCelular, tempoMedioAtendimento from medicos order by nome";
	
	public List<MedicoTO> findAll() {
		List<MedicoTO> resultado = new ArrayList<MedicoTO>();
		Connection con = Conexao.getConnection();
		Statement st = null;
		ResultSet rs = null;
		try {
			st = con.createStatement();
			rs = st.executeQuery(SQL_findAll);
			while (rs.next()) {
				MedicoTO medico = new MedicoTO();
				medico.setCRM(rs.getString(1));
				medico.setNome(rs.getString(2));
				medico.setSexo(rs.getString(3));
				medico.setDataNascimento(rs.getDate(4));
				medico.setLogadouro(rs.getString(5));
				medico.setCep(rs.getString(6));
				medico.setCidade(rs.getString(7));
				medico.setUF(rs.getString(8));
				medico.setTelefoneResidencial(rs.getString(9));
				medico.setTelefoneCelular(rs.getString(10));
				medico.setTempoMedioAtendimento(rs.getInt(11));
				resultado.add(medico);
		    }
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally{
			try{
				rs.close();
				st.close();
				con.close();
			}catch (Exception e) {
				// TODO: handle exception
				e.printStackTrace();
			}
		}
		return resultado;
	}
}
