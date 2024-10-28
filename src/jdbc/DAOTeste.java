package jdbc;

public class DAOTeste {
	
	public static void main(String[] args) {
		
		DAO dao = new DAO();
		
		String sql = "INSERT INTO PESSOAS (nome) VALUES (?);";// Tambem precisaria ser encapsulado
		
		System.out.println(dao.incluir(sql, "Barbara Francielle"));
		System.out.println(dao.incluir(sql, "Andre Ricardo"));
		System.out.println(dao.incluir(sql, "Marta Dias"));
		
		dao.close();
	}
	


}
