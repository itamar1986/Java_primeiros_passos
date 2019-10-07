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
	O método split() é usado para dividir uma string em um array de strings. É
	passado como parâmetro qual o caractere ou caracteres que delimitam a divisão.
*/