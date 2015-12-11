package busca;

import inicio.Tela;
import inicio.TelaAtendente;
import inicio.TelaLogin;
import inicio.TelaMecanico;

import java.awt.event.ItemEvent;
import java.awt.event.MouseEvent;
import java.util.ArrayList;

import javax.swing.ComboBoxModel;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;

import crud.ControleBusca;
import rh.Funcionario;


public abstract class TelaBusca extends Tela{

	private javax.swing.JButton cancelar;	
	private javax.swing.JButton buscar;
	private javax.swing.JButton logout;

	protected javax.swing.JComboBox buscarPor;
	protected javax.swing.JComboBox filtrarPor;

	protected javax.swing.JTextField fieldTermo;

	private javax.swing.JPanel telaBusca;

	private javax.swing.JLabel termoBusca;
	private javax.swing.JLabel termoBusca1;
	private javax.swing.JLabel termoBusca2;

	private javax.swing.JLabel label_nomeFuncionario;

	//----------------------------------------
	private Funcionario funcionario;
	protected ControleBusca controle;

	protected String busca, filtro, termo;

	//protected Usuario usuarioBusca;
	protected Funcionario funcionarioBusca;
	//protected Obra obraBusca;
	//protected Exemplar exemplarBusca;	

	//protected ArrayList<Usuario> arrayUsuarioBusca;
	protected ArrayList<Funcionario> arrayFuncionarioBusca;
	//protected ArrayList<Obra> arrayObraBusca;

	public TelaBusca() {

		initComponents(); 
		controle= new ControleBusca();
	}

	protected abstract void addBuscarPor();

	@SuppressWarnings("unchecked")
	private void initComponents() {

		label_nomeFuncionario = new javax.swing.JLabel();
		logout = new javax.swing.JButton();
		telaBusca = new javax.swing.JPanel();
		fieldTermo = new javax.swing.JTextField();
		buscarPor = new javax.swing.JComboBox();
		termoBusca = new javax.swing.JLabel();
		cancelar = new javax.swing.JButton();
		termoBusca1 = new javax.swing.JLabel();
		termoBusca2 = new javax.swing.JLabel();
		filtrarPor = new javax.swing.JComboBox();
		buscar = new javax.swing.JButton();

		setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

		label_nomeFuncionario.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

		logout.setText("Logout");
		logout.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
		logout.setPreferredSize(new java.awt.Dimension(30, 20));
		logout.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				logoutActionPerformed(evt);
			}
		});

		telaBusca.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "BUSCA"));

		addBuscarPor();

		buscarPor.addItemListener(new java.awt.event.ItemListener() {
			public void itemStateChanged(java.awt.event.ItemEvent evt) {
				escolherTipoItem(evt);
			}
		});

		termoBusca.setText("Buscar por:");

		cancelar.setText("CANCELAR");
		cancelar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
		cancelar.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mouseClicked(java.awt.event.MouseEvent evt) {
				cancelarMouseClicked(evt);
			}
		});

		termoBusca2.setText("Filtrar por:");

		buscar.setText("BUSCAR");
		buscar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
		buscar.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mouseClicked(java.awt.event.MouseEvent evt) {
				buscarMouseClicked(evt);
			}
		});

		javax.swing.GroupLayout telaBuscaLayout = new javax.swing.GroupLayout(telaBusca);
		telaBusca.setLayout(telaBuscaLayout);
		telaBuscaLayout.setHorizontalGroup(
				telaBuscaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(telaBuscaLayout.createSequentialGroup()
						.addGroup(telaBuscaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
								.addGroup(telaBuscaLayout.createSequentialGroup()
										.addContainerGap()
										.addComponent(cancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
										.addGroup(telaBuscaLayout.createSequentialGroup()
												.addGap(24, 24, 24)
												.addGroup(telaBuscaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
														.addGroup(telaBuscaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
																.addGroup(javax.swing.GroupLayout.Alignment.LEADING, telaBuscaLayout.createSequentialGroup()
																		.addComponent(termoBusca2)
																		.addGroup(telaBuscaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
																				.addGroup(telaBuscaLayout.createSequentialGroup()
																						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																						.addComponent(termoBusca1)
																						.addGap(44, 44, 44))
																						.addGroup(telaBuscaLayout.createSequentialGroup()
																								.addGap(22, 22, 22)
																								.addComponent(filtrarPor, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
																								.addGroup(telaBuscaLayout.createSequentialGroup()
																										.addComponent(termoBusca)
																										.addGap(18, 18, 18)
																										.addComponent(buscarPor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
																										.addGroup(telaBuscaLayout.createSequentialGroup()
																												.addComponent(fieldTermo, javax.swing.GroupLayout.PREFERRED_SIZE, 366, javax.swing.GroupLayout.PREFERRED_SIZE)
																												.addGap(18, 18, 18)
																												.addComponent(buscar, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)))
																												.addGap(0, 0, Short.MAX_VALUE)))
																												.addContainerGap())
				);
		telaBuscaLayout.setVerticalGroup(
				telaBuscaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(telaBuscaLayout.createSequentialGroup()
						.addGap(44, 44, 44)
						.addGroup(telaBuscaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
								.addComponent(termoBusca)
								.addComponent(buscarPor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
								.addGroup(telaBuscaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
										.addGroup(telaBuscaLayout.createSequentialGroup()
												.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
												.addGroup(telaBuscaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
														.addComponent(termoBusca2)
														.addComponent(filtrarPor, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)))
														.addGroup(telaBuscaLayout.createSequentialGroup()
																.addGap(31, 31, 31)
																.addComponent(termoBusca1)))
																.addGap(29, 29, 29)
																.addGroup(telaBuscaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
																		.addComponent(fieldTermo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
																		.addComponent(buscar))
																		.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 192, Short.MAX_VALUE)
																		.addGroup(telaBuscaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
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
								.addComponent(telaBusca, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
								.addGroup(layout.createSequentialGroup()
										.addComponent(label_nomeFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, 501, javax.swing.GroupLayout.PREFERRED_SIZE)
										.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
										.addComponent(logout, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)))
										.addContainerGap())
				);
		layout.setVerticalGroup(
				layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(layout.createSequentialGroup()
						.addContainerGap()
						.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
								.addComponent(logout, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
								.addComponent(label_nomeFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
								.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
								.addComponent(telaBusca, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
								.addContainerGap())
				);

		pack();
	}// </editor-fold>//GEN-END:initComponents

	private void logoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutActionPerformed

		TelaLogin tela = new TelaLogin();
		tela.setVisible(true);
		dispose();
	}

	private void cancelarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CancelarCadMouseClicked

		montarNovaTela();
	}

	protected abstract void buscarMouseClicked(MouseEvent evt);

	protected abstract void escolherTipoItem(java.awt.event.ItemEvent evt);

	private void mostrarUsuario(){ 

		TelaDetalhes tela= new TelaDetalhes();
		tela.setVisible(true);
		//tela.insereUsuarioBusca(usuarioBusca);
		tela.insereFuncionario(funcionario);
		dispose();
	}

	private void mostrarListaUsuarios(){

		TelaBuscaResultado tela= new TelaBuscaResultado();
		tela.setVisible(true);
		//	tela.insereUsuarioBusca(usuarioBusca);
		tela.insereFuncionario(funcionario);
		dispose();
	}

	private void mostrarFuncionario(){ 

		TelaDetalhes tela= new TelaDetalhes();
		tela.setVisible(true);
		tela.insereFuncionarioBusca(funcionarioBusca);
		tela.insereFuncionario(funcionario);
		dispose();
	}

	private void mostrarListaFuncionarios(){ 

		TelaBuscaResultado tela= new TelaBuscaResultado();
		tela.setVisible(true);
		//	tela.insereUsuarioBusca(usuarioBusca);
		tela.insereFuncionario(funcionario);
		dispose();
	}

	/*private void mostrarObra(){ 

		TelaDetalhesObra tela = new TelaDetalhesObra();
		tela.setVisible(true);
		//tela.insereObraBusca(obraBusca);
		tela.insereFuncionario(funcionario);
		dispose();
	}*/

	private void mostrarListaObras(){ 

		TelaBuscaResultado tela= new TelaBuscaResultado();
		tela.setVisible(true);
		//	tela.insereUsuarioBusca(usuarioBusca);
		tela.insereFuncionario(funcionario);
		dispose();
	}

	private void mostrarExemplar(){ 

		TelaDetalhesExemplar tela= new TelaDetalhesExemplar();
		tela.setVisible(true);
		//tela.insereExemplarBusca(exemplarBusca);
		tela.insereFuncionario(funcionario);
		dispose();
	}

	/*protected void buscarUsuario(){

		if(filtro.equals("Matricula"))
			usuarioBusca= controle.buscarUsuarioMatricula(termo);

		else if(filtro.equals("Nome"))
			arrayUsuarioBusca= controle.buscarUsuarioNome(termo);

		if(usuarioBusca!=null)
			mostrarUsuario();

		else if(arrayUsuarioBusca!=null)
			mostrarListaUsuarios();

		else
			JOptionPane.showMessageDialog(null, "Nao ha respostas para esta consulta.");
	}*/

	protected void buscarFuncionario(){

		if(filtro.equals("Matricula"))
			funcionarioBusca= controle.buscarFuncionarioMatricula(termo);

		else if(filtro.equals("Nome"))
			arrayFuncionarioBusca= controle.buscarFuncionarioNome(termo);

		if(funcionarioBusca!=null)
			mostrarFuncionario();

		else if(arrayFuncionarioBusca!=null)
			mostrarListaFuncionarios();

		else
			JOptionPane.showMessageDialog(null, "Nao ha respostas para esta consulta.");
	}

	/*protected void buscarObra(){

		if(filtro.equals("Codigo"))
			obraBusca= controle.buscarObraCodigo(termo);

		else if(filtro.equals("Nome"))
			arrayObraBusca= controle.buscarObraNome(termo);

		if(obraBusca!=null)
			mostrarObra();

		else if(arrayObraBusca!=null)
			mostrarListaObras();

		else
			JOptionPane.showMessageDialog(null, "Nao ha respostas para esta consulta.");
	}*/

	/*protected void buscarExemplar(){

		exemplarBusca= controle.buscarExemplar(termo);

		if(exemplarBusca!=null)
			mostrarExemplar();

		else
			JOptionPane.showMessageDialog(null, "Nao ha respostas para esta consulta.");
	}*/


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