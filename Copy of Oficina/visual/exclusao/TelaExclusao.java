package exclusao;

import inicio.Tela;
import inicio.TelaAtendente;
import inicio.TelaBibliotecario;
import inicio.TelaGerente;

import javax.swing.JOptionPane;

import patrimonio.Exemplar;
import patrimonio.Obra;
import crud.ControleEdicao;
import crud.ControleExclusao;
import rh.Funcionario;
import rh.Usuario;

public abstract class TelaExclusao extends Tela{

	protected javax.swing.JTextArea textJustificativa;
	private java.awt.Label labelJustificativa;

	private javax.swing.JButton cancelar;
	private javax.swing.JButton confirmar;

	private javax.swing.JPanel jPanel1;
	private javax.swing.JScrollPane jScrollPane1;

	private javax.swing.JLabel label_nomeFuncionario;   

	String justificativa;
	private Funcionario funcionario;

	protected ControleExclusao controle;

	protected Usuario usuarioExclusao;
	protected Funcionario funcionarioExclusao;
	protected Obra obraExclusao;
	protected Exemplar exemplarExclusao;

	public TelaExclusao() {

		initComponents();
		controle= new ControleExclusao();
	}

	@SuppressWarnings("unchecked")                          
	private void initComponents() {

		label_nomeFuncionario = new javax.swing.JLabel();
		jPanel1 = new javax.swing.JPanel();
		labelJustificativa = new java.awt.Label();
		confirmar = new javax.swing.JButton();
		cancelar = new javax.swing.JButton();
		jScrollPane1 = new javax.swing.JScrollPane();
		textJustificativa = new javax.swing.JTextArea();

		setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
		setResizable(false);

		label_nomeFuncionario.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

		jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "EXCLUSAO"));

		labelJustificativa.setText("Justificativa:");

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

		textJustificativa.setColumns(20);
		textJustificativa.setRows(5);
		textJustificativa.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
		jScrollPane1.setViewportView(textJustificativa);

		javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
		jPanel1.setLayout(jPanel1Layout);
		jPanel1Layout.setHorizontalGroup(
				jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(jPanel1Layout.createSequentialGroup()
						.addContainerGap()
						.addComponent(confirmar, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 621, Short.MAX_VALUE)
						.addComponent(cancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
						.addContainerGap())
						.addGroup(jPanel1Layout.createSequentialGroup()
								.addGap(57, 57, 57)
								.addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 651, javax.swing.GroupLayout.PREFERRED_SIZE)
								.addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
								.addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
										.addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
										.addComponent(labelJustificativa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
										.addGap(340, 340, 340))
				);
		jPanel1Layout.setVerticalGroup(
				jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(jPanel1Layout.createSequentialGroup()
						.addGap(55, 55, 55)
						.addComponent(labelJustificativa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
						.addGap(77, 77, 77)
						.addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 151, Short.MAX_VALUE)
						.addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
								.addComponent(confirmar)
								.addComponent(cancelar))
								.addContainerGap())
				);

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
										.addGap(0, 0, Short.MAX_VALUE)))
										.addContainerGap())
				);
		layout.setVerticalGroup(
				layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(layout.createSequentialGroup()
						.addContainerGap()
						.addComponent(label_nomeFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
						.addGap(18, 18, 18)
						.addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addContainerGap())
				);

		pack();
	}// </editor-fold>                        

	protected abstract void confirmarMouseClicked(java.awt.event.MouseEvent evt);

	private void cancelarMouseClicked(java.awt.event.MouseEvent evt) { 

		montarNovaTela();
	}  	

	protected void finalizarExclusao(){

		montarNovaTela();
		JOptionPane.showMessageDialog(null,"Exclusao realizada com sucesso!");
	}

	public void insereUsuarioExclusao(Usuario usuario){

		usuarioExclusao= usuario;
	}

	public void insereFuncionarioExclusao(Funcionario funcionario){

		funcionarioExclusao= funcionario;
	}

	public void insereObraExclusao(Obra obra){

		obraExclusao= obra;
	}

	public void insereExemplarExclusao(Exemplar exemplar){

		exemplarExclusao= exemplar;
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

		else if(funcionario.solicitarFuncao().equals("Bibliotecario"))
			tela = new TelaBibliotecario();

		tela.setVisible(true);
		tela.insereFuncionario(funcionario);
		dispose();
	}              
}