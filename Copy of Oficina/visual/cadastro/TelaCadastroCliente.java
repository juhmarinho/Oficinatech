package cadastro;

import inicio.Tela;
import inicio.TelaAtendente;

import javax.swing.JOptionPane;

import crud.ControleCadastro;
import patrimonio.Carro;
//import busca.TelaDetalhesObra;
import rh.Funcionario;

public class TelaCadastroCliente extends Tela{

	private javax.swing.JButton CancelarCad;
	private javax.swing.JTextField field_edicao;
	private javax.swing.JTextField field_isbn;
	private javax.swing.JButton confirmarCad;
	private javax.swing.JLabel jLabel1;
	private javax.swing.JLabel jLabel2;
	private javax.swing.JLabel jLabel3;
	private javax.swing.JLabel jLabel4;
	private javax.swing.JPanel jPanel1;
	private javax.swing.JLabel label_nomeFuncionario;
	// ----------------------
	protected Carro carroBusca;
	private String edicao, isbn, codigo;
	private ControleCadastro controle;
	
	public TelaCadastroCliente() {

		iniciarComponentes();
	}

	private void iniciarComponentes() {

		controle= new ControleCadastro();
		label_nomeFuncionario = new javax.swing.JLabel();
		jPanel1 = new javax.swing.JPanel();
		jLabel1 = new javax.swing.JLabel();
		field_edicao = new javax.swing.JTextField();
		jLabel2 = new javax.swing.JLabel();
		field_isbn = new javax.swing.JTextField();
		jLabel3 = new javax.swing.JLabel();
		jLabel4 = new javax.swing.JLabel();
		confirmarCad = new javax.swing.JButton();
		CancelarCad = new javax.swing.JButton();

		setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
		setResizable(false);

		label_nomeFuncionario.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

		jPanel1.setBackground(new java.awt.Color(204, 204, 204));
		jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Cadastrar exemplar"));

		jLabel1.setText("EDICAO:");
		jLabel2.setText("ISBN:");

		confirmarCad.setText("OK");
		confirmarCad.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
		confirmarCad.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mouseClicked(java.awt.event.MouseEvent evt) {
				confirmarCadMouseClicked(evt);
			}
		});

		CancelarCad.setText("CANCELAR");
		CancelarCad.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
		CancelarCad.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mouseClicked(java.awt.event.MouseEvent evt) {
				CancelarCadMouseClicked(evt);
			}
		});

		javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
		jPanel1.setLayout(jPanel1Layout);
		jPanel1Layout.setHorizontalGroup(
				jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(jPanel1Layout.createSequentialGroup()
						.addContainerGap()
						.addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
								.addGroup(jPanel1Layout.createSequentialGroup()
										.addGap(0, 0, Short.MAX_VALUE))
										.addGroup(jPanel1Layout.createSequentialGroup()
												.addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
														.addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
																.addComponent(confirmarCad, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
																.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
																.addComponent(CancelarCad, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
																.addGroup(jPanel1Layout.createSequentialGroup()
																		.addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
																				.addComponent(jLabel1)
																				.addComponent(jLabel2))
																				.addGap(18, 18, 18)
																				.addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
																						.addComponent(field_edicao, javax.swing.GroupLayout.DEFAULT_SIZE, 548, Short.MAX_VALUE)
																						.addComponent(field_isbn)))
																						.addGroup(jPanel1Layout.createSequentialGroup()
																								.addComponent(jLabel4)
																								.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
																								.addGroup(jPanel1Layout.createSequentialGroup()
																										.addComponent(jLabel3)
																										.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
																										.addContainerGap())))
				);
		jPanel1Layout.setVerticalGroup(
				jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(jPanel1Layout.createSequentialGroup()
						.addContainerGap()
						.addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
								.addComponent(jLabel1)
								.addComponent(field_edicao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
								.addGap(37, 37, 37)
								.addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
										.addComponent(field_isbn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
										.addComponent(jLabel2))
										.addGap(38, 38, 38)
										.addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
												.addComponent(jLabel3))
												.addGap(22, 22, 22)
												.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
												.addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
														.addComponent(jLabel4))
														.addGap(18, 18, 18)
														.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 71, Short.MAX_VALUE)
														.addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
																.addComponent(CancelarCad)
																.addComponent(confirmarCad))
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
										.addGap(0, 0, Short.MAX_VALUE))
										.addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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

	private void confirmarCadMouseClicked(java.awt.event.MouseEvent evt) {     

		edicao = field_edicao.getText();
		isbn = field_isbn.getText(); 

		codigo= controle.cadastrarExemplar(edicao, isbn, carroBusca.solicitarCodigo());

		if(!codigo.equals("Preencha todos os campos."))
			finalizarCadastro();
		else
			JOptionPane.showMessageDialog(null,"Preenchimento invalido!\nVerifique campos em branco.");
	}                                         

	private void CancelarCadMouseClicked(java.awt.event.MouseEvent evt) {  

		montarNovaTela();
	} 
	
	private void finalizarCadastro(){

		montarNovaTela();
		JOptionPane.showMessageDialog(null,"Cadastro realizado com sucesso!\nCodigo do novo exemplar" + codigo);
	}
	
	public void insereObraBusca(Carro carro){

		carroBusca= carro;
	}

	@Override
	public void insereFuncionario(Funcionario funcionario) {

		this.funcionario= funcionario;
		label_nomeFuncionario.setText("Nome do funcionario: " + funcionario.solicitarNome());	
	}

	@Override
	protected void montarNovaTela() {
		// TODO Auto-generated method stub
		
	}

	
	/*protected void montarNovaTela() {

		TelaDetalhesObra tela= new TelaDetalhesObra();
		tela.setVisible(true);
		tela.insereObraBusca(obraBusca);
		tela.insereFuncionario(funcionario);
		dispose();
	}*/
}