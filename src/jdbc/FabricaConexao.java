package jdbc;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class FabricaConexao {

	
	// Dessa vez o arquivo properties esta dentro do src mas o melhor é que esteja externo 
	// em alguma pasta do usuario
	public static Connection getConexao() {
	
		try {
			Properties prop = getProperties();
			final String url = prop.getProperty("banco.url");
			final String usuario = prop.getProperty("banco.usuario");
			final String senha = prop.getProperty("banco.senha");
			
			return DriverManager.getConnection(url,usuario,senha);
		} catch (SQLException | IOException e) {
			throw new RuntimeException(e); 
		}
	}
	
	private static Properties getProperties() throws IOException{
		Properties prop = new Properties();
		String caminho = "/conexao.properties";
		prop.load(FabricaConexao.class.getResourceAsStream(caminho));
		return prop;
	}
	
	// exemplo do codigo com arquivo externalizado :
	
	
//	private static Properties getProperties() {
//		Properties prop = new Properties();
//		String caminho = "C:\\Users\\wilia\\Desktop\\William\\Estudar\\Projetos Java\\conexaoTeste.properties";
//
//		try (InputStream carregaArquivos = new FileInputStream(caminho)) {
//			prop.load(carregaArquivos);
//		} catch (IOException ex) {
//			// Se ocorrer um erro de E/S, imprime a exceção
//			ex.printStackTrace();
//		}
//
//		return prop;
//	}
//
//	
//	public static Connection getConexao() {
//		Properties properties = getProperties();
//
//		final String url = properties.getProperty("banco.url");
//		final String usuario = properties.getProperty("banco.usuario");
//		final String senha = properties.getProperty("banco.senha");
//
//		if (url == null || usuario == null || senha == null) {
//			throw new RuntimeException("Propriedades do banco de dados não configuradas corretamente.");
//		}
//
//		try {
//			return DriverManager.getConnection(url, usuario, senha);
//			
//		} catch (SQLException e) {
//			throw new RuntimeException("Erro ao estabelecer conexão com o banco de dados: " + e.getMessage(), e);
//		}
//	}
	
}
 