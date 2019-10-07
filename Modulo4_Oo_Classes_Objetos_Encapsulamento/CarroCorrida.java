package Modulo4_Oo_Classes_Objetos_Encapsulamento;
class Piloto
{
	private String nome;
	private Integer habilidade;
	private Integer idade;
	public String getNome() {
	return nome;
	}
	public void setNome(String nome) {
	this.nome = nome;
	}
	public Integer getHabilidade() {
	return habilidade;
	}
	public void setHabilidade(Integer habilidade) {
	this.habilidade = habilidade;
	}
	public Integer getIdade() {
	return idade;
	}
	public void setIdade(Integer idade) {
	this.idade = idade;
}
class CarroCorrida 
{
	//Estado
	private Integer numeroIdentificacao;
	private Double velocidadeAtual = 0.0;
	private Double velocidadeMaxima = 100.0;
	private Piloto piloto;
	//Comportamento...
	void ligar()
	{
		System.out.println("VRUUUMmmmmmmmmm");
	}
	void desligar()
	{
		System.out.println("MMMmmmm......");
	}
	void acelerar()
	{
		velocidadeAtual += 10 + piloto.habilidade*0.1;
		if(velocidadeAtual > velocidadeMaxima)
	{
			velocidadeAtual = velocidadeMaxima;
	}
	}
	void frear(Integer intensidadeFreada)
	{
			if(intensidadeFreada > 100)
		{
				intensidadeFreada = 100;
		}
			else if(intensidadeFreada < 0)
		{
				intensidadeFreada = 0;
		}
		velocidadeAtual -= intensidadeFreada*0.25;
			if(velocidadeAtual < 0)
		{
				velocidadeAtual = 0.0;
		}
	}
}
}