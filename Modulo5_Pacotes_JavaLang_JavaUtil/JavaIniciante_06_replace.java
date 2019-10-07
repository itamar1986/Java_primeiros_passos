package Modulo5_Pacotes_JavaLang_JavaUtil;
public class JavaIniciante_06_replace 
{
	public static void main (String args[])
	{
		String s = "Java Iniciante";
		System.out.println("Trocar caracter 'a' por 'u': " + s.replace("a", "u"));
		System.out.println("Trocar caracter 'a' por 'A': " + s.replace("a", "A"));
		System.out.println("Trocar caracter espaço por '_': " + s.replace(" ", "_"));
	}
}
/*
 O método replace() é utilizado para substituição de caracteres individuais de uma string. 
 Deverão ser informados como parâmetros, o caracter a ser substituído e por qual caractere
  será substituído.
*/