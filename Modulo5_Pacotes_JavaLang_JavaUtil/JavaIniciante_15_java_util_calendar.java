package Modulo5_Pacotes_JavaLang_JavaUtil;
import java.util.Calendar; //necessário este import para utilização da classe
public class JavaIniciante_15_java_util_calendar
{
	public static void main (String args[])
	{
		Calendar data = Calendar.getInstance();
		System.out.println(data.getTime());
	}
}
/*
	Para obter uma instância desta classe, basta chamar o método estático getInstance(). Quando
	este método é chamado, é obtido um Calendar com data e hora atuais. Depois de obtido este
	objeto, utilizamos o método get() para buscar o ano, dia, etc.
*/