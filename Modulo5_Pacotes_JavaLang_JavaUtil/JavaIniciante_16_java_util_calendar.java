package Modulo5_Pacotes_JavaLang_JavaUtil;
import java.util.Calendar; //necessário este import para utilização da classe
public class JavaIniciante_16_java_util_calendar
{
	public static void main (String args[])
	{
		Calendar data = Calendar.getInstance();
		System.out.println("Dia do mês: " + data.get(Calendar.DAY_OF_MONTH));
		System.out.println("Mês : " + (data.get(Calendar.MONTH) + 1));
		System.out.println("Ano : " + data.get(Calendar.YEAR));
		System.out.println("Hora : " + data.get(Calendar.HOUR_OF_DAY));
		System.out.println("Minuto : " + data.get(Calendar.MINUTE));
		System.out.println("Segundo : " + data.get(Calendar.SECOND));
	}
}
/*
 	Talvez não seja muito útil a data representada desta maneira, então vamos
	obter cada campo separadamente. Vamos utilizar agora o método get().
*/


