package Modulo3_Arrays_EntradaDados;
/*
	Implemente um algoritmo que ordene um array com 10 números inteiros. O
	algoritmo deve efetuar uma comparação de cada elemento com o seu sucessor e se a
	ordem não for crescente os elementos devem ter suas posições trocadas, este
	processo deve se repetir até que o array esteja ordenado. 
*/
public class ExercicioOrdenarArray 
{
public static void main(String[] args) 
	{
	int[] arrayInteiros = {55, 27, 33, 45, 92, 100, 3, 8, 11, 70};
	boolean estaOrdenado = false;
	while(!estaOrdenado)
		{
		estaOrdenado = true;
		for(int i = 1; i < arrayInteiros.length; i++)
			{
			if(arrayInteiros[i-1] > arrayInteiros[i])
				{
					estaOrdenado = false;
					int aux = arrayInteiros[i];
					arrayInteiros[i] = arrayInteiros[i-1];
					arrayInteiros[i-1] = aux;
					System.out. println("Ordem atual: "+
					arrayInteiros[0]+ " " + arrayInteiros[1]+" "+
					arrayInteiros[2]+ " " + arrayInteiros[3]+" "+
					arrayInteiros[4]+ " " + arrayInteiros[5]+" "+
					arrayInteiros[6]+ " " + arrayInteiros[7]+" "+
					arrayInteiros[8]+ " " + arrayInteiros[9]);
				}
			}
		}
	}
}