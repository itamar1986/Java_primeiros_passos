package Modulo5_Pacotes_JavaLang_JavaUtil;
public class JavaIniciante_08_split 
{
	public static void main (String args[])
	{
		String s = "Curso Java Iniciante";
		String[] palavras = s.split(" ");
		for (int i = 0; i < palavras.length; i++)
		{
			System.out.println("Palavra " + (i + 1) + ": " + palavras[i]);
		}
		System.out.println("****************************************");
		palavras = s.split("cia");
		for (int i = 0; i < palavras.length; i++)
		{
			System.out.println("Palavra " + (i + 1) + ": " + palavras[i]);
		}
	}
}
/*
	O m�todo split() � usado para dividir uma string em um array de strings. �
	passado como par�metro qual o caractere ou caracteres que delimitam a divis�o.
*/