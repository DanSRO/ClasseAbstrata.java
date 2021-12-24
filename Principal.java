package ExercicioAbstrata;

public class Principal {

	public static void main(String[] args) {
		//Veiculo v1 = new Veiculo(); (não pode ser instanciado)
		Carro c1  = new Carro();
		Aviao a1 = new Aviao();
				
		//v1.ligar(); (método não funciona)
		c1.ligar();
		a1.ligar();
		c1.parabrisa(true);
		c1.parabrisa("Limpar parabrisa");
	}
}
