package operacoes;

import java.text.DateFormat;
import java.util.Calendar;


public abstract class Servico implements Operacao{

	protected String codigo_servico;
	private Calendar dataServico;
	private Reparo reparo;
	private Orcamento orcamento;
	
	/*protected Calendar dataDevolucao;
	protected Calendar dataPrevista;*/

	//protected Renovacao renovacao= null;

	private String status;
	protected Integer dias;

	public Servico(String codigo_servico, Reparo reparo, Orcamento orcamento){

		this.codigo_servico= codigo_servico;
		this.reparo= reparo;
		this.orcamento= orcamento;

		/*usuario.realizarEmprestimo();
		status= "Ativo";
*/
		//determinaLimites();

		dataServico= Calendar.getInstance();
		
	}

	//public abstract void determinaLimites();

	// ----------------- pegando informacoes -----------------
	public String solicitarCodigo(){

		return codigo_servico;
	}

	public Reparo solicitarReparo(){

		return reparo;
	}

	public Orcamento solicitarOrcamento(){

		return orcamento;
	}

	public String solicitarDataServico(){

		return apresentarData(dataServico);

	}

	/*public String solicitarDataDevolucao(){

		return apresentarData(dataDevolucao);

	}

	public String solicitarStatus(){

		return status;
	}

	public Integer solicitarDias(){

		return dias;
	}

	public Reparo solicitarRenovacoes(){

		return renovacao;
	}
*/
	// ----------------- gerenciando -----------------	
	/*public String encerrar(){

		status= "Encerrado";
		usuario.devolveEmprestimo();
		exemplar.devolver();
		dataDevolucao= Calendar.getInstance();

		gerarMulta();
		return "Devolucao realizada com sucesso!";
	}*/

	/*public abstract String renovar();

	private void gerarMulta(){ 

		if(!verificarAtrasoDevolucao()) 
			Multa.gerar(dataPrevista, dataDevolucao, usuario);
	}

	public boolean verificarAtrasoDevolucao(){ 
		
		if(dataPrevista.after(dataDevolucao))
			return true;
		return false;
	}*/

	@Override
	public String gerarComprovante(){	

		StringBuilder sb= new StringBuilder();

		sb.append("Servico " + codigo_servico);
		sb.append("\nData do Servico: " + apresentarData(dataServico));
		sb.append("\n-------------------------------------------------");
		sb.append("\nReparo " + reparo.solicitarCodigo()); 
		sb.append("\nPeças trocadas" + reparo.solicitarDetalhamento()); //peças trocadas, com valor
		sb.append("\nValor Mao de Obra: " + reparo.solicitarValorMaodeObra());	
		sb.append("\n-------------------------------------------------");

		//	if(solicitarRenovacoes()!=null){
		//		sb.append("\nRenovacao: ");
		//		sb.append(renovacao.solicitarDatas()); 
		//	}
		return sb.toString();
	}

	// ----------------- datas -----------------
	
	private String apresentarData(Calendar c){

		if(c!= null){
			DateFormat df= DateFormat.getDateInstance(DateFormat.SHORT);
			return df.format(c.getTime());		
		}		
		return "Nao ha data a ser apresentada.";
	}

	// ----------------------------------
	public String toString(){

		return "Codigo: " + codigo_servico +"\nData do servico:"+ dataServico + "\nCodigo Reparo: " + reparo.solicitarCodigo() +"\nPeças trocadas:"+ reparo.solicitarDetalhamento()+"\nValor Mão de Ora:"+reparo.solicitarValorMaodeObra();
	}
}
