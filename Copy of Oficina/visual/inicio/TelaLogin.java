package inicio;

import java.awt.Button;
import java.awt.event.MouseEvent;

import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.WindowConstants;

import logar.ControleLogin;
import rh.Funcionario;

public class TelaLogin extends Tela {

	private JPanel panel_tela;	
	private JTextField field_login;
	private JPasswordField field_senha;
	private Button button_confirmar;
	private JLabel jLabel1, jLabel2, jLabel3;	
	//----------------------------------------	
	private Funcionario funcionario;
	private ControleLogin controleLogin;
	private String login, senha, vinculo;

	public TelaLogin() {

		iniciarComponentes();	
	}

	private void iniciarComponentes() {

		controleLogin= new ControleLogin();

		jLabel1 = new JLabel();
		jLabel2 = new JLabel();
		jLabel3 = new JLabel();

		panel_tela = new JPanel();

		button_confirmar = new Button();

		field_login = new JTextField();
		field_senha = new JPasswordField();

		setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		setResizable(false);

		panel_tela.setBorder(BorderFactory.createCompoundBorder(BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), BorderFactory.createTitledBorder(BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "OficinaTech")));

		jLabel1.setHorizontalAlignment(SwingConstants.CENTER);
		jLabel1.setText("Login:");
		jLabel1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

		jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
		jLabel2.setText("Senha:");

		button_confirmar.setLabel("Ok");
		button_confirmar.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mouseClicked(java.awt.event.MouseEvent evt) {

				confirmarMouseClicked(evt);
			}});

		jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagemLogin.jpg")));
		jLabel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

		javax.swing.GroupLayout telaLoginLayout = new javax.swing.GroupLayout(panel_tela);
		panel_tela.setLayout(telaLoginLayout);
		telaLoginLayout.setHorizontalGroup(
				telaLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(telaLoginLayout.createSequentialGroup()
						.addGroup(telaLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
								.addGroup(telaLoginLayout.createSequentialGroup()
										.addContainerGap()
										.addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
										.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
										.addComponent(field_login, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))
										.addGroup(telaLoginLayout.createSequentialGroup()
												.addGap(7, 7, 7)
												.addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
												.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
												.addComponent(field_senha, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)))
												.addGap(18, 18, 18)
												.addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
												.addContainerGap())
												.addGroup(javax.swing.GroupLayout.Alignment.TRAILING, telaLoginLayout.createSequentialGroup()
														.addGap(0, 366, Short.MAX_VALUE)
														.addComponent(button_confirmar, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
														.addGap(283, 283, 283)));

		telaLoginLayout.setVerticalGroup(
				telaLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(telaLoginLayout.createSequentialGroup()
						.addGap(60, 60, 60)
						.addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE)
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 48, Short.MAX_VALUE)
						.addComponent(button_confirmar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
						.addContainerGap())
						.addGroup(telaLoginLayout.createSequentialGroup()
								.addGap(117, 117, 117)
								.addGroup(telaLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
										.addComponent(field_login, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
										.addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
										.addGap(72, 72, 72)
										.addGroup(telaLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
												.addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
												.addComponent(field_senha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
												.addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)));

		javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
		getContentPane().setLayout(layout);
		layout.setHorizontalGroup(
				layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(layout.createSequentialGroup()
						.addContainerGap()
						.addComponent(panel_tela, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addContainerGap()));

		layout.setVerticalGroup(
				layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(layout.createSequentialGroup()
						.addGap(33, 33, 33)
						.addComponent(panel_tela, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addContainerGap()));

		pack();
	}

	private void confirmarMouseClicked(MouseEvent evt) {                                            

		login= field_login.getText();
		senha= field_senha.getText();

		//vinculo= controleLogin.logarFuncionario(login, senha);
		funcionario= controleLogin.buscarFuncionario(login);

		//if(verificarVinculo())
			montarNovaTela();	        
	}                                           

	/*private boolean verificarVinculo(){

		if(vinculo.equals("Preencha todos os campos.") || vinculo.equals("Matricula incorreta.") || vinculo.equals("Senha incorreta.")){

			JOptionPane.showMessageDialog(null, vinculo);
			return false;
		}
		return true;
	}*/

	@Override
	public void insereFuncionario(Funcionario funcionario) {}

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

	public static void main(String[] args) {

		java.awt.EventQueue.invokeLater(new Runnable(){	public void run(){ 
			new TelaLogin().setVisible(true);
		}});
	}
}
