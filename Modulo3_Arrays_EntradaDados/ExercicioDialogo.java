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
		String mensagem = nome+" est� fazendo o curso Java Iniciante";
		//Este comando mostra um dialogo que apenas exibe a mensagem
		JOptionPane.showMessageDialog(null, mensagem);
	}
}
/*
	Metodo showConfirmDialog - Utilizado para confirma��es, di�logos cuja resposta seja do tipo
sim, n�o ou cancela.
	Metodo showInputDialog - Utilizado para entrada de dados pelo usu�rio.
	Metodo showMessageDialog - Informa ao usu�rio alguma coisa
	Metodo showOptionDialog - Uma mistura dos tr�s outros m�todos, ou seja, pode ser
utilizado para informar, para entrada de dados e ainda confirma��es.
*/