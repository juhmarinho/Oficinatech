/*package busca;

import java.awt.event.ActionEvent;

import cadastro.TelaCadastroExemplar;
import cadastro.TelaCadastroObra;
import inicio.Tela;
import inicio.TelaAtendente;
import inicio.TelaBibliotecario;
import inicio.TelaGerente;
import patrimonio.Exemplar;
import patrimonio.Obra;
import rh.Funcionario;
import rh.Usuario;
import edicao.TelaEditarFuncionario;
import edicao.TelaEditarObra;
import edicao.TelaEditarUsuario;
import exclusao.TelaExclusao;
import exclusao.TelaExclusaoFuncionario;
import exclusao.TelaExclusaoObra;
import exclusao.TelaExclusaoUsuario;

public class TelaDetalhesObra extends Tela{

	private javax.swing.JButton button_editar;
	private javax.swing.JButton button_cancelar;
	private javax.swing.JButton button_excluir;
	private javax.swing.JButton button_novoExemplar;
	private javax.swing.JPanel jPanel1;
	private javax.swing.JScrollPane jScrollPane1;
	private javax.swing.JTextArea detalhes;
	private javax.swing.JLabel label_nomeFuncionario;

	private Funcionario funcionario;
	protected Obra obraBusca;

	public TelaDetalhesObra() {

		initComponents();
	}

	private void initComponents() {

		label_nomeFuncionario = new javax.swing.JLabel();
		jPanel1 = new javax.swing.JPanel();
		jScrollPane1 = new javax.swing.JScrollPane();
		detalhes = new javax.swing.JTextArea();
		button_editar = new javax.swing.JButton();
		button_cancelar = new javax.swing.JButton();
		button_excluir = new javax.swing.JButton();
		button_novoExemplar = new javax.swing.JButton();

		setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

		label_nomeFuncionario.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

		jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "DADOS"));

		detalhes.setColumns(20);
		detalhes.setRows(5);
		jScrollPane1.setViewportView(detalhes);

		button_editar.setText("Editar");
		button_editar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
		button_editar.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {

				editarMouseClicked(evt);
			}
		});

		button_cancelar.setText("Cancelar");
		button_cancelar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
		button_cancelar.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {

				cancelarMouseClicked(evt);
			}
		});

		button_excluir.setText("Excluir");
		button_excluir.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
		button_excluir.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {

				excluirMouseClicked(evt);
			}
		});

		button_novoExemplar.setText("Novo exemplar");
		button_novoExemplar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
		button_novoExemplar.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {

				cadastrarExemplarMouseClicked(evt);
			}
		});

		javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
		jPanel1.setLayout(jPanel1Layout);
		jPanel1Layout.setHorizontalGroup(
				jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(jPanel1Layout.createSequentialGroup()
						.addContainerGap()
						.addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
								.addComponent(jScrollPane1)
								.addGroup(jPanel1Layout.createSequentialGroup()
										.addComponent(button_excluir, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
										.addGap(161, 161, 161)
										.addComponent(button_editar, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
										.addGap(75, 75, 75)
										.addComponent(button_novoExemplar, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
										.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 93, Short.MAX_VALUE)
										.addComponent(button_cancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)))
										.addContainerGap())
				);
		jPanel1Layout.setVerticalGroup(
				jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(jPanel1Layout.createSequentialGroup()
						.addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 302, javax.swing.GroupLayout.PREFERRED_SIZE)
						.addGap(18, 18, 18)
						.addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
								.addComponent(button_excluir)
								.addComponent(button_editar)
								.addComponent(button_novoExemplar)
								.addComponent(button_cancelar))
								.addGap(0, 11, Short.MAX_VALUE))
				);

		javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
		getContentPane().setLayout(layout);
		layout.setHorizontalGroup(
				layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(layout.createSequentialGroup()
						.addComponent(label_nomeFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, 501, javax.swing.GroupLayout.PREFERRED_SIZE)
						.addGap(0, 0, Short.MAX_VALUE))
						.addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
				);
		layout.setVerticalGroup(
				layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(layout.createSequentialGroup()
						.addComponent(label_nomeFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
						.addGap(18, 18, 18)
						.addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addContainerGap())
				);

		pack();
	}// </editor-fold>//GEN-END:initComponents

	private void excluirMouseClicked(ActionEvent evt) {   

		TelaExclusao tela = new TelaExclusaoObra();
		tela.setVisible(true);
		tela.insereFuncionario(funcionario);
		tela.insereObraExclusao(obraBusca);
		dispose();
	}                                    

	private void editarMouseClicked(ActionEvent evt) {                                    

		TelaEditarObra tela = new TelaEditarObra();
		tela.setVisible(true);
		tela.insereFuncionario(funcionario);
		tela.insereObraEdicao(obraBusca);
		tela.preencheTela(obraBusca);
		dispose();
	}                                   

	private void cancelarMouseClicked(ActionEvent evt) {   

		montarNovaTela();
	}     
	
	private void cadastrarExemplarMouseClicked(ActionEvent evt) {   

		TelaCadastroExemplar tela = new TelaCadastroExemplar();
		tela.setVisible(true);
		tela.insereObraBusca(obraBusca);
		tela.insereFuncionario(funcionario);
		dispose();
	}     

	public void insereObraBusca(Obra obra){

		obraBusca= obra;
		detalhes.setText(obraBusca.toString());
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
*/