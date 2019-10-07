package Modulo5_Pacotes_JavaLang_JavaUtil;
import java.util.Calendar;
public class JavaIniciante_20_before_after 
{
	public static void main (String args[])
	{
		Calendar data1 = Calendar.getInstance();
		data1.set(Calendar.DAY_OF_MONTH, 18);
		data1.set(Calendar.MONTH, 10);
		data1.set(Calendar.YEAR, 2005);
		Calendar data2 = Calendar.getInstance();
		data2.set(Calendar.DAY_OF_MONTH, 12);
		data2.set(Calendar.MONTH, 8);
		data2.set(Calendar.YEAR, 2007);
		long d1 = data1.getTimeInMillis();
		long d2 = data2.getTimeInMillis();
		System.out.println("N° dias: " + (int)((d2 - d1)/ (24*60*60*1000)));
	}
}
/*
	Ao utilizar o método getTimeInMillis(), para calcularmos o intervalo de dias entre as datas
	utilizadas no exemplo anterior. O cálculo é feito pegando a diferença entra a data2 de data1
	e dividindo-se pelo valor de milissegundos em um dia.
*/