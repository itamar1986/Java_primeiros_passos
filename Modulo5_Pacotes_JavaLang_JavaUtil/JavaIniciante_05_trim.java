package Modulo5_Pacotes_JavaLang_JavaUtil;
public class JavaIniciante_05_trim 
{
	public static void main (String args[])
	{
		String s = " Java Iniciante ";
		System.out.println("Com espaços: *" + s + "*");
		System.out.println("Sem espaços: *" + s.trim() + "*");
	}
}
/*
	O método trim() tem por objetivo remover todos os espaços em branco que	aparecem no 
	início e no final de uma determinada string. Observe que serão removidos apenas 
	os espaços do início e do fim da string – não serão removidos os espaços entre as palavras.
 */