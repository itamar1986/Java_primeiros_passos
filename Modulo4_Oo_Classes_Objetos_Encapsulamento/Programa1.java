package Modulo4_Oo_Classes_Objetos_Encapsulamento;

public class Programa1 
{
	public static void main(String[] args) 
	{
		Documento doc1 = new Documento();
		doc1.nome = "Alfredo";
		Documento doc2 = new Documento();
		doc2.nome = "Juliana";
		System.out.println("doc1: "+doc1.nome);
		System.out.println("doc2: "+doc2.nome);
	}
}
/*
	Os endere�os s�o obtidos atrav�s da palavra reservada new que cria o novo objeto, 
	aloca-o na mem�ria e retorna o endere�o de acesso.
*/