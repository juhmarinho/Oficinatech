package operacoes;

import inicio.Tela;
import inicio.TelaAtendente;
import inicio.TelaBibliotecario;
import inicio.TelaGerente;

import java.util.ArrayList;

import edicao.TelaEditarFuncionario;
import edicao.TelaEditarObra;
import edicao.TelaEditarUsuario;
import exclusao.TelaExclusao;
import exclusao.TelaExclusaoFuncionario;
import exclusao.TelaExclusaoObra;
import exclusao.TelaExclusaoUsuario;
import patrimonio.Exemplar;
import patrimonio.Obra;
import rh.Funcionario;
import rh.Usuario;

public class TelaRecibo extends Tela {

	private javax.swing.JButton voltar;
	private javax.swing.JTextArea detalhes;
	private javax.swing.JPanel jPanel1;
	private javax.swing.JScrollPane jScrollPane2;
	private javax.swing.JLabel label_nomeFuncionario;

	private Funcionario funcionario;
	private ControleEmprestimo controle;
	private Emprestimo emprestimo;
	private Usuario usuarioEmprestimo;

	public TelaRecibo() {

		initComponents();
		controle= new ControleEmprestimo();
	}

	private void initComponents() {

		label_nomeFuncionario = new javax.swing.JLabel();
		jPanel1 = new javax.swing.JPanel();
		jScrollPane2 = new javax.swing.JScrollPane();
		detalhes = new javax.swing.JTextArea();
		voltar = new javax.swing.JButton();

		setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

		label_nomeFuncionario.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

		jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "DADOS "));

		detalhes.setEditable(false);
		detalhes.setColumns(20);
		detalhes.setRows(5);
		jScrollPane2.setViewportView(detalhes);

		voltar.setText("Voltar");
		voltar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
		voltar.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mouseClicked(java.awt.event.MouseEvent evt) {
				voltarMouseClicked(evt);
			}
		});

		javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
		jPanel1.setLayout(jPanel1Layout);
		jPanel1Layout.setHorizontalGroup(
				jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(jPanel1Layout.createSequentialGroup()
						.addContainerGap()
						.addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
								.addComponent(jScrollPane2)
								.addGroup(jPanel1Layout.createSequentialGroup()
										.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
										.addGap(264, 264, 264)
										.addComponent(voltar, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)))
										.addContainerGap())
				);
		jPanel1Layout.setVerticalGroup(
				jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
						.addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 371, Short.MAX_VALUE)
						.addGap(18, 18, 18)
						.addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
								.addComponent(voltar))
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
										.addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
	}                                               

	private void voltarMouseClicked(java.awt.event.MouseEvent evt) {                                                  

		montarNovaTela();
	}                                                 

	public void insereEmprestimo(String codigoEmprestimo){

		emprestimo= controle.buscarEmprestimo(codigoEmprestimo);
		detalhes.setText(emprestimo.gerarComprovante());
	}
	
	public void insereDevolucao(String codigoEmprestimo){

		emprestimo= controle.buscarDevolucao(codigoEmprestimo);
		detalhes.setText(emprestimo.gerarComprovante());
	}
	
	public void insereRenovacao(String codigoEmprestimo){

		emprestimo= controle.buscarEmprestimo(codigoEmprestimo);
		detalhes.setText(emprestimo.solicitarRenovacoes().gerarComprovante());
	}
	
	public void insereUsuarioEmprestimo(Usuario usuario){

		usuarioEmprestimo= usuario;
	}

	@Override
	public void insereFuncionario(Funcionario funcionario) {

		this.funcionario= funcionario;
		label_nomeFuncionario.setText("Nome do funcionario: " + funcionario.solicitarNome());	
	}

	@Override
	protected void montarNovaTela() {
		
		TelaOperacao tela = new TelaOperacao();
		tela.setVisible(true);
		tela.insereFuncionario(funcionario);
		tela.insereUsuarioEmprestimo(usuarioEmprestimo);
		dispose();
	}           
}