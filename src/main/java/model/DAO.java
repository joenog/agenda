//DATA ACCESS OBJECT - acesso ao banco de dados
package model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class DAO {
	// MODULOS DE CONEXAO
	// parametro de conexão
	private String driver = "com.mysql.cj.jdbc.Driver";
	private String url = "jdbc:mysql://127.0.0.1:3306/dbagenda?useTimezone=true&serverTimezone=UTC";
	private String user = "root";
	private String password = "admin";

	// metodo de conexao
	private Connection conectar() {
		Connection con = null;
		try {
			Class.forName(driver);
			con = DriverManager.getConnection(url, user, password);
			return con;
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
			return null;
		}
	}

	// CRUD CREATE
	public void insertContato(JavaBeans contato) {
		String create = "insert into contatos(nome,fone,email) values (?,?,?)";
		try {
			// coneccao com o banco de dados
			Connection con = conectar();

			// preparar query para execuçao no banco de dados
			PreparedStatement pst = con.prepareStatement(create);

			// substituir os parâmetros (?) pelo conteudo da variavel JavaBeans
			pst.setString(1, contato.getNome());
			pst.setString(2, contato.getFone());
			pst.setString(3, contato.getEmail());

			// execultar query
			pst.executeUpdate();

			// Encerrar conexao com banco de dados
			con.close();

		} catch (Exception e) {
			System.out.println(e);
		}
	}

	// teste conexao
	/*
	 * public void testeConexao() { try { Connection con = conectar();
	 * System.out.println(con); con.close(); } catch (Exception e) { // TODO: handle
	 * exception System.out.println(e); } }
	 */
}
