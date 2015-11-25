package veterinaria.Viws;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

import veterinaria.DAO.CadastroClienteDAO;


public class IframeCadCliente1 extends JInternalFrame {
	
	private JPanel painelDados;
	
	private JPanel painelBotoes;
	
	private CadastroClienteDAO daoClient = CadastroClienteDAO.getInstance();
	
	private static IframeCadCliente1 iframeCliente = null;
	
	private JButton botaoOk;
	
	private JButton botaoCancelar;

	private JTextField textFieldNome;
	private JTextField textFieldIdent;
	private JTextField textFieldEnd;
	private JTextField textFieldCidade;
	private JComboBox comboEstado;
	private JTextField textFieldCep;
	private JTextField textFieldTel;

	private JLabel labelNome;
	private JLabel labelIdent;
	private JLabel labelEnd;
	private JLabel labelCidade;
	private JLabel labelEstado;
	private JLabel labelCep;
	private JLabel labelTel;
	
	public IframeCadCliente1(){
		super("Modo Cadastro");
        painelDados = new JPanel();
		
        String estados[] = {"","ACRE", "AMAZONAS","PARÁ","RONDÔNIA","TOCATINS",
        		"RORAIMA","MATO GROSSO","MATO GROSSO DO SUL","GOIÁS","PARANÁ","SANTA CATARINA",
        		"MARANHÃO","PERNAMBUCO","PIAUÍ", "CEARÁ","RIO GRANDE DO NORTE","PARAÍBA","ALAGOAS",
        		"RIO DE JANEIRO","SÃO PAULO","RIO GRANDE DO SUL","ESPÍRITO SANTO","BAHIA","DISTRITO FEDERAL"};
        
		labelNome = new JLabel("Nome:");
		labelIdent = new JLabel("CPF:");
		labelEnd = new JLabel("Endereço:");
		labelCidade = new JLabel ("Cidade:");
		labelEstado = new JLabel ("Estado:");
		labelCep = new JLabel ("CEP:");
		labelTel = new JLabel ("TEL:");
		textFieldNome = new JTextField(10);
		textFieldIdent = new JTextField(10);
		//Esta assinatura de método permite que apenas numeros sejam digitados
		
		textFieldEnd = new JTextField(10);
		textFieldCidade = new JTextField(10);
		comboEstado = new JComboBox(estados);
		textFieldCep = new JTextField(5);
		
		textFieldTel = new JTextField(5);
		
		
		
		painelDados.add(labelNome);
		painelDados.add(textFieldNome);
		painelDados.add(labelIdent);
		painelDados.add(textFieldIdent);
		painelDados.add(labelEnd);
		painelDados.add(textFieldEnd);
		painelDados.add(labelCidade);
		painelDados.add(textFieldCidade);
		painelDados.add(labelEstado);
		painelDados.add(comboEstado);
		painelDados.add(labelCep);
		painelDados.add(textFieldCep);
		painelDados.add(labelTel);
		painelDados.add(textFieldTel);			
		
		painelBotoes = new JPanel();
		
		botaoOk = new JButton("OK");
			
		botaoCancelar = new JButton("CANCELAR"); //Este botão nao tem tratamento de eventos
		
		painelBotoes.add(botaoOk);
		painelBotoes.add(botaoCancelar);
		
		painelDados.setLayout(new GridLayout(4,2,7,7));
		
		add(painelDados);
		add(painelBotoes, BorderLayout.SOUTH);
		
	
		botaoOk.addActionListener(new OuvinteCadastro());
				
		
		pack(); //método que ajusta o tamanho da tela ao tamanho dos componentes
		setLocation(100,150); // direciona a localização da tela interna dentro da tela principal	
		setClosable(true); // método que fecha a tela interna
		setVisible(true);
		
	}
	
	public class OuvinteCadastro implements ActionListener{
		public void actionPerformed (ActionEvent e){
				
			//Este if verifica se tem algum campo de texto vazio. Se houver ele não salva o arquivo
			if ((textFieldNome.getText().isEmpty()) || (textFieldIdent.getText().isEmpty()) || (textFieldEnd.getText().isEmpty())) {
				   JOptionPane.showMessageDialog(null, "Todos os campos devem ser preenchidos","",JOptionPane.WARNING_MESSAGE);
			}
			else {
				String nome = textFieldNome.getText(); // pegando o que for digitado na caixa de texto de nome
				int identificador = Integer.parseInt(textFieldIdent.getText()); // pegando o que for digitado na caixa de texto de cpf
				String endereco= textFieldEnd.getText(); // pegando o que for digitado na caixa de texto de endereco
				String cidade = textFieldCidade.getText();
				String estado = (String) comboEstado.getSelectedItem();
				int cep = Integer.parseInt(textFieldCep.getText());
				int telefone = Integer.parseInt(textFieldTel.getText());;
				daoClient.inserirCliente(nome, identificador, endereco, cidade, estado, cep, telefone);  //chamando o método para salvar na Coleção 
				JOptionPane.showMessageDialog(null, "Cliente salvo com sucesso !!!");
				dispose();
				//apaga os dados preenchidos nos campos de texto ao final do salvamento
				textFieldNome.setText("");
				textFieldIdent.setText("");
				textFieldEnd.setText("");
				textFieldCidade.setText("");
				comboEstado.setSelectedItem("");
				textFieldCep.setText("");
				textFieldTel.setText("");
			}
			
		}
	}
	
	public static IframeCadCliente1 getInstanceIFrame(){
		if (iframeCliente == null){
			iframeCliente = new IframeCadCliente1();
		}
		return iframeCliente;
	}
}
