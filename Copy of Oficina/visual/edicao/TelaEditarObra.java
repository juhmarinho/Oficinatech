package edicao;

import inicio.Tela;
import inicio.TelaAtendente;
import inicio.TelaBibliotecario;
import inicio.TelaGerente;

import javax.swing.JOptionPane;

import patrimonio.Obra;
import rh.Funcionario;
import rh.Usuario;
import crud.ControleEdicao;

public class TelaEditarObra extends Tela{

	private javax.swing.JButton cancelar;
	private javax.swing.JButton confirmar;

	private javax.swing.JTextField fieldAssunto;
	private javax.swing.JTextField fieldAutor;  
	private javax.swing.JTextArea fieldObservacao;
	private javax.swing.JTextField fieldTitulo;
	private javax.swing.JTextField fieldEditora;

	private javax.swing.JLabel jLabel1;
	private javax.swing.JLabel jLabel2;
	private javax.swing.JLabel jLabel3;
	private javax.swing.JLabel jLabel4;
	private javax.swing.JLabel jLabel5;

	private javax.swing.JScrollPane jScrollPane2;

	private javax.swing.JPanel telaCadastro;
	private javax.swing.JLabel label_nomeFuncionario;

	//------------------
	private String titulo, autores, editora, observacoes, assuntos;

	private ControleEdicao controle;
	private Funcionario funcionario;

	private Obra obraEdicao;

	public TelaEditarObra() {

		initComponents();
		controle= new ControleEdicao();
	}

	@SuppressWarnings("unchecked")                          
	private void initComponents() {

		label_nomeFuncionario = new javax.swing.JLabel();
		telaCadastro = new javax.swing.JPanel();
		jLabel1 = new javax.swing.JLabel();
		fieldTitulo = new javax.swing.JTextField();
		jLabel2 = new javax.swing.JLabel();
		fieldAutor = new javax.swing.JTextField();
		jLabel3 = new javax.swing.JLabel();
		fieldAssunto = new javax.swing.JTextField();
		jLabel4 = new javax.swing.JLabel();
		confirmar = new javax.swing.JButton();
		cancelar = new javax.swing.JButton();
		jScrollPane2 = new javax.swing.JScrollPane();
		fieldObservacao = new javax.swing.JTextArea();
		fieldEditora = new javax.swing.JTextField();
		jLabel5 = new javax.swing.JLabel();

		setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
		setResizable(false);

		label_nomeFuncionario.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

		telaCadastro.setBackground(new java.awt.Color(204, 204, 204));
		telaCadastro.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "EDITAR OBRA"));

		jLabel1.setText("TÍTULO:");

		fieldTitulo.setText("titulo");

		jLabel2.setText("AUTOR:");

		fieldAutor.setText("autor");

		jLabel3.setText("ASSUNTO:");

		fieldAssunto.setFont(new java.awt.Font("Tahoma", 2, 11)); // NOI18N
		fieldAssunto.setText("Palavras-chave");

		jLabel4.setText("OBSERVAÇÕES:");

		confirmar.setText("OK");
		confirmar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
		confirmar.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mouseClicked(java.awt.event.MouseEvent evt) {
				confirmarEdicMouseClicked(evt);
			}
		});

		cancelar.setText("CANCELAR");
		cancelar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
		cancelar.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mouseClicked(java.awt.event.MouseEvent evt) {
				cancelarMouseClicked(evt);
			}
		});

		fieldObservacao.setColumns(20);
		fieldObservacao.setRows(5);
		fieldObservacao.setText("observacoes\n");
		jScrollPane2.setViewportView(fieldObservacao);

		fieldEditora.setText("editora");

		jLabel5.setText("EDITORA:");

		javax.swing.GroupLayout telaCadastroLayout = new javax.swing.GroupLayout(telaCadastro);
		telaCadastro.setLayout(telaCadastroLayout);
		telaCadastroLayout.setHorizontalGroup(
				telaCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(telaCadastroLayout.createSequentialGroup()
						.addGroup(telaCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
								.addGroup(telaCadastroLayout.createSequentialGroup()
										.addContainerGap()
										.addComponent(confirmar, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
										.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
										.addComponent(cancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
										.addGroup(telaCadastroLayout.createSequentialGroup()
												.addGroup(telaCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
														.addGroup(javax.swing.GroupLayout.Alignment.TRAILING, telaCadastroLayout.createSequentialGroup()
																.addComponent(jLabel1)
																.addGap(57, 57, 57))
																.addGroup(telaCadastroLayout.createSequentialGroup()
																		.addContainerGap()
																		.addGroup(telaCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
																				.addComponent(jLabel4)
																				.addComponent(jLabel2)
																				.addComponent(jLabel3)
																				.addComponent(jLabel5))
																				.addGap(18, 18, 18)))
																				.addGroup(telaCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
																						.addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 593, javax.swing.GroupLayout.PREFERRED_SIZE)
																						.addGroup(telaCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
																								.addComponent(fieldEditora, javax.swing.GroupLayout.PREFERRED_SIZE, 433, javax.swing.GroupLayout.PREFERRED_SIZE)
																								.addGroup(telaCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
																										.addComponent(fieldAssunto, javax.swing.GroupLayout.DEFAULT_SIZE, 433, Short.MAX_VALUE)
																										.addComponent(fieldTitulo)
																										.addComponent(fieldAutor))))
																										.addGap(0, 62, Short.MAX_VALUE)))
																										.addContainerGap())
				);
		telaCadastroLayout.setVerticalGroup(
				telaCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(telaCadastroLayout.createSequentialGroup()
						.addGroup(telaCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
								.addGroup(telaCadastroLayout.createSequentialGroup()
										.addContainerGap()
										.addComponent(jLabel1))
										.addComponent(fieldTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
										.addGap(54, 54, 54)
										.addGroup(telaCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
												.addComponent(fieldAutor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
												.addComponent(jLabel2))
												.addGap(48, 48, 48)
												.addGroup(telaCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
														.addComponent(fieldEditora, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
														.addComponent(jLabel5))
														.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 48, Short.MAX_VALUE)
														.addGroup(telaCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
																.addComponent(fieldAssunto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
																.addComponent(jLabel3))
																.addGap(54, 54, 54)
																.addGroup(telaCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
																		.addComponent(jLabel4)
																		.addGroup(telaCadastroLayout.createSequentialGroup()
																				.addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
																				.addGap(37, 37, 37)
																				.addGroup(telaCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
																						.addComponent(confirmar)
																						.addComponent(cancelar))))
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
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
						.addComponent(telaCadastro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addGap(16, 16, 16))
				);

		pack();
	}// </editor-fold>                        

	private void confirmarEdicMouseClicked(java.awt.event.MouseEvent evt) {                                           

		titulo = fieldTitulo.getText();
		autores = fieldAutor.getText();        
		observacoes = fieldObservacao.getText();
		assuntos = fieldAssunto.getText();
		editora= fieldEditora.getText();

		String preenchimento= controle.editarObra(obraEdicao, titulo, autores, assuntos, editora, observacoes);

		if(!preenchimento.equals("Preencha todos os campos."))
			finalizarEdicao();
		else
			JOptionPane.showMessageDialog(null,"Preenchimento invalido!\nVerifique campos em branco.");
	}                                          

	private void cancelarMouseClicked(java.awt.event.MouseEvent evt) {                                          

		montarNovaTela();
	}                                         

	private void finalizarEdicao(){

		montarNovaTela();
		JOptionPane.showMessageDialog(null,"Edicao realizada com sucesso!");
	}

	public void preencheTela(Obra obrabusca){


		fieldTitulo.setText(obraEdicao.solicitarTitulo());
		fieldAutor.setText(obraEdicao.solicitarAutores());
		fieldAssunto.setText(obraEdicao.solicitarAssuntos());
		fieldObservacao.setText(obraEdicao.solicitarObservacoes());
		fieldEditora.setText(obraEdicao.solicitarEditora());
	}

	public void insereObraEdicao(Obra obra){

		obraEdicao= obra;
	}

	@Override
	public void insereFuncionario(Funcionario funcionario) {

		this.funcionario= funcionario;
		label_nomeFuncionario.setText("Nome do funcionario: " + funcionario.solicitarNome());	
	}

	@Override
	protected void montarNovaTela() { 

		Tela tela= null;

		if(funcionario.solicitarFuncao().equals("Gerente"))
			tela = new TelaGerente();

		else if(funcionario.solicitarFuncao().equals("Bibliotecario"))
			tela = new TelaBibliotecario();

		tela.setVisible(true);
		tela.insereFuncionario(funcionario);
		dispose();
	}                    
}