package Modulo5_Pacotes_JavaLang_JavaUtil;
import java.util.Calendar; //necess�rio este import para utiliza��o da classe
public class JavaIniciante_15_java_util_calendar
{
	public static void main (String args[])
	{
		Calendar data = Calendar.getInstance();
		System.out.println(data.getTime());
	}
}
/*
	Para obter uma inst�ncia desta classe, basta chamar o m�todo est�tico getInstance(). Quando
	este m�todo � chamado, � obtido um Calendar com data e hora atuais. Depois de obtido este
	objeto, utilizamos o m�todo get() para buscar o ano, dia, etc.
*/