package Modulo5_Pacotes_JavaLang_JavaUtil;
public class JavaIniciante_14_wrapper 
{
	public static void main (String args[])
	{
		Integer a = new Integer(2);
		int b = a.intValue();
		Double c = new Double(4.5);
		double d = c.doubleValue();
		System.out.println("Valor de b: " + b);
		System.out.println("Valor de d: " + d);
	}
}
/*
	Wrapper são classes usadas para embutir tipos primitivos para que possam ser utilizados 
	como objetos. Cada tipo primitivo tem a sua classe wrapper correspondente. As classes 
	wrapper são: Character, Byte, Short, Integer, Long, Float, Double e Boolean.
	Cada classe wrapper permite manipular tipos primitivos como objetos da classe Object.
*/