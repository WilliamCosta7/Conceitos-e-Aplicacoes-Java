package jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DAO {

	// Para aprender o padrão de projeto ou seja esta mais bruto poderia ser mais
	// bem trabalhado

	private Connection conexao;

	public int incluir(String sql, Object... atributos) {
		try {
			PreparedStatement stmt = getConexao().prepareStatement(sql, PreparedStatement.RETURN_GENERATED_KEYS);
			adcionarAtributos(stmt, atributos);
			
			if(stmt.executeUpdate() > 0) {
				ResultSet resultado = stmt.getGeneratedKeys();
				if(resultado.next()) {
					return resultado.getInt(1);
				}
			}
			return -1;
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}
	
	public void close() {
		try {
			getConexao().close();
		} catch (SQLException e) {
			
		}finally {
			conexao = null;
		}
	}

	private void adcionarAtributos(PreparedStatement stmt, Object[] atributos) throws SQLException {

		int indice = 1;

		for (Object atributo : atributos) {

			if (atributo instanceof String) {
				stmt.setString(indice, (String) atributo);
			} else if (atributo instanceof Integer) {
				stmt.setInt(indice, (Integer) atributo);
			}

			indice++;
		}
	}

	private Connection getConexao() {

		try {
			if (conexao != null && !conexao.isClosed()) {
				return conexao;
			}
		} catch (SQLException e) {

		}
		conexao = FabricaConexao.getConexao();
		return conexao;
	}

}
