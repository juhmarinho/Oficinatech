package inicio;

import java.awt.event.MouseEvent;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

import logar.ControleLogin;
import operacoes.TelaOperacao;
import rh.Funcionario;
//import rh.Usuario;

public class TelaIdentificarUsuario extends Tela{

	private JButton button_cancelar, button_confirmar;
	private JTextField field_login;
	private JPasswordField field_senha;
	private JLabel jLabel1, jLabel2, label_nomeFuncionario;
	private JPanel jPanel1;
	//----------------
	private ControleLogin controleLogin;
	private String login, senha, vinculo;

	public TelaIdentificarUsuario() {

		iniciarComponentes();		
	}

	private void iniciarComponentes() {

		controleLogin= new ControleLogin();

		jPanel1 = new JPanel();
		jLabel1 = new JLabel();
		jLabel2 = new JLabel();
		field_login = new JTextField();
		field_senha = new JPasswordField();
		button_confirmar = new JButton();
		button_cancelar = new JButton();
		label_nomeFuncionario = new JLabel();

		setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
		setPreferredSize(new java.awt.Dimension(800, 500));
		setResizable(false);

		jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Identificar usuario"));

		jLabel1.setText("Usuario:");

		jLabel2.setText("Senha");

		button_confirmar.setText("Ok");
		button_confirmar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
		button_confirmar.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mouseClicked(java.awt.event.MouseEvent evt) {

				confirmarIdMouseClicked(evt);
			}});

		button_cancelar.setText("Cancelar");
		button_cancelar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
		button_cancelar.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mouseClicked(java.awt.event.MouseEvent evt) {

				cancelarMouseClicked(evt);
			}});

		javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
		jPanel1.setLayout(jPanel1Layout);
		jPanel1Layout.setHorizontalGroup(
				jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(jPanel1Layout.createSequentialGroup()
						.addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
								.addGroup(jPanel1Layout.createSequentialGroup()
										.addGap(230, 230, 230)
										.addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
												.addComponent(jLabel1)
												.addComponent(jLabel2))
												.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
												.addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
														.addComponent(field_login)
														.addComponent(field_senha, javax.swing.GroupLayout.DEFAULT_SIZE, 153, Short.MAX_VALUE))
														.addGap(0, 0, Short.MAX_VALUE))
														.addGroup(jPanel1Layout.createSequentialGroup()
																.addContainerGap()
																.addComponent(button_confirmar, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
																.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
																.addComponent(button_cancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)))
																.addContainerGap()));

		jPanel1Layout.setVerticalGroup(
				jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(jPanel1Layout.createSequentialGroup()
						.addGap(93, 93, 93)
						.addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
								.addComponent(jLabel1)
								.addComponent(field_login, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
								.addGap(43, 43, 43)
								.addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
										.addComponent(jLabel2)
										.addComponent(field_senha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
										.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 213, Short.MAX_VALUE)
										.addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
												.addComponent(button_confirmar)
												.addComponent(button_cancelar))
												.addContainerGap()));

		label_nomeFuncionario.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

		javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
		getContentPane().setLayout(layout);
		layout.setHorizontalGroup(
				layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(layout.createSequentialGroup()
						.addContainerGap()
						.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
								.addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
								.addGroup(layout.createSequentialGroup()
										.addComponent(label_nomeFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, 501, javax.swing.GroupLayout.PREFERRED_SIZE)
										.addGap(0, 279, Short.MAX_VALUE)))
										.addContainerGap()));

		layout.setVerticalGroup(
				layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(layout.createSequentialGroup()
						.addContainerGap()
						.addComponent(label_nomeFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
						.addGap(18, 18, 18)
						.addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addContainerGap()));

		pack();
	}

	private void confirmarIdMouseClicked(MouseEvent evt) {

		login= field_login.getText();
		senha= field_senha.getText();

		vinculo= controleLogin.logarUsuario(login, senha);

		if(verificarVinculo()){

		//	Usuario usuario= controleLogin.buscarUsuario(login);

			TelaOperacao tela = new TelaOperacao();
			tela.setVisible(true);
			tela.insereFuncionario(funcionario);
			//tela.insereUsuarioEmprestimo(usuario);
			dispose();
		}
		else
			JOptionPane.showMessageDialog(null, vinculo);
	}

	private void cancelarMouseClicked(MouseEvent evt) {

		montarNovaTela();
	}

	private boolean verificarVinculo(){

		if(vinculo.equals("Preencha todos os campos.") || vinculo.equals("Matricula incorreta.") || vinculo.equals("Senha incorreta."))
			return false;

		return true;
	}

	@Override
	protected void montarNovaTela() {

		Tela tela= null;

		if(funcionario.solicitarFuncao().equals("Atendente"))
			tela= new TelaAtendente();

		else if(funcionario.solicitarFuncao().equals("Mecanico"))
			tela = new TelaMecanico();

		tela.setVisible(true);
		tela.insereFuncionario(funcionario);
		dispose();
	}

	@Override
	public void insereFuncionario(Funcionario funcionario) {

		this.funcionario= funcionario;
		label_nomeFuncionario.setText("Nome do funcionario: " + funcionario.solicitarNome());
	}
}
