/*
	Implemente um programa Java que imprima e conte quantos parâmetros
	foram passados durante a sua interpretação, execute este programa passando 6
	parâmetros quaisquer e , após, execute novamente sem passar parâmetros. 
 */
package Modulo3_Arrays_EntradaDados;

public class ExercicioMainParametros 
{
	public static void main(String[] parametros) 
	{
		if(parametros != null)
		{
			System.out.println("Foram passados: "+parametros.length+" parametros");
			for(int i = 0; i < parametros.length; i++)
			System.out.println("parametro "+i+": "+parametros[i]);
		}
	}
}