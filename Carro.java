package ExercicioAbstrata;

public class Carro extends Veiculo{
	
	public Carro() {
		String carro="Fusca";
	}
	public void parabrisa(boolean limpar) {
		if(limpar==true) {
			System.out.println("Limpando parabrisa");
		}else {
			System.out.println("O vidro vai continuar sujo");
		}		
	}
	public void parabrisa(String limpar) {
		if(limpar=="Limpar parabrisa") {
			System.out.println("Esse carro pensa!");
		}else {
			System.out.println("Voltou a era de Ford");
		}
	}	
	@Override
	public void ligar() {
		System.out.println("[CARRO]: ligado.");
	}	
	@Override
	public void desligar() {
		System.out.println("[CARRO]: desligado.");
	}	
	@Override
	public void locomover() {
		System.out.println("[CARRO]: locomovendo.");
	}
}
