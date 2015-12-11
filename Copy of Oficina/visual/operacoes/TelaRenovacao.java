package operacoes;

import java.awt.event.MouseEvent;

import javax.swing.JOptionPane;

import rh.Funcionario;
import rh.Usuario;

public class TelaRenovacao extends javax.swing.JFrame {

	private javax.swing.JButton cancelar;
	private javax.swing.JButton confirmar;

	private javax.swing.JLabel jLabel1;
	private javax.swing.JLabel jLabel3;
	private javax.swing.JPanel jPanel1;
	private javax.swing.JLabel usuarioSistema;

	private javax.swing.JTextField fieldTermo;

	//------------------
	private Funcionario funcionario;
	private Usuario usuarioEmprestimo;
	private String codigoEmprestimo;
	private ControleEmprestimo controle;
	
	public TelaRenovacao() {

		initComponents();
		controle= new ControleEmprestimo();
	}  

	@SuppressWarnings("unchecked")
	private void initComponents() {

		usuarioSistema = new javax.swing.JLabel();
		jPanel1 = new javax.swing.JPanel();
		confirmar = new javax.swing.JButton();
		cancelar = new javax.swing.JButton();
		jLabel1 = new javax.swing.JLabel();
		jLabel3 = new javax.swing.JLabel();
		fieldTermo = new javax.swing.JTextField();

		setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

		usuarioSistema.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

		jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "RENOVACAO"));

		confirmar.setText("Ok");
		confirmar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

		cancelar.setText("Cancelar");
		cancelar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

		jLabel3.setText("Codigo do emprestimo:");

		cancelar.setText("Cancelar");
		cancelar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
		cancelar.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mouseClicked(java.awt.event.MouseEvent evt) {
				cancelarMouseClicked(evt);
			}
		});
		
		confirmar.setText("Ok");
		confirmar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
		confirmar.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mouseClicked(java.awt.event.MouseEvent evt) {
				
				confirmarMouseClicked(evt);
			}
		});

		javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
		jPanel1.setLayout(jPanel1Layout);
		jPanel1Layout.setHorizontalGroup(
				jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(jPanel1Layout.createSequentialGroup()
						.addContainerGap()
						.addComponent(confirmar, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 446, Short.MAX_VALUE)
						.addComponent(cancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
						.addContainerGap())
						.addGroup(jPanel1Layout.createSequentialGroup()
								.addGap(19, 19, 19)
								.addComponent(jLabel3)
								.addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
										.addGroup(jPanel1Layout.createSequentialGroup()
												.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
												.addComponent(jLabel1))
												.addGroup(jPanel1Layout.createSequentialGroup()
														.addGap(15, 15, 15)
														.addComponent(fieldTermo, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)))
														.addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
				);
		jPanel1Layout.setVerticalGroup(
				jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(jPanel1Layout.createSequentialGroup()
						.addGap(24, 24, 24)
						.addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
								.addComponent(jLabel3)
								.addComponent(fieldTermo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
								.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
								.addComponent(jLabel1)
								.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 36, Short.MAX_VALUE)
								.addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
										.addComponent(confirmar)
										.addComponent(cancelar))
										.addContainerGap())
				);

		javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
		getContentPane().setLayout(layout);
		layout.setHorizontalGroup(
				layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(layout.createSequentialGroup()
						.addComponent(usuarioSistema, javax.swing.GroupLayout.PREFERRED_SIZE, 501, javax.swing.GroupLayout.PREFERRED_SIZE)
						.addGap(0, 0, Short.MAX_VALUE))
						.addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
				);
		layout.setVerticalGroup(
				layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(layout.createSequentialGroup()
						.addComponent(usuarioSistema, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 37, Short.MAX_VALUE)
						.addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
						.addGap(20, 20, 20))
				);

		pack();
	}

	protected void confirmarMouseClicked(MouseEvent evt) {
		
		codigoEmprestimo= fieldTermo.getText();
		Emprestimo emprestimo;

		if(!codigoEmprestimo.equals("")){

			emprestimo= controle.buscarEmprestimo(codigoEmprestimo);

			if(emprestimo!=null){
				controle.realizarRenovacao(codigoEmprestimo);
				finalizarRenovacao();

			}else
				JOptionPane.showMessageDialog(null, "Nao ha emprestimo ativo com esta identificacao no sistema.");
		}
		else
			JOptionPane.showMessageDialog(null, "Preenchimento invalido!\nVerifique campos em branco.");
		
	}
	
	private void finalizarRenovacao() {

		TelaRecibo tela = new TelaRecibo();
		tela.setVisible(true);
		tela.insereFuncionario(funcionario);
		tela.insereRenovacao(codigoEmprestimo);
		tela.insereUsuarioEmprestimo(usuarioEmprestimo);
		dispose();
		JOptionPane.showMessageDialog(null, "Renovacao realizada com sucesso!");
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

	public void insereFuncionario(Funcionario funcionario) {

		this.funcionario= funcionario;
		usuarioSistema.setText("Nome do funcionario: " + funcionario.solicitarNome());
	}
}
