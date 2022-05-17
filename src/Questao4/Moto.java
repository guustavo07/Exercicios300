package Questao4;

public class Moto extends Veiculo {
	public int qtdeCilindradas;	
	public Moto(String cor, String placa, String modelo, int ano, double comb, int qtdeCilindradas) {
		super(cor, placa, modelo, ano, comb);
		this.qtdeCilindradas = qtdeCilindradas;
	}
	public int getQtdeCilindradas() {
		return qtdeCilindradas;
	}
	public void setQtdeCilindradas(int qtdeCilindradas) {
		this.qtdeCilindradas = qtdeCilindradas;
	}
	public String imprimir() {
		return "Moto "+getModelo()+"Cor "+getCor()+"Placa"+getPlaca()+"Cilindradas "+qtdeCilindradas;
	}

}
