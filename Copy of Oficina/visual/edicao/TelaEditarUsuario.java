package edicao;

import inicio.Tela;
import inicio.TelaAtendente;
import inicio.TelaBibliotecario;
import inicio.TelaGerente;

import javax.swing.JOptionPane;

import crud.ControleEdicao;
import rh.Funcionario;
import rh.Usuario;

public class TelaEditarUsuario extends Tela {

	private javax.swing.JButton cancelar;
	private javax.swing.JButton confirmar;

	private javax.swing.JComboBox fieldBairro;
	private javax.swing.JComboBox fieldCidade;
	private javax.swing.JTextField fieldCep;
	private javax.swing.JTextField fieldEmail;
	private javax.swing.JTextField fieldNome;
	private javax.swing.JTextField fieldNumero;
	private javax.swing.JTextField fieldRua;
	private javax.swing.JTextField fieldTelefone;

	private javax.swing.JLabel jLabel31;
	private javax.swing.JLabel jLabel34;
	private javax.swing.JLabel jLabel35;
	private javax.swing.JLabel jLabel36;
	private javax.swing.JLabel jLabel37;
	private javax.swing.JLabel jLabel38;
	private javax.swing.JLabel jLabel39;
	private javax.swing.JLabel jLabel40;
	private javax.swing.JLabel jLabel42;
	private javax.swing.JLabel jLabel44;

	private javax.swing.JSeparator jSeparator5;
	private javax.swing.JSeparator jSeparator6;

	private javax.swing.JPanel telaEdicao;
	private javax.swing.JLabel label_nomeFuncionario;

	//---------------------
	private String nome, email, telefone, rua, numero, bairro, cep, cidade;

	private ControleEdicao controle;
	private Funcionario funcionario;

	private Usuario usuarioEdicao;

	public TelaEditarUsuario() {

		initComponents();
		controle= new ControleEdicao();
	}

	@SuppressWarnings("unchecked")
	private void initComponents() {

		label_nomeFuncionario = new javax.swing.JLabel();
		telaEdicao = new javax.swing.JPanel();
		jLabel31 = new javax.swing.JLabel();
		jLabel34 = new javax.swing.JLabel();
		jLabel35 = new javax.swing.JLabel();
		jLabel36 = new javax.swing.JLabel();
		jLabel37 = new javax.swing.JLabel();
		jLabel38 = new javax.swing.JLabel();
		jLabel39 = new javax.swing.JLabel();
		jLabel40 = new javax.swing.JLabel();
		jLabel42 = new javax.swing.JLabel();
		confirmar = new javax.swing.JButton();
		cancelar = new javax.swing.JButton();
		jLabel44 = new javax.swing.JLabel();
		jSeparator5 = new javax.swing.JSeparator();
		jSeparator6 = new javax.swing.JSeparator();
		fieldBairro = new javax.swing.JComboBox();
		fieldCidade = new javax.swing.JComboBox();
		fieldNome = new javax.swing.JTextField();
		fieldEmail = new javax.swing.JTextField();
		fieldTelefone = new javax.swing.JTextField();
		fieldRua = new javax.swing.JTextField();
		fieldNumero = new javax.swing.JTextField();
		fieldCep = new javax.swing.JTextField();

		setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
		setResizable(false);

		label_nomeFuncionario.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

		telaEdicao.setBackground(new java.awt.Color(204, 204, 204));
		telaEdicao.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "EDITAR USUARIO"));

		jLabel31.setText("Nome:");
		jLabel34.setText("Endereco:");
		jLabel35.setText("E-mail:");
		jLabel36.setText("Telefone:");
		

		jLabel37.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
		
		jLabel37.setText("Contato:");
		jLabel38.setText("Rua:");
		jLabel39.setText("Numero:");
		jLabel40.setText("Bairro:");
		jLabel42.setText("Cep:");		
		
		confirmar.setText("OK");
		confirmar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
		confirmar.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mouseClicked(java.awt.event.MouseEvent evt) {
				confirmarMouseClicked(evt);
			}
		});

		cancelar.setText("CANCELAR");
		cancelar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
		cancelar.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mouseClicked(java.awt.event.MouseEvent evt) {
				cancelarMouseClicked(evt);
			}
		});

		jLabel44.setText("Cidade:");
		
		fieldBairro.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4", " "}));

		fieldCidade.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4", " " }));
        
		

		javax.swing.GroupLayout telaEdicaoLayout = new javax.swing.GroupLayout(telaEdicao);
		telaEdicao.setLayout(telaEdicaoLayout);
		telaEdicaoLayout.setHorizontalGroup(
				telaEdicaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(telaEdicaoLayout.createSequentialGroup()
						.addContainerGap()
						.addGroup(telaEdicaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
								.addGroup(telaEdicaoLayout.createSequentialGroup()
										.addGroup(telaEdicaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
												.addGroup(telaEdicaoLayout.createSequentialGroup()
														.addComponent(jLabel40)
														.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
														.addComponent(fieldBairro, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
														.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
														.addComponent(jLabel44)
														.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
														.addComponent(fieldCidade, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
														.addGroup(telaEdicaoLayout.createSequentialGroup()
																.addComponent(jLabel38)
																.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																.addComponent(fieldRua)))
																.addGap(10, 10, 10)
																.addGroup(telaEdicaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
																		.addGroup(telaEdicaoLayout.createSequentialGroup()
																				.addComponent(jLabel42)
																				.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
																				.addComponent(fieldCep, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE))
																				.addGroup(telaEdicaoLayout.createSequentialGroup()
																						.addComponent(jLabel39)
																						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																						.addComponent(fieldNumero, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))))
																						.addGroup(javax.swing.GroupLayout.Alignment.TRAILING, telaEdicaoLayout.createSequentialGroup()
																								.addGap(0, 0, Short.MAX_VALUE)
																								.addComponent(confirmar, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
																								.addGap(633, 633, 633)
																								.addComponent(cancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
																								.addGroup(telaEdicaoLayout.createSequentialGroup()
																										.addComponent(jLabel35)
																										.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																										.addComponent(fieldEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 309, javax.swing.GroupLayout.PREFERRED_SIZE)
																										.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																										.addComponent(jLabel36)
																										.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																										.addComponent(fieldTelefone))
																										.addGroup(telaEdicaoLayout.createSequentialGroup()
																												.addGroup(telaEdicaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
																														.addGroup(telaEdicaoLayout.createSequentialGroup()
																																.addComponent(jLabel37)
																																.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
																																.addComponent(jSeparator5, javax.swing.GroupLayout.PREFERRED_SIZE, 685, javax.swing.GroupLayout.PREFERRED_SIZE))
																																.addGroup(telaEdicaoLayout.createSequentialGroup()
																																		.addComponent(jLabel34)
																																		.addGap(18, 18, 18)
																																		.addComponent(jSeparator6, javax.swing.GroupLayout.PREFERRED_SIZE, 673, javax.swing.GroupLayout.PREFERRED_SIZE))
																																		.addGroup(telaEdicaoLayout.createSequentialGroup()
																																				.addComponent(jLabel31)
																																				.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																																				.addComponent(fieldNome, javax.swing.GroupLayout.PREFERRED_SIZE, 488, javax.swing.GroupLayout.PREFERRED_SIZE)))
																																				.addGap(0, 0, Short.MAX_VALUE)))
																																				.addContainerGap())
				);
		telaEdicaoLayout.setVerticalGroup(
				telaEdicaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(telaEdicaoLayout.createSequentialGroup()
						.addGroup(telaEdicaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
								.addGroup(telaEdicaoLayout.createSequentialGroup()
										.addGap(47, 47, 47)
										.addGroup(telaEdicaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
												.addComponent(jLabel31)
												.addComponent(fieldNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
												.addGap(53, 53, 53)
												.addComponent(jLabel37))
												.addGroup(telaEdicaoLayout.createSequentialGroup()
														.addGap(130, 130, 130)
														.addComponent(jSeparator5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
														.addGap(33, 33, 33)
														.addGroup(telaEdicaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
																.addGroup(telaEdicaoLayout.createSequentialGroup()
																		.addGap(3, 3, 3)
																		.addGroup(telaEdicaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
																				.addComponent(jLabel35)
																				.addComponent(fieldEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
																				.addGroup(telaEdicaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
																						.addComponent(jLabel36)
																						.addComponent(fieldTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
																						.addGap(45, 45, 45)
																						.addGroup(telaEdicaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
																								.addComponent(jSeparator6, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
																								.addComponent(jLabel34))
																								.addGroup(telaEdicaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
																										.addGroup(telaEdicaoLayout.createSequentialGroup()
																												.addGap(27, 27, 27)
																												.addGroup(telaEdicaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
																														.addComponent(jLabel39)
																														.addComponent(fieldNumero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
																														.addGap(0, 0, Short.MAX_VALUE))
																														.addGroup(telaEdicaoLayout.createSequentialGroup()
																																.addGap(21, 21, 21)
																																.addGroup(telaEdicaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
																																		.addComponent(jLabel38)
																																		.addComponent(fieldRua, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
																																		.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
																																		.addGroup(telaEdicaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
																																				.addGroup(telaEdicaoLayout.createSequentialGroup()
																																						.addGroup(telaEdicaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
																																								.addGroup(telaEdicaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
																																										.addComponent(jLabel40)
																																										.addComponent(fieldBairro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
																																										.addGroup(javax.swing.GroupLayout.Alignment.TRAILING, telaEdicaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
																																												.addComponent(jLabel42)
																																												.addComponent(fieldCep, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
																																												.addGap(50, 50, 50)
																																												.addGroup(telaEdicaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
																																														.addComponent(confirmar)
																																														.addComponent(cancelar)))
																																														.addGroup(telaEdicaoLayout.createSequentialGroup()
																																																.addGap(3, 3, 3)
																																																.addGroup(telaEdicaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
																																																		.addComponent(jLabel44)
																																																		.addComponent(fieldCidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
																																																		.addContainerGap())))
				);

		javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
		getContentPane().setLayout(layout);
		layout.setHorizontalGroup(
				layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(layout.createSequentialGroup()
						.addContainerGap()
						.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
								.addComponent(telaEdicao, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
								.addGroup(layout.createSequentialGroup()
										.addComponent(label_nomeFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, 501, javax.swing.GroupLayout.PREFERRED_SIZE)
										.addGap(0, 0, Short.MAX_VALUE)))
										.addContainerGap())
				);
		layout.setVerticalGroup(
				layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(layout.createSequentialGroup()
						.addContainerGap()
						.addComponent(label_nomeFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
						.addComponent(telaEdicao, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addContainerGap())
				);

		pack();
	}// </editor-fold>                        

	private void cancelarMouseClicked(java.awt.event.MouseEvent evt) {                                          

		montarNovaTela();
	}                                         

	private void confirmarMouseClicked(java.awt.event.MouseEvent evt) {                                          

		nome = fieldNome.getText();
		email = fieldEmail.getText();
		telefone = fieldTelefone.getText();
		rua = fieldRua.getText();
		numero = fieldNumero.getText();
		bairro = (String) fieldBairro.getSelectedItem();
		cep = fieldCep.getText();
		cidade = (String) fieldCidade.getSelectedItem();

		String preenchimento= controle.editarUsuario(usuarioEdicao, nome, email, telefone, rua, numero, bairro, cep, cidade);

		if(!preenchimento.equals("Preencha todos os campos."))
			finalizarEdicao();
		else
			JOptionPane.showMessageDialog(null,"Preenchimento invalido!\nVerifique campos em branco.");
	}        

	private void finalizarEdicao(){

		montarNovaTela();
		JOptionPane.showMessageDialog(null,"Edicao realizada com sucesso!");
	}	

	public void insereUsuarioEdicao(Usuario usuario){

		usuarioEdicao= usuario;
	}

	public void preencheTela(Usuario usuariobusca){
		fieldNome.setText(usuarioEdicao.solicitaNome());
		fieldEmail.setText(usuarioEdicao.solicitaContato().solicitarEmail());
		fieldTelefone.setText(usuarioEdicao.solicitaContato().solicitarTelefone());
		fieldRua.setText(usuarioEdicao.solicitaEndereco().solicitarRua());
		fieldNumero.setText(usuarioEdicao.solicitaEndereco().solicitarNumero());
		fieldCep.setText(usuarioEdicao.solicitaEndereco().solicitarCep());
		fieldBairro.setToolTipText(usuarioEdicao.solicitaEndereco().solicitarBairro());
		fieldCidade.setToolTipText(usuarioEdicao.solicitaEndereco().solicitarCidade());
	}

	@Override
	public void insereFuncionario(Funcionario funcionario) {
		
		this.funcionario= funcionario;
		label_nomeFuncionario.setText("Nome do funcionario: " + funcionario.solicitarNome());	
	}

	@Override
	protected void montarNovaTela() {
		
		Tela tela= null;

		if(funcionario.solicitarFuncao().equals("Atendente"))
			tela= new TelaAtendente();

		else if(funcionario.solicitarFuncao().equals("Gerente"))
			tela = new TelaGerente();

		tela.setVisible(true);
		tela.insereFuncionario(funcionario);
		dispose();
		
	}      
}