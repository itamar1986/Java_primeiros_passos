package Modulo5_Pacotes_JavaLang_JavaUtil;
public class JavaIniciante_06_replace 
{
	public static void main (String args[])
	{
		String s = "Java Iniciante";
		System.out.println("Trocar caracter 'a' por 'u': " + s.replace("a", "u"));
		System.out.println("Trocar caracter 'a' por 'A': " + s.replace("a", "A"));
		System.out.println("Trocar caracter espa�o por '_': " + s.replace(" ", "_"));
	}
}
/*
 O m�todo replace() � utilizado para substitui��o de caracteres individuais de uma string. 
 Dever�o ser informados como par�metros, o caracter a ser substitu�do e por qual caractere
  ser� substitu�do.
*/