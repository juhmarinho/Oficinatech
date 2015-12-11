package operacoes;

import inicio.Tela;

import javax.swing.JOptionPane;

import rh.Funcionario;
import rh.Usuario;

public class TelaEmprestimo extends Tela{

	private javax.swing.JLabel labelCodigoExemplar;
	private javax.swing.JButton cancelar;
	private javax.swing.JButton confirmar;
	private javax.swing.JTextField fieldCodigoExemplar;
	private javax.swing.JPanel jPanel1;
	private javax.swing.JLabel label_nomeFuncionario;

	private String codigoExemplar, codigoEmprestimo;
	
	private ControleEmprestimo controle;
	private Funcionario funcionario;
	private Usuario usuarioEmprestimo;

	public TelaEmprestimo() {

		initComponents();
		controle= new ControleEmprestimo();
	}

	private void initComponents() {

		label_nomeFuncionario = new javax.swing.JLabel();
		jPanel1 = new javax.swing.JPanel();
		labelCodigoExemplar = new javax.swing.JLabel();
		fieldCodigoExemplar = new javax.swing.JTextField();
		confirmar = new javax.swing.JButton();
		cancelar = new javax.swing.JButton();

		setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
		setResizable(false);

		label_nomeFuncionario.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

		jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Emprestimo"));

		labelCodigoExemplar.setText("CODIGO EXEMPLAR:");

		fieldCodigoExemplar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

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

		javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
		jPanel1.setLayout(jPanel1Layout);
		jPanel1Layout.setHorizontalGroup(
				jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(jPanel1Layout.createSequentialGroup()
						.addContainerGap()
						.addComponent(confirmar, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addComponent(cancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
						.addContainerGap())
						.addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
								.addGap(0, 334, Short.MAX_VALUE)
								.addComponent(labelCodigoExemplar, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
								.addGap(296, 296, 296))
								.addGroup(jPanel1Layout.createSequentialGroup()
										.addGap(150, 150, 150)
										.addComponent(fieldCodigoExemplar, javax.swing.GroupLayout.PREFERRED_SIZE, 454, javax.swing.GroupLayout.PREFERRED_SIZE)
										.addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
				);
		jPanel1Layout.setVerticalGroup(
				jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(jPanel1Layout.createSequentialGroup()
						.addContainerGap(97, Short.MAX_VALUE)
						.addComponent(labelCodigoExemplar)
						.addGap(49, 49, 49)
						.addComponent(fieldCodigoExemplar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
						.addGap(218, 218, 218)
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
						.addContainerGap()
						.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
								.addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
										.addComponent(label_nomeFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, 501, javax.swing.GroupLayout.PREFERRED_SIZE)
										.addGap(0, 0, Short.MAX_VALUE))
										.addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
										.addContainerGap())
				);
		layout.setVerticalGroup(
				layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(layout.createSequentialGroup()
						.addContainerGap()
						.addComponent(label_nomeFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
						.addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addContainerGap())
				);

		pack();
	}// </editor-fold>                        

	private void cancelarMouseClicked(java.awt.event.MouseEvent evt) {                                         

		TelaOperacao tela = new TelaOperacao();
		tela.setVisible(true);
		tela.insereFuncionario(funcionario);
		tela.insereUsuarioEmprestimo(usuarioEmprestimo);
		dispose();
	}                                        

	private void confirmarMouseClicked(java.awt.event.MouseEvent evt) {                                          

		codigoExemplar= fieldCodigoExemplar.getText();

		codigoEmprestimo= controle.realizarEmprestimo(usuarioEmprestimo, codigoExemplar);

		if(!verificarConfirmacao())
			JOptionPane.showMessageDialog(null, codigoEmprestimo);
		else
			finalizarEmprestimo();
	}        
	
	private boolean verificarConfirmacao(){

		if(codigoEmprestimo.equals("Usuario bloqueado."))
			return false;
		
		else if(codigoEmprestimo.equals("Usuario atingiu o limite de operacoes permitido."))
			return false;

		else if(codigoEmprestimo.equals("Exemplar indisponivel"))
			return false;
		
		return true;
	}

	public void finalizarEmprestimo(){

		montarNovaTela();   
		JOptionPane.showMessageDialog(null,"Emprestimo realizado com sucesso!\nCodigo do emprestimo: " + codigoEmprestimo);
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
		tela.insereEmprestimo(codigoEmprestimo);
		tela.insereUsuarioEmprestimo(usuarioEmprestimo);
		dispose();
	}            
}