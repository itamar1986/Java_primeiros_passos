/*
	Implemente um programa Java que imprima e conte quantos par�metros
	foram passados durante a sua interpreta��o, execute este programa passando 6
	par�metros quaisquer e , ap�s, execute novamente sem passar par�metros. 
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