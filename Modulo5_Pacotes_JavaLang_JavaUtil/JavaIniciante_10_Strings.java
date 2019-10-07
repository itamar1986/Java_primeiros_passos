package Modulo5_Pacotes_JavaLang_JavaUtil;
public class JavaIniciante_10_Strings 
{
	public static void main (String args[])
	{
		String s1 = new String("Curso Java Iniciante");
		String s2 = new String("Curso Java Iniciante");
		if (s1.equals(s2))
		{
			System.out.println("As duas strings são iguais!");
		}
		else{
			System.out.println("As duas strings são diferentes!");
		}
	}
}