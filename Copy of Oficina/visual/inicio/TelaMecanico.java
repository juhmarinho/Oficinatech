package inicio;

import java.awt.event.MouseEvent;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;


import busca.TelaBuscaMecanico;
import cadastro.TelaCadastro;
import rh.Funcionario;

public class TelaMecanico extends Tela {

	private JButton button_buscar,  button_cadastrar, button_emprestimo, button_logout;
	private JPanel jPanel1;
	private JLabel label_nomeFuncionario;

	public TelaMecanico() {

		iniciarComponentes();
	}
           
	private void iniciarComponentes() {

		label_nomeFuncionario = new JLabel();
		button_logout = new JButton();
		jPanel1 = new javax.swing.JPanel();
		button_emprestimo = new JButton();
		button_cadastrar = new JButton();
		button_buscar = new JButton();

		setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
		setResizable(false);

		label_nomeFuncionario.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

		button_logout.setText("Logout");
		button_logout.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
		button_logout.setPreferredSize(new java.awt.Dimension(30, 20));
		button_logout.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mouseClicked(java.awt.event.MouseEvent evt) {

				logoutMouseClicked(evt);
			}});

		jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Gerente"));

		button_emprestimo.setText("Operacoes");
		button_emprestimo.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(0, 0, 0), new java.awt.Color(204, 204, 204)));
		button_emprestimo.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mouseClicked(java.awt.event.MouseEvent evt) {

				operacoesMouseClicked(evt);
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

		javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
		jPanel1.setLayout(jPanel1Layout);
		jPanel1Layout.setHorizontalGroup(
				jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
						.addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
								.addComponent(button_buscar, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
								.addComponent(button_cadastrar, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
								.addComponent(button_emprestimo, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
								.addGap(304, 304, 304)));

		jPanel1Layout.setVerticalGroup(
				jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(jPanel1Layout.createSequentialGroup()
						.addGap(35, 35, 35)
						.addComponent(button_emprestimo, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
						.addGap(55, 55, 55)
						.addComponent(button_cadastrar, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
						.addGap(65, 65, 65)
						.addComponent(button_buscar, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
						.addContainerGap(84, Short.MAX_VALUE)));

		javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
		getContentPane().setLayout(layout);
		layout.setHorizontalGroup(
				layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
						.addContainerGap()
						.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
								.addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
								.addGroup(layout.createSequentialGroup()
										.addComponent(label_nomeFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, 501, javax.swing.GroupLayout.PREFERRED_SIZE)
										.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 207, Short.MAX_VALUE)
										.addComponent(button_logout, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)))
										.addContainerGap()));

		layout.setVerticalGroup(
				layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(layout.createSequentialGroup()
						.addContainerGap()
						.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
								.addComponent(button_logout, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
								.addComponent(label_nomeFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
								.addGap(18, 18, 18)
								.addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
								.addContainerGap()));
		pack();
	}                       

	private void logoutMouseClicked(MouseEvent evt) {                                    

		TelaLogin form = new TelaLogin();
		form.setVisible(true);
		dispose();
	}  

	private void operacoesMouseClicked(MouseEvent evt) {  

		TelaIdentificarUsuario tela = new TelaIdentificarUsuario();
		tela.setVisible(true);
		tela.insereFuncionario(funcionario);
		dispose();
	}                                       

	private void cadastrarMouseClicked(MouseEvent evt) {                                       

		TelaCadastro tela = new TelaCadastro();
		tela.setVisible(true);
		tela.insereFuncionario(funcionario);
		dispose();
	}                                      

	private void buscarMouseClicked(MouseEvent evt) {                                    

		TelaBuscaMecanico tela = new TelaBuscaMecanico();
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
	protected void montarNovaTela() { }          
}