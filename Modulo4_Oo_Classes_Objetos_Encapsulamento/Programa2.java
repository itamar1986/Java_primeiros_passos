package Modulo4_Oo_Classes_Objetos_Encapsulamento;

public class Programa2 
{
	public static void main(String[] args) 
	{
		Documento doc1 = new Documento();
		doc1.nome = "Alfredo";
		Documento doc2 = doc1;
		doc2.nome = "Juliana";
		System.out.println("doc1: "+doc1.nome);
		System.out.println("doc2: "+doc2.nome);
	}
}
/*
	agora eu n�o estou mais criando um novo doc2, estou passando a 
	refer�ncia (endere�o) armazenado no meu doc1.
*/