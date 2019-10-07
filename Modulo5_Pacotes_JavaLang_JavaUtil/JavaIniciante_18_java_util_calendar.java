package Modulo5_Pacotes_JavaLang_JavaUtil;
import java.util.Calendar;
public class JavaIniciante_18_java_util_calendar 
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
		data.add(Calendar.DAY_OF_MONTH, 20);
		System.out.println("Dia do mês: " + data.get(Calendar.DAY_OF_MONTH));
		System.out.println("Mês : " + data.get(Calendar.MONTH));
		System.out.println("Ano : " + data.get(Calendar.YEAR));
		System.out.println("Hora : " + data.get(Calendar.HOUR_OF_DAY));
		System.out.println("Minuto : " + data.get(Calendar.MINUTE));
		System.out.println("Segundo : " + data.get(Calendar.SECOND));
	}
}
/*
	o exemplo anterior, definimos a data para 18/11/2005, 14:18:45. E se quisermos “somar” 20
	dias a esta data? Para isto, utilizamos o método add(). Da mesma forma que o set(), informamos
	dois argumentos: o primeiro define qual campo vamos “somar” e o segundo quanto iremos “somar”.
*/
