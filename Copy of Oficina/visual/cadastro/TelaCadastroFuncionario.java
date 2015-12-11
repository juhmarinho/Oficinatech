package cadastro;

import inicio.Tela;

import java.awt.event.MouseEvent;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JSeparator;
import javax.swing.JTextField;

import crud.ControleCadastro;
import rh.Funcionario;

public class TelaCadastroFuncionario extends Tela {

	private JButton button_cancelar, button_confirmar;
	private JComboBox combo_funcao, combo_cidade;
	private JLabel label_nomeFuncionario, jLabel10, jLabel11, jLabel12, jLabel13, jLabel14, jLabel16, jLabel3, jLabel4, jLabel5, jLabel6, jLabel7, jLabel8, jLabel9;
	private JPasswordField field_senha;
	private JSeparator jSeparator1, jSeparator2, jSeparator3;
	private JTextField field_nome, field_cpf, field_telefone, field_email, field_rua, field_numero, field_bairro, field_cep;
	private JPanel telaCadastro;
	//-----------------------------
	private String matricula, nome, cpf, email, telefone, rua, numero, bairro, cep, cidade, vinculo, senha;
	private ControleCadastro controle;

	public TelaCadastroFuncionario() {

		iniciarComponentes();
	}

	private void iniciarComponentes() {

		controle= new ControleCadastro();
		label_nomeFuncionario = new JLabel();
		telaCadastro = new JPanel();
		jLabel3 = new JLabel();
		jLabel4 = new JLabel();
		field_nome = new JTextField();
		field_cpf = new JTextField();
		jLabel5 = new JLabel();
		jLabel6 = new JLabel();
		jLabel7 = new JLabel();
		jLabel8 = new JLabel();
		field_telefone = new JTextField();
		field_email = new JTextField();
		jLabel9 = new JLabel();
		jLabel10 = new JLabel();
		jLabel11 = new JLabel();
		field_rua = new JTextField();
		field_numero = new JTextField();
		field_cep = new JTextField();
		jLabel12 = new JLabel();
		field_bairro = new JTextField();
		button_confirmar = new JButton();
		button_cancelar = new JButton();
		jLabel16 = new JLabel();
		combo_funcao = new JComboBox();
		jSeparator1 = new JSeparator();
		jSeparator2 = new JSeparator();
		combo_cidade = new JComboBox();
		jLabel13 = new JLabel();
		jSeparator3 = new JSeparator();
		jLabel14 = new JLabel();
		field_senha = new JPasswordField();

		setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

		label_nomeFuncionario.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
		telaCadastro.setBackground(new java.awt.Color(204, 204, 204));
		telaCadastro.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Cadastrar funcionario"));

		jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
		
		jLabel3.setText("Nome:");
		jLabel4.setText("CPF:");
		jLabel5.setText("Vinculo:");
		jLabel6.setText("Endereco:");
		jLabel7.setText("E-mail:");
		jLabel8.setText("Telefone:");		
		jLabel9.setText("Contato:");
		jLabel10.setText("Rua:");
		jLabel11.setText("Numero:");
		jLabel16.setText("Cidade:");
		jLabel12.setText("Bairro:");
		jLabel13.setText("Identificacao");
		jLabel14.setText("Senha:");

		button_confirmar.setText("Ok");		
		button_confirmar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
		button_confirmar.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mouseClicked(java.awt.event.MouseEvent evt) {

				confirmarMouseClicked(evt);
			}});

		button_cancelar.setText("Cancelar");
		button_cancelar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
		button_cancelar.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mouseClicked(java.awt.event.MouseEvent evt) {

				cancelarMouseClicked(evt);
			}});

		combo_funcao.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Atendente", "Bibliotecario", "Gerente" }));
		combo_cidade.setModel(new DefaultComboBoxModel(new String[] { 
				"Angra dos Reis","Aperibão","Araruama",	"Areal","Armação dos Búzios","Arraial do Cabo","Barra do Piraí","Barra Mansa","Belford Roxo","Bom Jardim",	
				"Bom Jesus do Itabapoana","Cabo Frio","Cachoeiras de Macacu","Cambuci","Campos dos Goytacazes","Cantagalo",	"Carapebus","Cardoso Moreira",		
				"Carmo","Casimiro de Abreu","Comendador Levy Gasparian","Conceição de Macabu","Cordeiro","Duas Barras",	"Duque de Caxias","Engenheiro Paulo de Frontin",		
				"Guapimirim","Iguaba Grande","Itabora",	"Itaguaí","Italva","Itaocara","Itaperuna","Itatiaia","Japeri","Laje do Muriaé",	"Macaé","Macuco",	
				"Magé",	"Mangaratiba","Maricá",	"Mendes","Mesquita","Miguel Pereira","Miracema","Natividade","Nilópolis","Niterói","Nova Friburgo","Nova Iguaçu",		
				"Paracambi","Paraíba do Sul","Parati","Paty do Alferes","Petrópolis","Pinheiral","Piraí","Porciúncula","Porto Real","Quatis","Queimados","Quissamã",	
				"Resende","Rio Bonito",	"Rio de Janeiro","Rio Claro","Rio das Flores","Rio das Ostras",	"Santa Maria Madalena","Santo Antônio de Pádua","São Fidélis",		
				"São Francisco de Itabapoana","São Gonçalo","São João da Barra","São João de Meriti","São José de Ubá",	"São José do Vale do Rio Preto",		
				"São Pedro da Aldeia","São Sebastião do Alto","Sapucaia","Saquarema","Seropédica","Silva Jardim","Sumidouro","Tanguá","Teresópolis","Trajano de Morais",		
				"Três Rios","Valença","Varre-Sai","Vassouras","Volta Redonda"}));

		javax.swing.GroupLayout telaCadastroLayout = new javax.swing.GroupLayout(telaCadastro);
		telaCadastro.setLayout(telaCadastroLayout);
		telaCadastroLayout.setHorizontalGroup(
				telaCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(telaCadastroLayout.createSequentialGroup()
						.addGap(29, 29, 29)
						.addComponent(button_confirmar, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addComponent(button_cancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
						.addGap(27, 27, 27))
						.addGroup(telaCadastroLayout.createSequentialGroup()
								.addContainerGap()
								.addGroup(telaCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
										.addGroup(telaCadastroLayout.createSequentialGroup()
												.addComponent(jLabel7)
												.addGap(10, 10, 10)
												.addComponent(field_email, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
												.addGap(132, 132, 132)
												.addGroup(telaCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
														.addGroup(telaCadastroLayout.createSequentialGroup()
																.addComponent(jLabel8)
																.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
																.addComponent(field_telefone, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))
																.addGroup(telaCadastroLayout.createSequentialGroup()
																		.addGap(0, 0, Short.MAX_VALUE)
																		.addComponent(jLabel11)
																		.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
																		.addComponent(field_numero, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))))
																		.addGroup(telaCadastroLayout.createSequentialGroup()
																				.addGroup(telaCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
																						.addGroup(telaCadastroLayout.createSequentialGroup()
																								.addComponent(jLabel5)
																								.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																								.addComponent(combo_funcao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
																								.addComponent(jLabel4)
																								.addGroup(telaCadastroLayout.createSequentialGroup()
																										.addComponent(jLabel3)
																										.addGap(18, 18, 18)
																										.addGroup(telaCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
																												.addComponent(field_cpf, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
																												.addComponent(field_nome, javax.swing.GroupLayout.PREFERRED_SIZE, 285, javax.swing.GroupLayout.PREFERRED_SIZE))))
																												.addGap(0, 0, Short.MAX_VALUE)))
																												.addGap(111, 111, 111))
																												.addGroup(telaCadastroLayout.createSequentialGroup()
																														.addContainerGap()
																														.addGroup(telaCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
																																.addGroup(telaCadastroLayout.createSequentialGroup()
																																		.addComponent(jLabel6)
																																		.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																																		.addComponent(jSeparator2))
																																		.addGroup(telaCadastroLayout.createSequentialGroup()
																																				.addGroup(telaCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
																																						.addComponent(jLabel12)
																																						.addComponent(jLabel10))
																																						.addGap(6, 6, 6)
																																						.addGroup(telaCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
																																								.addComponent(field_rua, javax.swing.GroupLayout.PREFERRED_SIZE, 444, javax.swing.GroupLayout.PREFERRED_SIZE)
																																								.addGroup(telaCadastroLayout.createSequentialGroup()
																																										.addComponent(field_bairro, javax.swing.GroupLayout.PREFERRED_SIZE, 272, javax.swing.GroupLayout.PREFERRED_SIZE)
																																										.addGap(18, 18, 18)
																																										.addComponent(jLabel16)
																																										.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																																										.addComponent(combo_cidade, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
																																										.addGroup(telaCadastroLayout.createSequentialGroup()
																																												.addComponent(jLabel9)
																																												.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
																																												.addComponent(field_cep, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
																																												.addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 685, javax.swing.GroupLayout.PREFERRED_SIZE)
																																												.addGap(0, 20, Short.MAX_VALUE)))
																																												.addContainerGap())
																																												.addGroup(javax.swing.GroupLayout.Alignment.TRAILING, telaCadastroLayout.createSequentialGroup()
																																														.addContainerGap()
																																														.addComponent(jLabel13)
																																														.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																																														.addComponent(jSeparator3)
																																														.addContainerGap())
																																														.addGroup(telaCadastroLayout.createSequentialGroup()
																																																.addContainerGap()
																																																.addComponent(jLabel14)
																																																.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																																																.addComponent(field_senha, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
																																																.addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)));
		telaCadastroLayout.setVerticalGroup(
				telaCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(telaCadastroLayout.createSequentialGroup()
						.addContainerGap()
						.addGroup(telaCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
								.addComponent(jLabel3)
								.addComponent(field_nome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
								.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
								.addGroup(telaCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
										.addComponent(jLabel4)
										.addComponent(field_cpf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
										.addGap(10, 10, 10)
										.addGroup(telaCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
												.addComponent(jLabel5)
												.addComponent(combo_funcao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
												.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
												.addGroup(telaCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
														.addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
														.addComponent(jLabel9))
														.addGap(15, 15, 15)
														.addGroup(telaCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
																.addComponent(jLabel7)
																.addComponent(field_email, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
																.addComponent(jLabel8)
																.addComponent(field_telefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
																.addGap(13, 13, 13)
																.addGroup(telaCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
																		.addComponent(jLabel6)
																		.addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
																		.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
																		.addGroup(telaCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
																				.addComponent(field_rua, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
																				.addComponent(field_numero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
																				.addComponent(jLabel11)
																				.addComponent(jLabel10))
																				.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
																				.addGroup(telaCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
																						.addComponent(jLabel12)
																						.addComponent(field_bairro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
																						.addComponent(jLabel16)
																						.addComponent(combo_cidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
																						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
																						.addComponent(field_cep, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
																						.addGroup(telaCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
																								.addComponent(jLabel13)
																								.addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
																								.addGap(18, 18, 18)
																								.addGroup(telaCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
																										.addComponent(jLabel14)
																										.addComponent(field_senha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
																										.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 37, Short.MAX_VALUE)
																										.addGroup(telaCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
																												.addComponent(button_confirmar)
																												.addComponent(button_cancelar))
																												.addContainerGap()));

		javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
		getContentPane().setLayout(layout);
		layout.setHorizontalGroup(
				layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(layout.createSequentialGroup()
						.addComponent(label_nomeFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, 501, javax.swing.GroupLayout.PREFERRED_SIZE)
						.addGap(18, 18, 18)
						.addGap(0, 0, Short.MAX_VALUE))
						.addComponent(telaCadastro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE));

		layout.setVerticalGroup(
				layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(layout.createSequentialGroup()
						.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
								.addComponent(label_nomeFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
								)
								.addGap(18, 18, 18)
								.addComponent(telaCadastro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
								.addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)));
		pack();
	}

	private void confirmarMouseClicked(MouseEvent evt) {

		nome= field_nome.getText();
		vinculo= (String) combo_funcao.getSelectedItem();
		cpf= field_cpf.getText(); 
		email= field_email.getText();
		telefone= field_telefone.getText();
		rua= field_rua.getText();
		numero= field_numero.getText();
		bairro= field_bairro.getText();
		cep= field_cep.getText();
		cidade= (String) combo_cidade.getSelectedItem();
		senha= field_senha.getText();

		matricula= controle.cadastrarFuncionario(nome, vinculo, cpf, email, telefone, rua, numero, bairro,  cep, cidade, senha);

		if(!matricula.equals("Preencha todos os campos."))
			finalizarCadastro();

		else
			JOptionPane.showMessageDialog(null,"Preenchimento invalido!\nVerifique campos em branco.");
	}

	private void cancelarMouseClicked(MouseEvent evt) {

		montarNovaTela();
	}

	private void finalizarCadastro(){

		montarNovaTela();
		JOptionPane.showMessageDialog(null,"Cadastro realizado com sucesso!\nMatricula do novo funcionario: " + matricula);
	}

	@Override
	public void insereFuncionario(Funcionario funcionario) {

		this.funcionario= funcionario;
		label_nomeFuncionario.setText("Nome do funcionario: " + funcionario.solicitarNome());	
	}

	@Override
	protected void montarNovaTela() {

		TelaCadastro tela = new TelaCadastro();
		tela.setVisible(true);
		tela.insereFuncionario(funcionario);
		dispose();
	}
}
