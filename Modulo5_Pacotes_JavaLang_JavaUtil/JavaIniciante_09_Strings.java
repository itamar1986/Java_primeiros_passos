package Modulo5_Pacotes_JavaLang_JavaUtil;
public class JavaIniciante_09_Strings 
{
	public static void main (String args[])
	{
		String s1 = new String("Curso Java Iniciante");
		String s2 = new String("Curso Java Iniciante");
		if (s1 == s2)
		{
			System.out.println("As duas strings s�o iguais!");
		}
		else
		{
			System.out.println("As duas strings s�o diferentes!");
		}
	}
}
/*
	Declaramos duas strings e a instanciamos com o mesmo conte�do, e ao 
	compar�-las temos como resultado que elas s�o diferentes.
*/