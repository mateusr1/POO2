package veterinaria.DAO;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;

import veterinaria.Model.Cliente;






public class CadastroClienteDAO {

	private ArrayList listaCadClientes = new ArrayList();
	private static CadastroClienteDAO singletonCliente = null;
	private PreparedStatement pst = null;
	///private ResultSet rs = null;
	private Conexao conexao;
	
	
	public static CadastroClienteDAO getInstance() {
		if (singletonCliente == null) {
			singletonCliente = new CadastroClienteDAO();
		}
		return singletonCliente;
	}

	private CadastroClienteDAO() {
		conexao=Conexao.getConnection();
	}

	public void salvarCadastroCliente(Cliente cliente) {
		try {
			String sql = "INSERT INTO cliente(clienteId, clienteNome, clienteCPF,clienteCNPJ, clienteEndereco) VALUES(?,?,?)";
			pst = conexao.abrirconexao().prepareStatement(sql);
                        pst.setString(1, cliente.getclienteId());
			pst.setString(2, cliente.getclienteNome());
			pst.setString(3, cliente.getclienteCPF());
			pst.setString(4, cliente.getclienteCNPJ());
                        pst.setString(5, cliente.getclienteEndereco());
                        
		} catch (SQLException e) {
			e.printStackTrace();
		}
	
	}

    public void inserirCliente(String nome, int identificador, String endereco, String cidade, String estado, int cep, int telefone) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
	
}