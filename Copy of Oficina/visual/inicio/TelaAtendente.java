package inicio;

import java.awt.event.MouseEvent;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

import cadastro.TelaCadastroUsuario;
import busca.TelaBuscaAtendente;
import rh.Funcionario;

public class TelaAtendente extends Tela{

	private JPanel panel_atendente;	
	private JButton button_buscar, button_cadastrar, button_emprestimo, button_logout;	
	private JLabel label_nomeFuncionario;
	
	public TelaAtendente() {

		iniciarComponentes();
	}
 
	private void iniciarComponentes() {

		label_nomeFuncionario = new javax.swing.JLabel();
		panel_atendente = new javax.swing.JPanel();
		button_emprestimo = new javax.swing.JButton();
		button_cadastrar = new javax.swing.JButton();
		button_buscar = new javax.swing.JButton();
		button_logout = new javax.swing.JButton();

		setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
		setBackground(new java.awt.Color(153, 0, 153));
		setPreferredSize(new java.awt.Dimension(800, 500));
		setResizable(false);

		label_nomeFuncionario.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

		panel_atendente.setBackground(new java.awt.Color(204, 204, 204));
		panel_atendente.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Atendente"));
		panel_atendente.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

		button_emprestimo.setText("Operacoes");
		button_emprestimo.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(0, 0, 0), new java.awt.Color(204, 204, 204)));
		button_emprestimo.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mouseClicked(java.awt.event.MouseEvent evt) {
			
				operacaoMouseClicked(evt);
			}});

		button_cadastrar.setText("Cadastrar");
		button_cadastrar.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(0, 0, 0), new java.awt.Color(204, 204, 204)));
		button_cadastrar.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mouseClicked(java.awt.event.MouseEvent evt) {
				
				cadastrarMouseClicked(evt);
			}});

		button_buscar.setText("Buscar");
		button_buscar.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(0, 0, 0), new java.awt.Color(204, 204, 204)));
		button_buscar.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mouseClicked(java.awt.event.MouseEvent evt) {
			
				buscarMouseClicked(evt);
			}});

		javax.swing.GroupLayout atendenteLayout = new javax.swing.GroupLayout(panel_atendente);
		panel_atendente.setLayout(atendenteLayout);
		atendenteLayout.setHorizontalGroup(
				atendenteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(javax.swing.GroupLayout.Alignment.TRAILING, atendenteLayout.createSequentialGroup()
						.addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addGroup(atendenteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
								.addComponent(button_buscar, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
								.addComponent(button_cadastrar, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
								.addComponent(button_emprestimo, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
								.addGap(309, 309, 309))
				);
		atendenteLayout.setVerticalGroup(
				atendenteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(atendenteLayout.createSequentialGroup()
						.addGap(41, 41, 41)
						.addComponent(button_emprestimo, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
						.addGap(53, 53, 53)
						.addComponent(button_cadastrar, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
						.addGap(60, 60, 60)
						.addComponent(button_buscar, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
						.addContainerGap(85, Short.MAX_VALUE)));

		button_logout.setText("Logout");
		button_logout.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
		button_logout.setPreferredSize(new java.awt.Dimension(30, 20));
		button_logout.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mouseClicked(java.awt.event.MouseEvent evt) {
				logoutMouseClicked(evt);
			}
		});

		javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
		getContentPane().setLayout(layout);
		layout.setHorizontalGroup(
				layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(layout.createSequentialGroup()
						.addContainerGap()
						.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
								.addGroup(layout.createSequentialGroup()
										.addComponent(label_nomeFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, 501, javax.swing.GroupLayout.PREFERRED_SIZE)
										.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 220, Short.MAX_VALUE)
										.addComponent(button_logout, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE))
										.addComponent(panel_atendente, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
										.addContainerGap()));
		
		layout.setVerticalGroup(
				layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(layout.createSequentialGroup()
						.addContainerGap()
						.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
								.addComponent(label_nomeFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
								.addComponent(button_logout, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
								.addGap(18, 18, 18)
								.addComponent(panel_atendente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
								.addContainerGap()));

		pack();
	}                     

	private void logoutMouseClicked(MouseEvent evt) { 

		TelaLogin tela = new TelaLogin();
		tela.setVisible(true);
		dispose();		
	}
	
	private void buscarMouseClicked(MouseEvent evt) {

		TelaBuscaAtendente tela = new TelaBuscaAtendente();
		tela.setVisible(true);
		tela.insereFuncionario(funcionario);
		dispose();
	}                                  

	private void cadastrarMouseClicked(MouseEvent evt) {     

		TelaCadastroUsuario tela = new TelaCadastroUsuario();
		tela.setVisible(true);
		tela.insereFuncionario(funcionario);
		dispose();
	}                                      

	private void operacaoMouseClicked(MouseEvent evt) {

		TelaIdentificarUsuario tela = new TelaIdentificarUsuario();
		tela.setVisible(true);
		tela.insereFuncionario(funcionario);
		dispose();
	}
	
	@Override
	public void insereFuncionario(Funcionario funcionario) {

		this.funcionario= funcionario;
		label_nomeFuncionario.setText("Nome do funcionario: " + funcionario.solicitarNome());		
	}

	@Override
	protected void montarNovaTela(){}  
}
