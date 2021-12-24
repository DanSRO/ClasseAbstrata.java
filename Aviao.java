package ExercicioAbstrata;

public class Aviao extends Veiculo{
	public Aviao() {
		String aviao = "jato";
		String aviao2 = "cargueiro";
	}	
	public void desligar() {
		System.out.println("[AVIAO]: desligado");
	}	
	public void decolar() {
		System.out.println("[AVIAO]: decolando");		
	}
}
