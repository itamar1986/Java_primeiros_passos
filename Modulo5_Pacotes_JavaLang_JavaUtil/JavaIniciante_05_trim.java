package Modulo5_Pacotes_JavaLang_JavaUtil;
public class JavaIniciante_05_trim 
{
	public static void main (String args[])
	{
		String s = " Java Iniciante ";
		System.out.println("Com espa�os: *" + s + "*");
		System.out.println("Sem espa�os: *" + s.trim() + "*");
	}
}
/*
	O m�todo trim() tem por objetivo remover todos os espa�os em branco que	aparecem no 
	in�cio e no final de uma determinada string. Observe que ser�o removidos apenas 
	os espa�os do in�cio e do fim da string � n�o ser�o removidos os espa�os entre as palavras.
 */