package jdbc;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class CriarBanco {
	
	public static void main(String[] args) throws SQLException {
		
//		final String url = "jdbc:mysql://localhost:3306" ;
//		final String usuario = "root";
//		final String senha = "0410timao";
//		
//		Connection conexao = DriverManager.getConnection(url,usuario,senha);
		
		Connection conexao = FabricaConexao.getConexao();
		
		Statement stmt = conexao.createStatement();
		stmt.execute("CREATE DATABASE IF NOT EXISTS familia");
		
		System.out.println("Banco criando com sucesso!");
		
		conexao.close();
	}

}
