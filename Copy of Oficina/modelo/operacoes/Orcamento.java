package operacoes;

import java.text.DateFormat;
import java.util.Calendar;

import oficina.QuantidadeTanque;
import patrimonio.Carro;
public abstract class Orcamento implements Operacao{

	private String codigo_orcamento;
	private int quilometragem;
	private QuantidadeTanque qtd;
	private String comentarios;
	private double valor_orcamento;
	private double valor_mao_de_obra;
	Carro carro;

	public Orcamento(String codigo_orcamento, int quilometragem, QuantidadeTanque qtd, Carro carro, String comentarios, double valor_orcamento, double valor_mao_de_obra){

		this.codigo_orcamento=codigo_orcamento;
		this.quilometragem=quilometragem;
		this.qtd=qtd;
		this.comentarios=comentarios;
		this.valor_orcamento=valor_orcamento;
		this.valor_mao_de_obra=valor_mao_de_obra;
		this.carro=carro;

	}	// ----------------- pegando informacoes -----------------
		
		public String solicitarCodigo(){

			return codigo_orcamento;
		}
	
		public int solicitarQuilometragem(){
			
			return quilometragem;
		}
		public QuantidadeTanque solicitarQuantidade(){
			
			return  qtd;
		}
		public String solicitarComentarios(){
			
			return comentarios;
		}
		
		public double solicitarValorOrcamento(){
			
			return valor_orcamento;
		}
		
		public double solicitarValorMaodeObra(){
			
			return valor_mao_de_obra;
		}
	
	// ----------------------------------
	public String toString(){

		return "Codigo: " + codigo_orcamento +"\nQuilometragem:"+ quilometragem +"\nQuantidade Combustível"+qtd+"\nComentarios"+comentarios+"\nValor Orcamento:"+ valor_orcamento+ "\nValor Mao de Obra:"+valor_mao_de_obra;
	}
}



	
	
