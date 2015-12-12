package controle;

import java.util.ArrayList;

import oficina.Categoria;
import oficina.Fabricante;
import oficina.Peca;
import patrimonio.Carro;
import principal.Fabrica;
import principal.Oficina;
import rh.Cliente;

public class ControlePatrimonio {

	  private Oficina oficina;
	  private Fabrica fabrica;

	public ControlePatrimonio(){

		oficina= Oficina.solicitaInstancia();	
		fabrica=Fabrica.solicitaInstancia();
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
	// ----------------- peca -----------------	
	public String cadastrarPeca(String codigo,Categoria categoria,String descricao,int qtdestoque,double valorcompra,double valorvenda,String localdeposito,String codigof){

		return fabrica.cadastrarPeca(codigo, categoria, descricao, qtdestoque, valorcompra,  valorvenda, localdeposito, codigof);
	}

	public Peca buscarPeca(String codigo){
		
		return fabrica.buscarPeca(codigo);
	}
	
//	public ArrayList<Peca> buscarPecaNome(String nome){
//
//		return fabrica.buscarPecaNome(nome);
//	}

	public String editarPeca(Peca peca,Categoria categoria,String descricao,int qtdestoque,double valorcompra,double valorvenda,String localdeposito,String codigof){

		return fabrica.editarPeca(peca, categoria,descricao, qtdestoque, valorcompra, valorvenda, localdeposito, codigof);
	}

	public String excluirPeca(String codigo){ 

		fabrica.excluirPeca(codigo);
		return codigo;
	}

}
