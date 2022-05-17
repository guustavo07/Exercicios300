package Questao4;

public class Carro extends Veiculo {
	public int qtdePortas;

	public Carro(String cor, String placa, String modelo, int ano, double comb, int qtdePortas) {
		super(cor, placa, modelo, ano, comb);
		this.qtdePortas = qtdePortas;
	}

	public int getQtdePortas() {
		return qtdePortas;
	}

	public void setQtdePortas(int qtdePortas) {
		this.qtdePortas = qtdePortas;
	}
	public String imprimir() {
		return "Carro "+getModelo()+"Cor "+getCor()+"Placa"+getPlaca();
	}

}
