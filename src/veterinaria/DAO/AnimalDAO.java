package Veterinaria.dao;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;

import veterinaria.model.Animal;




public class AnimalDAO {

	private ArrayList listaAnimal = new ArrayList();
	private static AnimalDAO singletonAnimal = null;
	private PreparedStatement pst = null;
	///private ResultSet rs = null;
	private Conexao conexao;
	
	//Padrão Singleton: garante que o objeto da classe que efetua o cadastro 
	//do cliente seja sempre o mesmo objeto evitando inconsistências.
	public static AnimalDAO getInstance() {
		if (singletonAnimal == null) {
			singletonAnimal = new AnimalDAO();
		}
		return singletonAnimal;
	}

	public AnimalDAO() {
		conexao=Conexao.getConnection();
	}

	public void salvarAnimal( Animal animal ) {
		try {
			String sql = "INSERT INTO animal(animalId, animalNome, animalEspecie, animalGenero,animalSexo, animalIdade) VALUES(?,?,?)";
			pst = conexao.abrirconexao().prepareStatement(sql);
                        pst.setString(1, animal.getanimalId());
			pst.setString(2, animal.getanimalNome());
			pst.setString(3, animal.getGenero());
			pst.setString(4, animal.getanimalIdade());
                        pst.setString(5, animal.getanimalEspecie());
                        pst.setString(6, animal.getanimalSexo());
                        
			pst.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	
	}
	
}
