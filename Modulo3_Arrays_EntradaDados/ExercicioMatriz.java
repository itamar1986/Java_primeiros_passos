package Modulo3_Arrays_EntradaDados;
/*
	Implemente um programa que construa uma matriz de double 4x4 
	e para cada c�lula atribua o valor correspondente a i*j.
*/
public class ExercicioMatriz {
public static void main(String[] args)
	{
	double matriz[][] = new double[4][4];//declaracao e construcao da matriz
	for(int i = 0; i < matriz.length; i++)//percorre a matriz no eixo i
	{
	for(int j = 0; j < matriz[i].length; j++)//percorre a matriz no eixo j
	{
	matriz[i][j] = i*j;//atribui o valor a celula
	}
	}
	for(int i = 0; i < matriz.length; i++) //percorre a matriz no eixo i
		{
		for(int j = 0; j < matriz[i].length; j++) //percorre a matriz no eixo j
			{
			//imprime o resultado
			System.out.println("Valor da posi��o ["+i+","+j+"]: "+
			matriz[i][j]);
			}
		}
	}
}
/*
Resolu��o:
1. A matriz ser� de double;
2. A classe dever� manipular um array bidimensional;
3. O valor de cada c�lula corresponder� ao valor dos respectivos �ndices multiplicados.
*/
