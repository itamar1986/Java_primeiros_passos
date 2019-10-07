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
	O método max() é utilizado para verificar o maior valor entre dois números, e
	o método min() é utilizado para verificar o menor valor entre dois números, que
	podem ser do tipo double, float, int ou long.
*/