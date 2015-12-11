package cadastro;

import java.awt.event.MouseEvent;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

import inicio.Tela;
import inicio.TelaAtendente;
import inicio.TelaMecanico;
import rh.Funcionario;

public class TelaCadastro extends Tela {

	private JButton button_cancelar, button_cadastrarObra, button_cadastrarUsuario, button_cadastrarFuncionario;
	private JPanel jPanel1;
	private JLabel label_nomeFuncionario;

	public TelaCadastro(){

		iniciarComponentes();
	}

	private void iniciarComponentes() {

		label_nomeFuncionario = new JLabel();
		jPanel1 = new JPanel();
		button_cadastrarUsuario = new JButton();
		button_cadastrarFuncionario = new JButton();
		button_cadastrarObra = new JButton();
		button_cancelar = new JButton();

		setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
		setPreferredSize(new java.awt.Dimension(800, 500));
		setResizable(false);

		label_nomeFuncionario.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

		jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Cadastro"));

		button_cadastrarUsuario.setText("Novo usuario");
		button_cadastrarUsuario.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(0, 0, 0), new java.awt.Color(204, 204, 204)));
		button_cadastrarUsuario.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mouseClicked(java.awt.event.MouseEvent evt) {
			
				cadastrarUsuarioMouseClicked(evt);
			}});

		button_cadastrarFuncionario.setText("Novo funcionario ");
		button_cadastrarFuncionario.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(0, 0, 0), new java.awt.Color(153, 153, 153)));
		button_cadastrarFuncionario.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mouseClicked(java.awt.event.MouseEvent evt) {
				
				cadastroFuncionarioMouseClicked(evt);
			}});

		button_cadastrarObra.setText("Novo carro");
		button_cadastrarObra.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(0, 0, 0), new java.awt.Color(204, 204, 204)));
		button_cadastrarObra.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mouseClicked(java.awt.event.MouseEvent evt) {
				
				cadastrarCarroMouseClicked(evt);
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
										.addGap(310, 310, 310)
										.addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
												.addComponent(button_cadastrarObra, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
												.addComponent(button_cadastrarFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
												.addComponent(button_cadastrarUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
												.addGroup(jPanel1Layout.createSequentialGroup()
														.addGap(338, 338, 338)
														.addComponent(button_cancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)))
														.addContainerGap()));
		
		jPanel1Layout.setVerticalGroup(
				jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(jPanel1Layout.createSequentialGroup()
						.addContainerGap()
						.addComponent(button_cadastrarUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
						.addGap(54, 54, 54)
						.addComponent(button_cadastrarFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
						.addGap(50, 50, 50)
						.addComponent(button_cadastrarObra, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 94, Short.MAX_VALUE)
						.addComponent(button_cancelar)
						.addContainerGap()));

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

	private void cancelarMouseClicked(MouseEvent evt) {

		montarNovaTela();
	}

	private void cadastrarUsuarioMouseClicked(MouseEvent evt) {

		TelaCadastroUsuario tela= new TelaCadastroUsuario();
		tela.setVisible(true);
		tela.insereFuncionario(funcionario);
		dispose();
	}

	private void cadastroFuncionarioMouseClicked(MouseEvent evt) {

		TelaCadastroFuncionario tela= new TelaCadastroFuncionario();
		tela.setVisible(true);
		tela.insereFuncionario(funcionario);
		dispose();
	}

	private void cadastrarCarroMouseClicked(MouseEvent evt) {

		TelaCadastroCarro tela = new TelaCadastroCarro();
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
	protected void montarNovaTela() {

		TelaAtendente tela= new TelaAtendente();
		tela.setVisible(true);
		tela.insereFuncionario(funcionario);
		dispose();
	}
}
