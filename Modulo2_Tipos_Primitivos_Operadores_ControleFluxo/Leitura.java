//importe a classe Scanner para utilizar a leitura pelo teclado
//Similar ao #include do C
import java.util.Scanner;
package Modulo2_Tipos_Primitivos_Operadores_ControleFluxo;
public class Leitura 
{
	public static void main(String[] args) 
	{
		//crie a vari�vel de leitura dos dados
		Scanner s = new Scanner(System.in);
		//use os m�todos de leitura espec�ficos do tipo desejado
		System.out.print("digite uma linha: ");
		String linha = s.nextLine(); // le a linha
		System.out.print("digite um numero: ");
		int i = s.nextInt(); // le um inteiro
		System.out.print("digite um numero: ");
		double d = s.nextDouble(); // le um ponto-flutuante
	}
}


