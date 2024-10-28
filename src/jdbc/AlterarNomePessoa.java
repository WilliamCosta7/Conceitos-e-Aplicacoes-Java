package jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class AlterarNomePessoa {
	
	public static void main(String[] args) throws SQLException {
	
		Scanner scanner = new Scanner(System.in);
		Connection conexao = FabricaConexao.getConexao();
		
		String sql = "UPDATE pessoas SET nome = ? WHERE codigo = ?;";
		
		System.out.println("Informe o código id da pessoas a ser atualizada ");
		int codigo = Integer.parseInt(scanner.nextLine());
		 
		System.out.println("Digite o novo nome da pessoas");
		String novoNome = scanner.nextLine();
		
		PreparedStatement stmt = conexao.prepareStatement(sql);
		stmt.setString(1, novoNome);
		stmt.setInt(2, codigo);
		
		stmt.execute();
		
		System.out.println("Nome atualizado");
		
		
		
		conexao.close();
		stmt.close();
		scanner.close();
	
	}

}
