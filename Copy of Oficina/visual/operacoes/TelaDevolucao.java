package operacoes;

import inicio.Tela;

import java.awt.event.MouseEvent;

import javax.swing.JOptionPane;

import rh.Funcionario;
import rh.Usuario;

public class TelaDevolucao extends Tela{

	private javax.swing.JButton cancelar;	
	private javax.swing.JButton devolver;
	protected javax.swing.JTextField fieldTermo;

	private javax.swing.JPanel telaBusca;

	private javax.swing.JLabel termoBusca;
	private javax.swing.JLabel termoBusca1;

	private javax.swing.JLabel label_nomeFuncionario;

	//----------------
	private ControleEmprestimo controle;
	private Funcionario funcionario;
//	private Usuario usuarioEmprestimo;
	private String codigoEmprestimo;

	public TelaDevolucao() {

		initComponents(); 
		controle= new ControleEmprestimo();
	}

	private void initComponents() {

		label_nomeFuncionario = new javax.swing.JLabel();
		telaBusca = new javax.swing.JPanel();
		fieldTermo = new javax.swing.JTextField();
		termoBusca = new javax.swing.JLabel();
		cancelar = new javax.swing.JButton();
		termoBusca1 = new javax.swing.JLabel();
		devolver = new javax.swing.JButton();

		setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

		label_nomeFuncionario.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

		telaBusca.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Devolucao"));

		termoBusca.setText("Emprestimo:");

		cancelar.setText("Cancelar");
		cancelar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
		cancelar.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mouseClicked(java.awt.event.MouseEvent evt) {
				cancelarMouseClicked(evt);
			}
		});

		devolver.setText("Devolver");
		devolver.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
		devolver.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mouseClicked(java.awt.event.MouseEvent evt) {

				devolverMouseClicked(evt);
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
																		.addGroup(telaBuscaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
																				.addGroup(telaBuscaLayout.createSequentialGroup()
																						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																						.addComponent(termoBusca1)
																						.addGap(44, 44, 44))
																						.addGroup(telaBuscaLayout.createSequentialGroup()
																								.addGap(22, 22, 22)
																								)))
																								.addGroup(telaBuscaLayout.createSequentialGroup()
																										.addComponent(termoBusca)
																										.addGap(18, 18, 18)
																										))
																										.addGroup(telaBuscaLayout.createSequentialGroup()
																												.addComponent(fieldTermo, javax.swing.GroupLayout.PREFERRED_SIZE, 366, javax.swing.GroupLayout.PREFERRED_SIZE)
																												.addGap(18, 18, 18)
																												.addComponent(devolver, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)))
																												.addGap(0, 0, Short.MAX_VALUE)))
																												.addContainerGap())
				);
		telaBuscaLayout.setVerticalGroup(
				telaBuscaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(telaBuscaLayout.createSequentialGroup()
						.addGap(44, 44, 44)
						.addGroup(telaBuscaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
								.addComponent(termoBusca)
								)
								.addGroup(telaBuscaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
										.addGroup(telaBuscaLayout.createSequentialGroup()
												.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
												.addGroup(telaBuscaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
														))
														.addGroup(telaBuscaLayout.createSequentialGroup()
																.addGap(31, 31, 31)
																.addComponent(termoBusca1)))
																.addGap(29, 29, 29)
																.addGroup(telaBuscaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
																		.addComponent(fieldTermo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
																		.addComponent(devolver))
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
										))
										.addContainerGap())
				);
		layout.setVerticalGroup(
				layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(layout.createSequentialGroup()
						.addContainerGap()
						.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
								.addComponent(label_nomeFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
								.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
								.addComponent(telaBusca, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
								.addContainerGap())
				);

		pack();
	}

	private void devolverMouseClicked(MouseEvent evt) {

		codigoEmprestimo= fieldTermo.getText();
		Emprestimo emprestimo;

		if(!codigoEmprestimo.equals("")){

			emprestimo= controle.buscarEmprestimo(codigoEmprestimo);

			if(emprestimo!=null){
				controle.realizarDevolucao(codigoEmprestimo);
				finalizarDevolucao();

			}else
				JOptionPane.showMessageDialog(null, "Nao ha emprestimo ativo com esta identificacao no sistema.");
		}
		else
			JOptionPane.showMessageDialog(null, "Preenchimento invalido!\nVerifique campos em branco.");
	}

	private void finalizarDevolucao() {

		montarNovaTela();
		JOptionPane.showMessageDialog(null, "Devolucao realizada com sucesso!");
	}

	private void cancelarMouseClicked(java.awt.event.MouseEvent evt) {

		TelaOperacao tela = new TelaOperacao();
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
		
		TelaRecibo tela = new TelaRecibo();
		tela.setVisible(true);
		tela.insereFuncionario(funcionario);
		tela.insereDevolucao(codigoEmprestimo);
		tela.insereUsuarioEmprestimo(usuarioEmprestimo);
		dispose();
	}           
}
