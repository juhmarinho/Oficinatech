package operacoes;

import java.text.DateFormat;
import java.util.Calendar;


public abstract class Reparo implements Operacao{

	private String codigo_reparo;
	private String descricao;
	private String detalhamento;
	private double valor_mao_de_obra;	
	private int tempo_servico;
	

	public Reparo(String codigo_reparo, String descricao, String detalhamento, double valor_mao_de_obra, int tempo_servico){

		this.codigo_reparo= codigo_reparo;
		this.descricao= descricao;
		this.detalhamento=detalhamento;
		this.valor_mao_de_obra= valor_mao_de_obra;
		this.tempo_servico=tempo_servico;
		
	}
	// ----------------- pegando informacoes -----------------
	public String solicitarCodigo(){

		return codigo_reparo;
	}

	public String solicitarDescricao(){

		return descricao;
	}

	public String solicitarDetalhamento(){

		return detalhamento;
	}

	public double solicitarValorMaodeObra(){
		return valor_mao_de_obra;
	}
	
	public int solicitarTempoServico(){
		return tempo_servico;
	}

	/*// ----------------- interagindo com Serviço -----------------
	public void emprestar(){

		status= "Emprestado";
	}

	public void devolver(){

		status= "Disponivel";
	}

	// ----------------------------------
*/	public String toString(){

		return  "\nCodigo:"+ codigo_reparo + "\nDescricao: " + descricao + "\nDetalhes: " + detalhamento + "\nValor Mao de Obra: "+ valor_mao_de_obra+"\nTempo de Servico:"+ tempo_servico;
	}
}
