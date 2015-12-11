package busca;

import inicio.Tela;
import inicio.TelaAtendente;
import inicio.TelaMecanico;
import edicao.TelaEditarFuncionario;
import edicao.TelaEditarUsuario;
import exclusao.TelaExclusao;
import exclusao.TelaExclusaoExemplar;
import exclusao.TelaExclusaoFuncionario;
import exclusao.TelaExclusaoUsuario;
import rh.Funcionario;


public class TelaDetalhes extends Tela{

	private javax.swing.JButton cancelar;
	private javax.swing.JButton editar;
	private javax.swing.JButton excluir;
	private javax.swing.JTextArea detalhes;
	private javax.swing.JPanel jPanel1;
	private javax.swing.JScrollPane jScrollPane2;
	private javax.swing.JLabel label_nomeFuncionario;

	private Funcionario funcionario;

	//protected Usuario usuarioBusca;
	protected Funcionario funcionarioBusca;
	//protected Exemplar exemplarBusca;	

	public TelaDetalhes() {

		initComponents();
	}

	@SuppressWarnings("unchecked")                        
	private void initComponents() {

		label_nomeFuncionario = new javax.swing.JLabel();
		jPanel1 = new javax.swing.JPanel();
		excluir = new javax.swing.JButton();
		editar = new javax.swing.JButton();
		jScrollPane2 = new javax.swing.JScrollPane();
		detalhes = new javax.swing.JTextArea();
		cancelar = new javax.swing.JButton();

		setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

		label_nomeFuncionario.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

		jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "DADOS "));

		excluir.setText("EXCLUIR");
		excluir.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
		excluir.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mouseClicked(java.awt.event.MouseEvent evt) {
				excluirMouseClicked(evt);
			}
		});

		editar.setText("EDITAR");
		editar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
		editar.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mouseClicked(java.awt.event.MouseEvent evt) {
				editarMouseClicked(evt);
			}
		});

		detalhes.setEditable(false);
		detalhes.setColumns(20);
		detalhes.setRows(5);
		jScrollPane2.setViewportView(detalhes);

		cancelar.setText("CANCELAR");
		cancelar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
		cancelar.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mouseClicked(java.awt.event.MouseEvent evt) {
				cancelarMouseClicked(evt);
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
										.addComponent(excluir, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
										.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
										.addComponent(editar, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
										.addGap(264, 264, 264)
										.addComponent(cancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)))
										.addContainerGap())
				);
		jPanel1Layout.setVerticalGroup(
				jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
						.addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 371, Short.MAX_VALUE)
						.addGap(18, 18, 18)
						.addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
								.addComponent(excluir)
								.addComponent(editar)
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

	private void excluirMouseClicked(java.awt.event.MouseEvent evt) {                                     

		/*if(usuarioBusca != null){

			TelaExclusao tela = new TelaExclusaoUsuario();
			tela.setVisible(true);
			tela.insereFuncionario(funcionario);
			//tela.insereUsuarioExclusao(usuarioBusca);
			dispose();

		}else */
		if(funcionarioBusca != null){

			TelaExclusao tela = new TelaExclusaoFuncionario();
			tela.setVisible(true);
			tela.insereFuncionario(funcionario);
			tela.insereFuncionarioExclusao(funcionarioBusca);
			dispose();

		}
	}                                    

	private void editarMouseClicked(java.awt.event.MouseEvent evt) {                                    

		/*if(usuarioBusca != null){

			TelaEditarUsuario tela = new TelaEditarUsuario();
			tela.setVisible(true);
			tela.insereFuncionario(funcionario);
			tela.insereUsuarioEdicao(usuarioBusca);
			tela.preencheTela(usuarioBusca);
			dispose();

		}else*/ 
		if(funcionarioBusca != null){

			TelaEditarFuncionario tela = new TelaEditarFuncionario();
			tela.setVisible(true);
			tela.insereFuncionario(funcionario);
			tela.insereFuncionarioEdicao(funcionarioBusca);
			tela.preencheTela(funcionarioBusca);
			dispose();

		}
	}                                   

	private void cancelarMouseClicked(java.awt.event.MouseEvent evt) {                                                  

		montarNovaTela();
	}                                                 

	/*public void insereUsuarioBusca(Usuario usuario){

		usuarioBusca= usuario;
		detalhes.setText(usuarioBusca.toString());
	}*/

	public void insereFuncionarioBusca(Funcionario funcionario){

		funcionarioBusca= funcionario;
		detalhes.setText(funcionarioBusca.toString());
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

		else if(funcionario.solicitarFuncao().equals("Mecanico"))
			tela = new TelaMecanico();

		tela.setVisible(true);
		tela.insereFuncionario(funcionario);
		dispose();
	}                    
}