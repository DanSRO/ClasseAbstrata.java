package ExercicioAbstrata;

public abstract class Veiculo {
	
	private String cor = "Verde";
	private int qtdPessoas = 5;
	public String carro="Fusca";
		
	public String getCarro() {
		return carro;
	}
	public void setCarro(String carro) {
		this.carro=carro;
	}
	public String getCor() {
		return cor;
	}
	public void setCor(String cor) {
		this.cor = cor;
	}
	public int getQtdPessoas() {
		return qtdPessoas;
	}
	public void setQtdPessoas(int qtdPessoas) {
		this.qtdPessoas = qtdPessoas;
	}
		
	public void ligar() {
		System.out.println("[Veiculo]: ligado.");
	}
	public void desligar() {
		System.out.println("[Veiculo]: desligado.");
	}
		public void locomover() {
			System.out.println("[Veiculo]: locomovendo.");
	}
}
