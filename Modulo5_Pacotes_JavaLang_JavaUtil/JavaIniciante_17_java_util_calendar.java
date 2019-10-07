package Modulo5_Pacotes_JavaLang_JavaUtil;
import java.util.Calendar;
public class JavaIniciante_17_java_util_calendar 
{
	public static void main (String args[])
	{
		Calendar data = Calendar.getInstance();
		data.set(Calendar.DAY_OF_MONTH, 18);
		data.set(Calendar.MONTH, 10);
		data.set(Calendar.YEAR, 2005);
		data.set(Calendar.HOUR_OF_DAY, 14);
		data.set(Calendar.MINUTE, 18);
		data.set(Calendar.SECOND, 45);
		System.out.println("Dia do mês: " + data.get(Calendar.DAY_OF_MONTH));
		System.out.println("Mês : " + data.get(Calendar.MONTH));
		System.out.println("Ano : " + data.get(Calendar.YEAR));
		System.out.println("Hora : " + data.get(Calendar.HOUR_OF_DAY));
		System.out.println("Minuto : " + data.get(Calendar.MINUTE));
		System.out.println("Segundo : " + data.get(Calendar.SECOND));
	}
}
/*
	Agora iremos atribuir novos valores para os campos utilizando o método set(). Este método 
	necessita de dois argumentos: o primeiro define qual campo vamos alterar e o segundo o novo
	valor do campo.
*/