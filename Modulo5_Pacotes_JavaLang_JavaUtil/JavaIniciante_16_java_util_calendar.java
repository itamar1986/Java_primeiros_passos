package Modulo5_Pacotes_JavaLang_JavaUtil;
import java.util.Calendar; //necess�rio este import para utiliza��o da classe
public class JavaIniciante_16_java_util_calendar
{
	public static void main (String args[])
	{
		Calendar data = Calendar.getInstance();
		System.out.println("Dia do m�s: " + data.get(Calendar.DAY_OF_MONTH));
		System.out.println("M�s : " + (data.get(Calendar.MONTH) + 1));
		System.out.println("Ano : " + data.get(Calendar.YEAR));
		System.out.println("Hora : " + data.get(Calendar.HOUR_OF_DAY));
		System.out.println("Minuto : " + data.get(Calendar.MINUTE));
		System.out.println("Segundo : " + data.get(Calendar.SECOND));
	}
}
/*
 	Talvez n�o seja muito �til a data representada desta maneira, ent�o vamos
	obter cada campo separadamente. Vamos utilizar agora o m�todo get().
*/


