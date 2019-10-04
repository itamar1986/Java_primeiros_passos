package Modulo3_Arrays_EntradaDados;
/*
Implemente um programa que construa um array de inteiros (int) de
tamanho 1.000.000 com valores atribuídos de acordo com o seu índice, procure o
valor 555.000, entre os valores armazenados no vetor. Compare o tempo gasto
utilizando o método “binarySearch” da classe Arrays e uma procura simples
percorrendo todos os elementos do array até encontrar o valor desejado. 
*/
import java.util.Arrays;
public class ExercicioPesquisarArray 
{
	public static void main(String[] args) 
	{
		//Criacao do array de 1.000.000 de posicoes
		int[] numerosInteiros = new int[1000000];
		//Definicao do numero a ser pesquisado
		int numeroPesquisado = 555000;
		//Preenchimento do Array
		for(int i = 0; i < 1000000; i++)
		numerosInteiros[i] = i;
		//Inicio da contagem do tempo
		long inicio = System.currentTimeMillis();
		//Percorrendo o array em busca do numero
		for(int i = 0; i < 1000000; i++)
		{
			if(numerosInteiros[i] == numeroPesquisado)
			break;
		}
		//fim da contagem do tempo
		long fim = System.currentTimeMillis();
		//Imprime o tempo total de pesquisa
		System.out.println("Pesquisa 1: "+(fim-inicio)+" ms");
		//Inicia a contagem do tempo
		inicio = System.currentTimeMillis();
		//Faz a pesquisa utilizando a classe Arrays
		Arrays.binarySearch(numerosInteiros, numeroPesquisado);
		//Fim da contagem do tempo
		fim = System.currentTimeMillis();
		//Imprime o tempo total de pesquisa
		System.out.println("Pesquisa 2: "+(fim-inicio)+" ms");
	}
}