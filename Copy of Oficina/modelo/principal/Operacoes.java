package principal;

import java.util.TreeMap;

import operacoes.Reparo;
import operacoes.Orcamento;
import operacoes.Servico;
import patrimonio.Carro;
import rh.Cliente;
import rh.Funcionario;
import controle.ControlePatrimonio;

public class Operacoes {

	static Integer qntCodigoOrcamento= 0;
	static Integer qntCodigoReparo=0;
	static Integer qntCodigoServico=0;
	//static Integer qntCodigoReserva= 0;

	private TreeMap<String, Servico> servicos;
	private TreeMap<String, Orcamento> orcamentos;
	private TreeMap<String, Reparo> reparos;

	private ControlePatrimonio controle;
	private static Operacoes instancia= null;

	private Operacoes(){

		inicializar();
		controle= new ControlePatrimonio();
	}

	public static synchronized Operacoes solicitaInstancia(){

		if (instancia==null)			
			instancia = new Operacoes();
		return instancia;
	}

	private void inicializar(){

		orcamentos= new TreeMap<String, Orcamento>();
	}
	

	// ----------------- orçamento,serviço ou reparo -----------------
	
	public String realizarOrcamento(Funcionario funcionario,String cpf, String placa){

		if(funcionario!=null && !placa.equals("") && !cpf.equals("")){
			
			Cliente cliente = controle.buscarCliente(cpf);
			Carro carro= controle.buscarPlaca(placa);

			if(cliente==null)
				return "CLiente inexistente no sistema.";
			
			if(carro == null) 
				return "Carro inexistente no sistema.";
		}
		return "teste";
	}
}

			/*gerarCodigoOrcamento();
			String codigo= String.valueOf(qntCodigoOrcamento);*/

			/*Orcamento novo= criarOrcamento();
			orcamentos.put(codigo, novo);

			return codigo;
		}
		return "Preencha todos os campos.";
	}
	private Orcamento criarOrcamento(){
		
		Orcamento orcamento =null;
		
		
		
		return orcamento;
	}

	private Servico criarServico(String codigo_servico, Reparo reparo, Orcamento orcamento){ // Usuario - Reparo Exemplar - Orcamento

		Servico servico= null;

		servico= new Servico(codigo_servico, reparo, orcamento);

		exemplar.emprestar(); 
		return servico;
	}

	public Emprestimo buscarEmprestimo(String codigoEmprestimo){

		Emprestimo emprestimo= emprestimos.get(codigoEmprestimo);

		if(emprestimo!=null && emprestimo.solicitarStatus().equals("Ativo"))
			return emprestimo;

		return null;
	}

	private static void gerarCodigoOrcamento(){

		qntCodigoOrcamento++;

	}

	// ----------------- devolucao -----------------	
	public String realizarServico(String codigo_servico){

		Emprestimo emprestimo= emprestimos.get(codigoEmprestimo);
		return emprestimo.encerrar();
	}

	public Emprestimo buscarDevolucao(String codigoEmprestimo){

		Emprestimo emprestimo= emprestimos.get(codigoEmprestimo);

		if(emprestimo.solicitarStatus().equals("Encerrado"))
			return emprestimo;

		return null;
	}

	// ----------------- reparo -----------------	
	public String realizarReparo(String codigoEmprestimo){ 	

		//Servico sevico= buscarEmprestimo(codigoEmprestimo);
		
//		if(emprestimo.solicitarRenovacoes() != null)
			
		return servico.realizar();
	}

	// ----------------- reserva -----------------		
	public String realizarReserva(Usuario usuario, Obra obra){ 

		// qnd chamar o realizar emprestimo, se nao puder realizar chama este metodo
		//return obra.reservar(usuario);
		return null;
	}*/


