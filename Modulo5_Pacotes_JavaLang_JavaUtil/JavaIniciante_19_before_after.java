package Modulo5_Pacotes_JavaLang_JavaUtil;
import java.util.Calendar;
public class JavaIniciante_19_before_after 
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
		if (data1.before(data2))
		{
			System.out.println("data1 é anterior a data2");
		}
		else
		{
			System.out.println("data1 não é anterior a data2");
		}
	}
}
/*
	before() retorna verdadeiro, se e somente se data1 < data2.
	after() retorna verdadeiro, se e somente se data1 > data2.
*/