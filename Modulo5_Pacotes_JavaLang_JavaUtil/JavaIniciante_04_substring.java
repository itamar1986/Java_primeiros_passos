package Modulo5_Pacotes_JavaLang_JavaUtil;
public class JavaIniciante_04_substring 
{
	public static void main (String args[])
	{
		String s = "Java Iniciante";
		System.out.println("Do 3° caratere até o fim: " + s.substring(2));
		System.out.println("Do 1° caratere até o 6°: " + s.substring(0, 6));
		System.out.println("Do 4° caratere até o 13°: " + s.substring(3, 13));
	}
}
/*
	O método substring() é utilizado para retornar uma cópia de caracteres de
	uma string a partir de dois índices inteiros especificados.
*/