package operacoes;

import java.text.DateFormat;
import java.util.Calendar;

public class Periodo{

	private Calendar inicio;
	private Calendar previsto;

	public Periodo(Calendar inicio, int totalDias){

		this.inicio= inicio;
		previsto= (Calendar) inicio.clone();
		previsto.add(Calendar.DAY_OF_MONTH, totalDias);  
	}

	public Calendar solicitarInicio(){

		return inicio;
	}

	public Calendar solicitarPrevisto(){

		return previsto;
	}

	private String apresentarData(Calendar c){

		if(c!= null){

			DateFormat df= DateFormat.getDateInstance(DateFormat.SHORT);
			return df.format(c.getTime());
		}
		return "Não há data a ser apresentada.";
	}

	public String toString(){

		return "Data inicial: " + inicio + "\nData de devolucao prevista: " + previsto;
	}

}
