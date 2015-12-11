package edicao;

import inicio.Tela;
import inicio.TelaAtendente;
import inicio.TelaBibliotecario;
import inicio.TelaGerente;

import javax.swing.JOptionPane;

import crud.ControleEdicao;
import rh.Funcionario;
import rh.Usuario;

public class TelaEditarFuncionario extends Tela {

	private javax.swing.JButton cancelar;
	private javax.swing.JButton confirmar;

	private javax.swing.JTextField fieldCep;
	private javax.swing.JTextField fieldEmail;
	private javax.swing.JTextField fieldNome;	
	private javax.swing.JTextField fieldNumero;	
	private javax.swing.JTextField fieldRua;
	private javax.swing.JTextField fieldTelefone;

	private javax.swing.JComboBox fieldBairro;
	private javax.swing.JComboBox fieldCidade;

	private javax.swing.JLabel jLabel10;
	private javax.swing.JLabel jLabel11;
	private javax.swing.JLabel jLabel12;
	private javax.swing.JLabel jLabel14;
	private javax.swing.JLabel jLabel16;
	private javax.swing.JLabel jLabel3;
	private javax.swing.JLabel jLabel6;
	private javax.swing.JLabel jLabel7;
	private javax.swing.JLabel jLabel8;
	private javax.swing.JLabel jLabel9;

	private javax.swing.JSeparator jSeparator1;
	private javax.swing.JSeparator jSeparator2;

	private javax.swing.JPanel telaCadastro;
	private javax.swing.JLabel label_nomeFuncionario;

	//-----------------------
	private Funcionario funcionario;
	private Funcionario funcionarioEdicao;

	private ControleEdicao controle;

	String nome;
	String email;
	String telefone;
	String rua;
	String numero;
	String bairro;
	String cep;
	String pais;
	String cidade;
	String estado;
	String vinculoo;
	String senha;

	public TelaEditarFuncionario() {

		initComponents();
		controle= new ControleEdicao();
	}

	@SuppressWarnings("unchecked")
	// <editor-fold defaultstate="collapsed" desc="Generated Code">                          
	private void initComponents() {

		label_nomeFuncionario = new javax.swing.JLabel();
		telaCadastro = new javax.swing.JPanel();
		jLabel3 = new javax.swing.JLabel();
		fieldNome = new javax.swing.JTextField();
		jLabel6 = new javax.swing.JLabel();
		jLabel7 = new javax.swing.JLabel();
		jLabel8 = new javax.swing.JLabel();
		fieldTelefone = new javax.swing.JTextField();
		fieldEmail = new javax.swing.JTextField();
		jLabel9 = new javax.swing.JLabel();
		jLabel10 = new javax.swing.JLabel();
		jLabel11 = new javax.swing.JLabel();
		fieldRua = new javax.swing.JTextField();
		fieldNumero = new javax.swing.JTextField();
		jLabel12 = new javax.swing.JLabel();
		jLabel14 = new javax.swing.JLabel();
		fieldCep = new javax.swing.JTextField();
		confirmar = new javax.swing.JButton();
		cancelar = new javax.swing.JButton();
		jLabel16 = new javax.swing.JLabel();
		jSeparator1 = new javax.swing.JSeparator();
		jSeparator2 = new javax.swing.JSeparator();
		fieldBairro = new javax.swing.JComboBox();
		fieldCidade = new javax.swing.JComboBox();

		setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
		setResizable(false);

		label_nomeFuncionario.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

		telaCadastro.setBackground(new java.awt.Color(204, 204, 204));
		telaCadastro.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "EDITAR FUNCIONARIO"));

		jLabel3.setText("NOME:");

		fieldNome.setText("nome");

		jLabel6.setText("ENDERECO:");

		jLabel7.setText("E-MAIL:");

		jLabel8.setText("TELEFONE:");

		fieldTelefone.setText("telefone");

		fieldEmail.setText("email");

		jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
		jLabel9.setText("CONTATO:");

		jLabel10.setText("RUA:");

		jLabel11.setText("Nº:");

		fieldRua.setText("rua");

		fieldNumero.setText("numero");

		jLabel12.setText("BAIRRO:");

		jLabel14.setText("CEP:");

		fieldCep.setText("cep");

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

		jLabel16.setText("CIDADE:");

		fieldBairro.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

		fieldCidade.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

		javax.swing.GroupLayout telaCadastroLayout = new javax.swing.GroupLayout(telaCadastro);
		telaCadastro.setLayout(telaCadastroLayout);
		telaCadastroLayout.setHorizontalGroup(
				telaCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(telaCadastroLayout.createSequentialGroup()
						.addContainerGap()
						.addGroup(telaCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
								.addGroup(telaCadastroLayout.createSequentialGroup()
										.addComponent(confirmar, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
										.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
										.addComponent(cancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
										.addContainerGap())
										.addGroup(javax.swing.GroupLayout.Alignment.TRAILING, telaCadastroLayout.createSequentialGroup()
												.addGap(0, 0, Short.MAX_VALUE)
												.addComponent(jLabel11)
												.addGap(18, 18, 18)
												.addComponent(fieldNumero, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
												.addGap(137, 137, 137))
												.addGroup(telaCadastroLayout.createSequentialGroup()
														.addGroup(telaCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
																.addGroup(telaCadastroLayout.createSequentialGroup()
																		.addComponent(jLabel12)
																		.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																		.addComponent(fieldBairro, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE)
																		.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
																		.addComponent(jLabel16)
																		.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																		.addComponent(fieldCidade, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
																		.addGroup(telaCadastroLayout.createSequentialGroup()
																				.addGroup(telaCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
																						.addGroup(telaCadastroLayout.createSequentialGroup()
																								.addComponent(jLabel3)
																								.addGap(14, 14, 14)
																								.addComponent(fieldNome, javax.swing.GroupLayout.PREFERRED_SIZE, 285, javax.swing.GroupLayout.PREFERRED_SIZE))
																								.addGroup(telaCadastroLayout.createSequentialGroup()
																										.addComponent(jLabel10)
																										.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
																										.addComponent(fieldRua, javax.swing.GroupLayout.PREFERRED_SIZE, 444, javax.swing.GroupLayout.PREFERRED_SIZE)))
																										.addGap(0, 0, Short.MAX_VALUE)))
																										.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
																										.addComponent(jLabel14)
																										.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
																										.addComponent(fieldCep, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
																										.addGap(12, 12, 12))
																										.addGroup(javax.swing.GroupLayout.Alignment.TRAILING, telaCadastroLayout.createSequentialGroup()
																												.addComponent(jLabel6)
																												.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
																												.addComponent(jSeparator2)
																												.addContainerGap())
																												.addGroup(telaCadastroLayout.createSequentialGroup()
																														.addGroup(telaCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
																																.addGroup(telaCadastroLayout.createSequentialGroup()
																																		.addComponent(jLabel7)
																																		.addGap(17, 17, 17)
																																		.addComponent(fieldEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
																																		.addGap(121, 121, 121)
																																		.addComponent(jLabel8)
																																		.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
																																		.addComponent(fieldTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))
																																		.addGroup(telaCadastroLayout.createSequentialGroup()
																																				.addComponent(jLabel9)
																																				.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																																				.addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 685, javax.swing.GroupLayout.PREFERRED_SIZE)))
																																				.addGap(0, 18, Short.MAX_VALUE))))
				);
		telaCadastroLayout.setVerticalGroup(
				telaCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(telaCadastroLayout.createSequentialGroup()
						.addGap(43, 43, 43)
						.addGroup(telaCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
								.addComponent(fieldNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
								.addComponent(jLabel3))
								.addGap(58, 58, 58)
								.addGroup(telaCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
										.addComponent(jLabel9)
										.addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
										.addGap(18, 18, 18)
										.addGroup(telaCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
												.addComponent(fieldEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
												.addComponent(jLabel7)
												.addComponent(jLabel8)
												.addComponent(fieldTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
												.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 36, Short.MAX_VALUE)
												.addGroup(telaCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
														.addComponent(jSeparator2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
														.addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING))
														.addGap(28, 28, 28)
														.addGroup(telaCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
																.addComponent(jLabel10)
																.addComponent(fieldRua, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
																.addComponent(fieldNumero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
																.addComponent(jLabel11))
																.addGap(38, 38, 38)
																.addGroup(telaCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
																		.addComponent(jLabel12)
																		.addComponent(fieldBairro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
																		.addComponent(jLabel16)
																		.addComponent(fieldCidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
																		.addComponent(fieldCep, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
																		.addComponent(jLabel14))
																		.addGap(60, 60, 60)
																		.addGroup(telaCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
																				.addComponent(confirmar)
																				.addComponent(cancelar))
																				.addContainerGap())
				);

		javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
		getContentPane().setLayout(layout);
		layout.setHorizontalGroup(
				layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(layout.createSequentialGroup()
						.addContainerGap()
						.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
								.addGroup(layout.createSequentialGroup()
										.addComponent(label_nomeFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, 501, javax.swing.GroupLayout.PREFERRED_SIZE)
										.addGap(0, 279, Short.MAX_VALUE))
										.addComponent(telaCadastro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
										.addContainerGap())
				);
		layout.setVerticalGroup(
				layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(layout.createSequentialGroup()
						.addContainerGap()
						.addComponent(label_nomeFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
						.addGap(18, 18, 18)
						.addComponent(telaCadastro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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
		cep = fieldCep.getText();
		bairro = (String) fieldBairro.getSelectedItem(); 
		cidade = (String) fieldCidade.getSelectedItem();

		String preenchimento= controle.editarFuncionario(funcionarioEdicao, nome, email, telefone, rua, numero, bairro, cep, cidade);

		if(!preenchimento.equals("Preencha todos os campos."))
			finalizarEdicao();
		else
			JOptionPane.showMessageDialog(null,"Preenchimento invalido!\nVerifique campos em branco.");
	}            

	private void finalizarEdicao(){

		montarNovaTela();
		JOptionPane.showMessageDialog(null,"Edicao realizada com sucesso!");
	}

	public void preencheTela(Funcionario funcinarioBusca){
		fieldNome.setText(funcionarioEdicao.solicitarNome());
		fieldEmail.setText(funcionarioEdicao.solicitarContato().solicitarEmail());
		fieldTelefone.setText(funcionarioEdicao.solicitarContato().solicitarTelefone());
		fieldRua.setText(funcionarioEdicao.solicitarEndereco().solicitarRua());
		fieldNumero.setText(funcionarioEdicao.solicitarEndereco().solicitarNumero());
		fieldCep.setText(funcionarioEdicao.solicitarEndereco().solicitarCep());
	}

	public void insereFuncionarioEdicao(Funcionario funcionario){

		funcionarioEdicao= funcionario;
	}

	@Override
	public void insereFuncionario(Funcionario funcionario) {

		this.funcionario= funcionario;
		label_nomeFuncionario.setText("Nome do funcionario: " + funcionario.solicitarNome());	
	}

	@Override
	protected void montarNovaTela() { 

		Tela tela= tela = new TelaGerente();
		tela.setVisible(true);
		tela.insereFuncionario(funcionario);
		dispose();
	}         
}