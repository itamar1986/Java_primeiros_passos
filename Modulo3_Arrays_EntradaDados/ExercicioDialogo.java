package Modulo3_Arrays_EntradaDados;
//Importando classe do Swing
import javax.swing.JOptionPane;
public class ExercicioDialogo 
{
	public static void main(String[] args) 
	{
		String nome;
		//Este comando mostra um dialogo que solicita entrada de dados
		nome = JOptionPane.showInputDialog("Digite o seu nome: ");
		String mensagem = nome+" está fazendo o curso Java Iniciante";
		//Este comando mostra um dialogo que apenas exibe a mensagem
		JOptionPane.showMessageDialog(null, mensagem);
	}
}
/*
	Metodo showConfirmDialog - Utilizado para confirmações, diálogos cuja resposta seja do tipo
sim, não ou cancela.
	Metodo showInputDialog - Utilizado para entrada de dados pelo usuário.
	Metodo showMessageDialog - Informa ao usuário alguma coisa
	Metodo showOptionDialog - Uma mistura dos três outros métodos, ou seja, pode ser
utilizado para informar, para entrada de dados e ainda confirmações.
*/