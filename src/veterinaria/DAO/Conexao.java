package veterinaria.DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class Conexao {
	private static Conexao conexao = null;

	// Para carregar o driver solicitado, é necessário efetuar uma chamada ao
	// método Class.forName (<nome do driver>).
	// O "nome do driver", passado como parâmetro, é na realidade o nome
	// completo da classe do mesmo;
	private Conexao() {
		try {
			Class.forName("com.mysql.jdbc.Driver"); // Carrego o driver MySQL

		} catch (ClassNotFoundException e) {
		}
	}
	
	//Padrão Singleton
		public static Conexao getConnection() {
			if (conexao == null) {
				conexao = new Conexao();
			}
			return conexao;
		}
	
	// Abertura de conexão com o banco de dados escolhido
	public Connection abrirconexao() {
		try {
			return DriverManager.getConnection("jdbc:mysql:"
					+ "//localhost/locadora", "root", "");
		} catch (SQLException e) {
			return null;
		}
	}

	

}