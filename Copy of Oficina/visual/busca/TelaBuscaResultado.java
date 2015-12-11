package busca;

import java.awt.event.ActionEvent;
import java.util.ArrayList;

import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JList;
import javax.swing.ListModel;
import javax.swing.event.ListDataListener;

import rh.Funcionario;


public class TelaBuscaResultado extends javax.swing.JFrame {


	private Funcionario funcionario;

	//protected ArrayList<Usuario> arrayUsuarioBusca;
	protected ArrayList<Funcionario> arrayFuncionarioBusca;
	//protected ArrayList<Obra> arrayObraBusca;
	
	public TelaBuscaResultado() {
		initComponents();
	}

	@SuppressWarnings("unchecked")
	// <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
	private void initComponents() {

		usuarioSistema = new javax.swing.JLabel();
		jPanel1 = new javax.swing.JPanel();
		jLabel1 = new javax.swing.JLabel();
		exibir = new javax.swing.JButton();

		setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
		setResizable(false);

		usuarioSistema.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

		jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "RESULTADO BUSCA"));

		jLabel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

		exibir.setText("EXIBIR");
		exibir.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
		exibir.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mouseClicked(java.awt.event.MouseEvent evt) {
				exibirMouseClicked(evt);
			}
		});

		javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
		jPanel1.setLayout(jPanel1Layout);
		jPanel1Layout.setHorizontalGroup(
				jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(jPanel1Layout.createSequentialGroup()
						.addContainerGap()
						.addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 750, Short.MAX_VALUE)
						.addContainerGap())
						.addGroup(jPanel1Layout.createSequentialGroup()
								.addGap(352, 352, 352)
								.addComponent(exibir, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
								.addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
				);
		jPanel1Layout.setVerticalGroup(
				jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(jPanel1Layout.createSequentialGroup()
						.addGap(108, 108, 108)
						.addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 222, Short.MAX_VALUE)
						.addComponent(exibir)
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
										.addComponent(usuarioSistema, javax.swing.GroupLayout.PREFERRED_SIZE, 501, javax.swing.GroupLayout.PREFERRED_SIZE)
										.addGap(0, 0, Short.MAX_VALUE))
										.addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
										.addContainerGap())
				);
		layout.setVerticalGroup(
				layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(layout.createSequentialGroup()
						.addContainerGap()
						.addComponent(usuarioSistema, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
						.addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addGap(18, 18, 18))
				);

		pack();
	}// </editor-fold>//GEN-END:initComponents

	private void exibirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_EXIBIRMouseClicked

		//direcionar pra outra tela pra mostrar todos os detalhes
	}

	/*public void insereUsuarioBusca(ArrayList<Usuario> usuario){

		arrayUsuarioBusca= usuario;
		jLabel1.setText(arrayUsuarioBusca.toString());
	}*/

	public void insereFuncionarioBusca(ArrayList<Funcionario> funcionario){

		arrayFuncionarioBusca= funcionario;
//		jLabel1.setText(funcionarioBusca.solicitarNome());
	}

	/*public void insereObraBusca(ArrayList<Obra> obra){

		arrayObraBusca= obra;
//		jLabel1.setText(obraBusca.solicitarTitulo());
	}
*/
	public void insereFuncionario(Funcionario funcionario) {

		this.funcionario= funcionario;
		usuarioSistema.setText("Nome do funcionario: " + funcionario.solicitarNome());
	}

	// Variables declaration - do not modify//GEN-BEGIN:variables
	private javax.swing.JButton exibir;
	private javax.swing.JLabel jLabel1;
	private javax.swing.JPanel jPanel1;
	private javax.swing.JLabel usuarioSistema;
	// End of variables declaration//GEN-END:variables
}
