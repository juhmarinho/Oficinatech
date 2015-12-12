package principal;

import java.util.ArrayList;
import java.util.TreeMap;

import oficina.Categoria;
import oficina.Fabricante;
import oficina.Fornecedor;
import oficina.Peca;
import rh.Contato;
import rh.Endereco;


public class Fabrica {


	static Integer qntIdFornecedor= 0;
	static Integer qntCodigoPeca=0;
	static Integer qntCodigoFabricante= 0;


	private TreeMap<String, Fabricante> fabricantes; // Funcionario - Fabricante
	private TreeMap<String, Fornecedor> fornecedores; // Cliente - Fornecedor
	private TreeMap<String, Peca> pecas;	//Carro - Peca


	private TreeMap<String, Fabricante> fabricantes_excluidos;
	private TreeMap<String, Fornecedor> fornecedores_excluidos;
	private TreeMap<String, Peca> pecas_excluidos;


	private static Fabrica instancia= null;

	private Fabrica(){

		inicializar();
	}

	public static synchronized Fabrica solicitaInstancia(){

		if (instancia==null)			
			instancia = new Fabrica();
		return instancia;
	}

	private void primeirasInstancias(){ 
		cadastrarFabricante("codigo","nome","email", "telefone");
		cadastrarFornecedor("codigo", "responsavel", "email", "telefone", "rua", "numero", "bairro", "cep", "cidade");
		cadastrarPeca("codigo", CATEGORIA, "descricao", 5, 111, 123, "localdeposito", "codigof");
;

	}

	private void inicializar(){


		fornecedores= new TreeMap<String, Fornecedor>();
		pecas= new TreeMap<String, Peca>();
		fabricantes= new TreeMap<String,Fabricante>();

		primeirasInstancias();


		fornecedores_excluidos= new TreeMap<String, Fornecedor>();
		pecas_excluidos= new TreeMap<String, Peca>();
		fabricantes_excluidos= new TreeMap<String,Fabricante>();
	}



	// ----------------- Fornecedor -----------------		
	public String cadastrarFornecedor(String codigo, String responsavel, String email, String telefone, String rua, String numero, String bairro, String cep, String cidade){

		ArrayList<String> campos= new ArrayList<String>();
		campos.add(codigo);
		campos.add(responsavel);
		campos.add(email);
		campos.add(telefone);
		campos.add(bairro);
		campos.add(cep);
		campos.add(cidade);
		campos.add(numero);
		campos.add(rua);



		if(verificarPreenchimento(campos)){

			Fornecedor novo= criarFornecedor(codigo, responsavel, email, telefone, rua, numero, bairro, cep, cidade);
			fornecedores.put(codigo, novo);
		}
		return "Preencha todos os campos.";
	}

	private Fornecedor criarFornecedor(String codigo, String responsavel, String email, String telefone, String rua, String numero, String bairro, String cep, String cidade){

		Contato contato= new Contato(email, telefone);
		Endereco endereco= new Endereco(rua, numero, bairro, cidade, cep);

		Fornecedor fornecedor= new Fornecedor(codigo, responsavel, contato, endereco);

		return fornecedor;
	}

	public Fornecedor buscarFornecedor(String codigo){

		return fornecedores.get(codigo);
	}

	public String editarFornecedor(Fornecedor fornecedor, String responsavel, String email, String telefone, String rua, String numero, String bairro, String cep, String cidade){

		ArrayList<String> campos= new ArrayList<String>();
		campos.add(responsavel);
		campos.add(email);
		campos.add(telefone);
		campos.add(bairro);
		campos.add(cep);
		campos.add(cidade);
		campos.add(numero);
		campos.add(rua);

		if(verificarPreenchimento(campos) && fornecedor!= null){

			Contato contato= new Contato(email, telefone);
			Endereco endereco= new Endereco(rua, numero, bairro, cep, cidade);

			fornecedor.alterarDados(responsavel, contato, endereco);			
			return "Edicao concluida!";
		}
		return "Preencha todos os campos.";
	}


	public String excluirFornecedor(String codigo){ 

		Fornecedor excluido= fornecedores.get(codigo);

		fornecedores_excluidos.put(codigo, excluido);
		fornecedores.remove(codigo);
		return "Exclusao realizada com sucesso";


		//	}else
		//		return "Exclusao nao realizada.\nFornecedor não existe."; 
	}



	// ----------------- peca -----------------	
	public String cadastrarPeca(String codigo,Categoria categoria,String descricao,int qtdestoque,double valorcompra,double valorvenda,String localdeposito,String codigof){


		ArrayList<String> campos= new ArrayList<String>();
		campos.add(codigo);
		campos.add(descricao);
		campos.add(Integer.toString(qtdestoque));
		campos.add(String.valueOf(valorcompra));
		campos.add(String.valueOf(valorvenda));
		campos.add(localdeposito);
		//categeria
		//***************************************************
		// IMPLEMENTAR CATEGORIA
		//***************************************************
		//Fabricante
		campos.add(codigof);

		gerarCodigoPeca();
		
		String codigop= String.valueOf(qntCodigoPeca);

		if(verificarPreenchimento(campos)){

			Peca nova= criarPeca(codigo, categoria, descricao, qtdestoque, valorcompra, valorvenda, localdeposito, codigof);

			pecas.put(codigo,nova);

			return codigo;
		}
		return "Preencha todos os campos.";
	} 	

	private Peca criarPeca(String codigo,Categoria categoria,String descricao,int qtdestoque,double valorcompra,double valorvenda,String localdeposito,String codigof){

		Peca nova= null;
		//Categoria categoria = new Categoria(); ou buscar categoria
		
		nova= new Peca(codigo, categoria, descricao, qtdestoque, valorcompra, valorvenda, localdeposito, buscarFabricante(codigof));

		return nova;
	}

	public Peca buscarPeca(String codigo){

		return pecas.get(codigo);
	}

	public String editarPeca(Peca peca,Categoria categoria,String descricao,int qtdestoque,double valorcompra,double valorvenda,String localdeposito,String codigof){

		ArrayList<String> campos= new ArrayList<String>();
		campos.add(descricao);
		campos.add(Integer.toString(qtdestoque));
		campos.add(String.valueOf(valorcompra));
		campos.add(String.valueOf(valorvenda));
		campos.add(localdeposito);

		if(verificarPreenchimento(campos) && peca!= null){

			peca.alterarDados(descricao, qtdestoque, valorcompra, valorvenda, localdeposito);
			return "Edicao concluida!";
		}
		return "Preencha todos os campos.";
	}

	public void excluirPeca(String codigo){ 

		Peca excluido= pecas.get(codigo);
		pecas_excluidos.put(codigo,excluido);
		pecas.remove(codigo);

	}

	private static void gerarCodigoPeca(){

		qntCodigoPeca++;
	}
	private boolean verificarPreenchimento(ArrayList<String> campos){

		for(String campo : campos)
			if(campo.equals(""))
				return false;

		return true;
	}


	// ----------------- fabricante -----------------		
	public String cadastrarFabricante(String codigo,String nome, String email, String telefone){

		ArrayList<String> campos= new ArrayList<String>();
		campos.add(codigo);
		campos.add(nome);
		campos.add(email);
		campos.add(telefone);

		if(verificarPreenchimento(campos)){

			gerarMatriculaFabricante();
			String codigof= String.valueOf(qntCodigoFabricante);

			Fabricante novo= criarFabricante(codigo, nome, email, telefone);
			fabricantes.put(codigo, novo);

			return codigo;
		}
		return "Preencha todos os campos.";
	}

	private Fabricante criarFabricante(String codigo, String nome, String email, String telefone){

		Contato contato= new Contato(email, telefone);
		Fabricante fabricante= new Fabricante(codigo, nome, contato);

		return fabricante;
	}

	public Fabricante buscarFabricante(String codigo){

		return fabricantes.get(codigo);
	}

	public ArrayList<Fabricante> buscarFabricanteNome(String nome){

		return null; //rFabricanteNome(nome);
	}

	public String editarFabricante(Fabricante fabricante, String nome, String email, String telefone){

		ArrayList<String> campos= new ArrayList<String>();
		campos.add(nome);
		campos.add(email);
		campos.add(telefone);

		if(verificarPreenchimento(campos) && fabricante!= null){

			Contato contato= new Contato(email, telefone);
			fabricante.alterarDados(nome, contato);			
			return "Edicao concluida!";
		}
		return "Preencha todos os campos.";
	}

	public void excluirFabricante(String codigo){

		Fabricante excluido= fabricantes.get(codigo);
		fabricantes_excluidos.put(codigo,excluido);
		fabricantes.remove(codigo);
	}




	private static void gerarMatriculaFabricante(){

		qntCodigoFabricante++;
	}

}
