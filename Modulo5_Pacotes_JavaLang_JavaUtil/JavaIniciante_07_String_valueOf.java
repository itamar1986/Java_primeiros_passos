package Modulo5_Pacotes_JavaLang_JavaUtil;
public class JavaIniciante_07_String_valueOf 
{
	public static void main (String args[])
	{
		int a = 1;
		double b = 1.2;
		String s = String.valueOf(a) + " " + String.valueOf(b);
		System.out.println("Conteúdo de s: " + s);
	}
}
/*
	O método String.valueOf() é usado para converter diversos tipos de dados em strings. 
	Para isso, esse método aceita vários tipos de argumento e tranforma-os em strings.
*/