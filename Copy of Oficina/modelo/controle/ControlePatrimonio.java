package controle;

import java.util.ArrayList;





import patrimonio.Carro;
import principal.Oficina;
import rh.Cliente;

public class ControlePatrimonio {

	  private Oficina oficina;
	//private Biblioteca biblioteca;

	public ControlePatrimonio(){

		oficina= Oficina.solicitaInstancia();		
	}

	// ----------------- carro -----------------		
	public String cadastrarCarro(String marca, String modelo, String ano, String cor, String placa){

		return oficina.cadastrarCarro(marca,modelo,ano,cor,placa);
	}

	public Carro buscarPlaca(String placa){

		return oficina.buscarCarroPlaca(placa);
	}
	
	public String excluirCarro(String placa){ 

		 oficina.excluirCarro(placa);
		return placa;
		
	}

	public Cliente buscarCliente(String cpf) {
		// TODO Auto-generated method stub
		return oficina.buscarCliente(cpf);
	}
	
	/*// ----------------- obra -----------------	
		public String cadastrarObra(String titulo, String autores, String assuntos, String editora, String observacoes){

			return biblioteca.cadastrarObra(titulo, autores, assuntos, editora, observacoes);
		}

		public Obra buscarObraCodigo(String codigo){
			
			return biblioteca.buscarObraCodigo(codigo);
		}
		
		public ArrayList<Obra> buscarObraNome(String nome){

			return biblioteca.buscarObraNome(nome);
		}

		public String editarObra(Obra obra, String titulo, String autores, String assuntos, String editora, String observacoes){

			return biblioteca.editarObra(obra, titulo, autores, assuntos, editora, observacoes);
		}

		public String excluirObra(String codigo, String justificativa){ 

			return biblioteca.excluirObra(codigo, justificativa);
		}*/
}
