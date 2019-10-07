package Modulo4_Oo_Classes_Objetos_Encapsulamento;

class Corrida 
{
	public static void main(String[] args) 
	{
		//Criacao dos carros que irao correr
		CarroCorrida carroEquipeVelocidade = new CarroCorrida(1, 100.0);
		CarroCorrida carroEquipeTrapaceiros = new CarroCorrida(2, 100.0);
		//Criacao dos pilotos de cada equipe
		Piloto pilotoEquipeVelocidade = new Piloto();
		Piloto pilotoEquipeTrapaceiros = new Piloto();
		//Atributos do piloto da equipe Velocidade
		pilotoEquipeVelocidade.setNome("Piloto 1");
		pilotoEquipeVelocidade.setIdade(25);
		pilotoEquipeVelocidade.setHabilidade(75);
		//Atributos do piloto da equipe Trapaceiros
		pilotoEquipeTrapaceiros.setNome("Piloto 2");
		pilotoEquipeTrapaceiros.setIdade(27);
		pilotoEquipeTrapaceiros.setHabilidade(65);
		//Os pilotos sao colocados nos seus carros
		carroEquipeVelocidade.setPiloto(pilotoEquipeVelocidade);
		carroEquipeTrapaceiros.setPiloto(pilotoEquipeTrapaceiros);
		//Identificao dos carros
		carroEquipeVelocidade.setNumeroIdentificacao(1);
		carroEquipeTrapaceiros.setNumeroIdentificacao(2);
		//Carros sao ligados
		carroEquipeVelocidade.ligar();
		carroEquipeTrapaceiros.ligar();
		//Inicia a corrida
		carroEquipeVelocidade.acelerar();
		carroEquipeTrapaceiros.acelerar();
		carroEquipeVelocidade.acelerar();
		carroEquipeTrapaceiros.acelerar();
		carroEquipeVelocidade.acelerar();
		carroEquipeTrapaceiros.acelerar();
	}
}