package Modulo5_Pacotes_JavaLang_JavaUtil;
public class JavaIniciante_07_String_valueOf 
{
	public static void main (String args[])
	{
		int a = 1;
		double b = 1.2;
		String s = String.valueOf(a) + " " + String.valueOf(b);
		System.out.println("Conte�do de s: " + s);
	}
}
/*
	O m�todo String.valueOf() � usado para converter diversos tipos de dados em strings. 
	Para isso, esse m�todo aceita v�rios tipos de argumento e tranforma-os em strings.
*/