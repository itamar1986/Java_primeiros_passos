package Modulo5_Pacotes_JavaLang_JavaUtil;
public class JavaIniciante_11_max_min 
{
	public static void main (String args[])
	{
		int a = 10;
		double b = 5.4;
		int c = -4;
		System.out.println("Qual o maior valor? 10 ou 5.4: " + Math.max(a, b));
		System.out.println("Qual o maior valor? 5.4 ou -4: " + Math.max(b, c));
		System.out.println("Qual o menor valor? 5.4 ou -4: " + Math.min(b, c));
	}
}
/*
	O m�todo max() � utilizado para verificar o maior valor entre dois n�meros, e
	o m�todo min() � utilizado para verificar o menor valor entre dois n�meros, que
	podem ser do tipo double, float, int ou long.
*/