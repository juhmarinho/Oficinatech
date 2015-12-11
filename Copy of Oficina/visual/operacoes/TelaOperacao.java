package operacoes;

import inicio.Tela;
import inicio.TelaAtendente;
import inicio.TelaGerente;
import rh.Funcionario;
import rh.Usuario;

public class TelaOperacao extends Tela{

	private javax.swing.JButton cancelar;
	private javax.swing.JButton devolucao;
	private javax.swing.JButton emprestimo;
	private javax.swing.JButton renovacao;
	private javax.swing.JButton reserva;
	private javax.swing.JPanel jPanel1;
	private javax.swing.JLabel label_nomeFuncionario;

	private Usuario usuarioEmprestimo;
	private Funcionario funcionario;

	public TelaOperacao() {

		initComponents();
	}

	private void initComponents() {

		label_nomeFuncionario = new javax.swing.JLabel();
		jPanel1 = new javax.swing.JPanel();
		emprestimo = new javax.swing.JButton();
		reserva = new javax.swing.JButton();
		renovacao = new javax.swing.JButton();
		devolucao = new javax.swing.JButton();
		cancelar = new javax.swing.JButton();

		setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
		setPreferredSize(new java.awt.Dimension(800, 500));
		setResizable(false);

		label_nomeFuncionario.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

		jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "EMPRESTIMOS"));

		emprestimo.setText("Emprestimo");
		emprestimo.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(0, 0, 0), new java.awt.Color(204, 204, 204)));
		emprestimo.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mouseClicked(java.awt.event.MouseEvent evt) {
				emprestimoMouseClicked(evt);
			}
		});

		reserva.setText("Reserva");
		reserva.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(0, 0, 0), new java.awt.Color(204, 204, 204)));
		reserva.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mouseClicked(java.awt.event.MouseEvent evt) {
				reservaMouseClicked(evt);
			}
		});

		renovacao.setText("Renovacao");
		renovacao.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(51, 51, 51), new java.awt.Color(204, 204, 204)));
		renovacao.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mouseClicked(java.awt.event.MouseEvent evt) {
				renovacaoMouseClicked(evt);
			}
		});

		devolucao.setText("Devolucao");
		devolucao.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(0, 0, 0), new java.awt.Color(204, 204, 204)));
		devolucao.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mouseClicked(java.awt.event.MouseEvent evt) {
				devolucaoMouseClicked(evt);
			}
		});

		cancelar.setText("Cancelar");
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
						.addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
								.addGroup(jPanel1Layout.createSequentialGroup()
										.addGap(296, 296, 296)
										.addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
												.addComponent(devolucao, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
												.addComponent(renovacao, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
												.addComponent(reserva, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
												.addComponent(emprestimo, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
												.addGroup(jPanel1Layout.createSequentialGroup()
														.addGap(337, 337, 337)
														.addComponent(cancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)))
														.addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
				);
		jPanel1Layout.setVerticalGroup(
				jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(jPanel1Layout.createSequentialGroup()
						.addContainerGap()
						.addComponent(emprestimo, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
						.addGap(25, 25, 25)
						.addComponent(reserva, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
						.addGap(18, 18, 18)
						.addComponent(renovacao, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
						.addGap(28, 28, 28)
						.addComponent(devolucao, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 67, Short.MAX_VALUE)
						.addComponent(cancelar)
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
										.addGap(0, 275, Short.MAX_VALUE)))
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
	}// </editor-fold>//GEN-END:initComponents

	private void cancelarMouseClicked(java.awt.event.MouseEvent evt) {

		montarNovaTela();
	}

	private void emprestimoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_EMPRESTIMOMouseClicked

		TelaEmprestimo tela = new TelaEmprestimo();
		tela.setVisible(true);
		tela.insereFuncionario(funcionario);
		tela.insereUsuarioEmprestimo(usuarioEmprestimo);
		dispose();
	}

	private void reservaMouseClicked(java.awt.event.MouseEvent evt) {
		
		dispose();
	}

	private void renovacaoMouseClicked(java.awt.event.MouseEvent evt) {

		TelaRenovacao tela = new TelaRenovacao();
		tela.setVisible(true);
		tela.insereFuncionario(funcionario);
		tela.insereUsuarioEmprestimo(usuarioEmprestimo);
		dispose();
	}

	private void devolucaoMouseClicked(java.awt.event.MouseEvent evt) {
		
		TelaDevolucao tela = new TelaDevolucao();
		tela.setVisible(true);
		tela.insereFuncionario(funcionario);
		tela.insereUsuarioEmprestimo(usuarioEmprestimo);
		dispose();
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
