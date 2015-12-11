package rh;

public class Funcionario {

	private String matricula;
	private String nome;
	private String funcao; // atendente ou mecanico
	private String cpf;
	private Contato contato;
	private Endereco endereco;
	private String senha;

	public Funcionario(String matricula, String nome, String funcao, String cpf, Contato contato, Endereco endereco, String senha){

		this.matricula= matricula;
		this.nome = nome;
		this.funcao = funcao;
		this.cpf = cpf;
		this.contato = contato;
		this.endereco= endereco;
		this.senha = senha;
	}

	// ----------------- pegando informacoes -----------------
	public String solicitarMatricula(){

		return matricula;
	}

	public String solicitarNome(){

		return nome;
	}

	public Contato solicitarContato(){

		return contato;
	}

	public Endereco solicitarEndereco(){

		return endereco;
	}

	public String solicitarFuncao(){

		return funcao;
	}

	public String solicitarCpf(){

		return cpf;
	}

	// ----------------- alterando informacoes -----------------
	public void alterarDados(String nome, Contato contato, Endereco endereco){

		this.nome = nome;
		this.contato = contato;
		this.endereco= endereco;
	}

	public void alterarSenha(String senha){

		this.senha= senha;
	}

	// ----------------- verificacao -----------------
	public boolean validarSenha(String senha){
		
		return this.senha.equals(senha);
	}
	
	// ----------------------------------
	public String toString(){
;  
		return "Matricula: " + matricula + "\nNome: " + nome + "\nFuncao: " + funcao + "\nCpf: " + cpf + "\nContato: \n" + contato + "\nEndereco: \n" + endereco;
	}
}
