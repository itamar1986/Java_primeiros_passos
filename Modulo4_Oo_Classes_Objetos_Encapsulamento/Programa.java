package Modulo4_Oo_Classes_Objetos_Encapsulamento;

public class Programa 
{
	public static void main(String[] args) 
	{
		//Declarando meu objeto documento1
		Documento documento1;
		//Criando objeto documento1
		documento1 = new Documento();
		//Atribuindo os valores para o documento1
		documento1.codigo = 123456;
		documento1.nome = "Alfredo";
		documento1.foto = "Img1.png";
		documento1.dataNascimento = "20/05/1990";
		System.out.println("Código do documento: "+documento1.codigo);
	}
}
/*
	“Declaramos uma variável do tipo Documento denominada documento1, atribuímos a variável
	documento1 uma instância da classe Documento e para cada atributo do nosso objeto
	documento1 atribuímos os respectivos valores. Ao final o valor do código é impresso”
*/
