package principal;
import java.util.ArrayList;
import java.util.TreeMap;

import patrimonio.Carro;
import rh.Cliente;
import rh.Contato;
import rh.Endereco;
import rh.Funcionario;



public class Oficina {
			
		static Integer qntIdCliente= 0;
		static Integer qntCodigoCarro=0;
		static Integer qntMatriculaFuncionario= 0;
		
		
		private TreeMap<String, Funcionario> funcionarios;
		private TreeMap<String, Cliente> clientes;
		private TreeMap<String, Carro> carros;	

		
		private TreeMap<String, Funcionario> funcionarios_excluidos;
		private TreeMap<String, Cliente> clientes_excluidos;
		private TreeMap<String, Carro> carros_excluidos;


		private static Oficina instancia= null;

		private Oficina(){

			inicializar();
		}

		public static synchronized Oficina solicitaInstancia(){

			if (instancia==null)			
				instancia = new Oficina();
			return instancia;
		}

		private void primeirasInstancias(){ 
			cadastrarFuncionario("Juliane", "Atendente", "87534564", "juliane@gmail.com","77556644", "Rua 34","456", "Bairro Real", "23456980", "Cidade Maravilhosa", "789");
			cadastrarCliente("Larissa","1234","lala@ferrarez.com","2323","Rua b","10","Cha","254569","RJ");
			cadastrarCarro("Fiat","Siena","2009","Prata","LKZ2704");
		
		}

		private void inicializar(){

			
			 clientes= new TreeMap<String, Cliente>();
			 carros= new TreeMap<String, Carro>();
			 funcionarios= new TreeMap<String,Funcionario>();
			 
			 primeirasInstancias();


			clientes_excluidos= new TreeMap<String, Cliente>();
			carros_excluidos= new TreeMap<String, Carro>();
			funcionarios_excluidos= new TreeMap<String,Funcionario>();
		}

		

		// ----------------- Cliente -----------------		
		public String cadastrarCliente(String nome, String cpf, String email, String telefone, String rua, String numero, String bairro, String cep, String cidade){

			ArrayList<String> campos= new ArrayList<String>();
			campos.add(nome);
			campos.add(cpf);
			campos.add(email);
			campos.add(telefone);
			campos.add(bairro);
			campos.add(cep);
			campos.add(cidade);
			campos.add(numero);
			campos.add(rua);
			

			
			if(verificarPreenchimento(campos)){

				Cliente novo= criarCliente(nome,cpf, email, telefone, rua, numero, bairro, cep, cidade);
				clientes.put(cpf, novo);
			}
			return "Preencha todos os campos.";
		}

		private Cliente criarCliente(String nome, String cpf, String email, String telefone, String rua, String numero, String bairro, String cep, String cidade){

			Contato contato= new Contato(email, telefone);
			Endereco endereco= new Endereco(rua, numero, bairro, cidade, cep);

			Cliente cliente= new Cliente(nome,cpf, contato, endereco);

			return cliente;
		}

		public Cliente buscarCliente(String cpf){

			return clientes.get(cpf);
		}

		public String editarCliente(Cliente cliente, String nome, String email, String telefone, String rua, String numero, String bairro, String cep, String cidade){

			ArrayList<String> campos= new ArrayList<String>();
			campos.add(nome);
			campos.add(email);
			campos.add(telefone);
			campos.add(bairro);
			campos.add(cep);
			campos.add(cidade);
			campos.add(numero);
			campos.add(rua);

			if(verificarPreenchimento(campos) && cliente!= null){

				Contato contato= new Contato(email, telefone);
				Endereco endereco= new Endereco(rua, numero, bairro, cep, cidade);

				cliente.alterarDados(nome, contato, endereco);			
				return "Edicao concluida!";
			}
			return "Preencha todos os campos.";
		}


		public String excluirCliente(String cpf){ 

			Cliente excluido= clientes.get(cpf);

				clientes_excluidos.put(cpf, excluido);
				clientes.remove(cpf);
				return "Exclusao realizada com sucesso";


//			}else
//				return "Exclusao nao realizada.\nCliente bloqueado."; 
	}



		// ----------------- carro -----------------	
		public String cadastrarCarro(String marca, String modelo, String ano, String cor, String placa){

			ArrayList<String> campos= new ArrayList<String>();
			campos.add(marca);
			campos.add(modelo);
			campos.add(ano);
			campos.add(cor);
			campos.add(placa);

			gerarCodigoCarro();
			String codigo= String.valueOf(qntCodigoCarro);
			
			if(verificarPreenchimento(campos)){

				Carro nova= criarCarro(codigo,marca,modelo,ano,cor,placa);
				carros.put(placa,nova);

				return placa;
			}
			return "Preencha todos os campos.";
		} 	

		private Carro criarCarro(String codigo, String marca, String modelo, String ano, String cor, String placa){

			Carro nova= null;

			nova= new Carro(codigo,marca,modelo,ano,cor,placa);
			return nova;
		}

		public Carro buscarCarroPlaca(String placa){

			return carros.get(placa);
		}

		public String editarCarro(Carro carro, String marca, String modelo, String ano, String cor, String placa){

			ArrayList<String> campos= new ArrayList<String>();
			campos.add(marca);
			campos.add(modelo);
			campos.add(ano);
			campos.add(cor);
			campos.add(placa);

			if(verificarPreenchimento(campos) && carro!= null){

				carro.alterarDados(marca,modelo,ano,cor,placa);
				return "Edicao concluida!";
			}
			return "Preencha todos os campos.";
		}

		public void excluirCarro(String placa){ 

			Carro excluido= carros.get(placa);
			carros_excluidos.put(placa,excluido);
			carros.remove(placa);
			
		}
		
		private static void gerarCodigoCarro(){

			qntCodigoCarro++;
		}
		private boolean verificarPreenchimento(ArrayList<String> campos){

			for(String campo : campos)
				if(campo.equals(""))
					return false;

			return true;
		}
		
		
		// ----------------- funcionario -----------------		
		public String cadastrarFuncionario(String nome, String funcao, String cpf, String email, String telefone, String rua, String numero, String bairro, String cep, String cidade, String senha){

			ArrayList<String> campos= new ArrayList<String>();
			campos.add(nome);
			campos.add(funcao);
			campos.add(cpf);
			campos.add(email);
			campos.add(telefone);
			campos.add(bairro);
			campos.add(cep);
			campos.add(cidade);
			campos.add(numero);
			campos.add(rua);
			campos.add(senha);
			
			if(verificarPreenchimento(campos)){

				gerarMatriculaFuncionario();
				String matricula= String.valueOf(qntMatriculaFuncionario);

				Funcionario novo= criarFuncionario(matricula, nome, funcao, cpf, email, telefone, rua, numero, bairro, cep, cidade, senha);
				funcionarios.put(matricula, novo);

				return matricula;
			}
			return "Preencha todos os campos.";
		}

		private Funcionario criarFuncionario(String matricula, String nome, String funcao, String cpf, String email, String telefone, String rua, String numero, String bairro, String cep, String cidade, String senha){

			Contato contato= new Contato(email, telefone);
			Endereco endereco= new Endereco(rua, numero, bairro, cidade, cep);

			Funcionario funcionario= new Funcionario(matricula, nome, funcao, cpf, contato, endereco, senha);

			return funcionario;
		}

		public Funcionario buscarFuncionarioMatricula(String matricula){

			return funcionarios.get(matricula);
		}

		public ArrayList<Funcionario> buscarFuncionarioNome(String nome){

			return null; //rFuncionarioNome(nome);
		}

		public String editarFuncionario(Funcionario funcionario, String nome, String email, String telefone, String rua, String numero, String bairro, String cep, String cidade){

			ArrayList<String> campos= new ArrayList<String>();
			campos.add(nome);
			campos.add(email);
			campos.add(telefone);
			campos.add(bairro);
			campos.add(cep);
			campos.add(cidade);
			campos.add(numero);
			campos.add(rua);

			if(verificarPreenchimento(campos) && funcionario!= null){

				Contato contato= new Contato(email, telefone);
				Endereco endereco= new Endereco(rua, numero, bairro, cep, cidade);

				funcionario.alterarDados(nome, contato, endereco);			
				return "Edicao concluida!";
			}
			return "Preencha todos os campos.";
		}

		public void alterarSenhaFuncionario(Funcionario funcionario, String senha){

			funcionario.alterarSenha(senha);
		}

		public void excluirFuncionario(String matricula){

			Funcionario excluido= funcionarios.get(matricula);
			funcionarios_excluidos.put(matricula,excluido);
			funcionarios.remove(matricula);
		}

		public String logarFuncionario(String matricula, String senha){
            //funcionarioaqui
			if(matricula.equals("")|| senha.equals(""))		
				return "Preencha todos os campos.";

			Funcionario funcionario= buscarFuncionarioMatricula(matricula);

			if(funcionario==null)		
				return "Matricula incorreta.";

			boolean valido= funcionario.validarSenha(senha);

			if(!valido)
				return "Senha incorreta.";

			return funcionario.solicitarFuncao();
		}

		/*public String logarUsuario(String usuario, String senha){

			if(usuario.equals("")|| senha.equals(""))		
				return "Preencha todos os campos.";

			Usuario _usuario= buscarUsuarioMatricula(usuario);

			if(_usuario==null)		
				return "Matricula incorreta.";

			boolean valido= _usuario.validaSenha(senha);

			if(!valido)
				return "Senha incorreta.";

			return "Dados ok."; 
		}*/

		private static void gerarMatriculaFuncionario(){

			qntMatriculaFuncionario++;
		}


}	

