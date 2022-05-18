package Questao6;

public abstract class PoligonoRegular {
	public int numLados;
	public float tamLado;
	public PoligonoRegular(int numLados, float tamLado) {
		super();
		this.numLados = numLados;
		this.tamLado = tamLado;
	}
	public int getNumLados() {
		return numLados;
	}
	public void setNumLados(int numLados) {
		this.numLados = numLados;
	}
	public float getTamLado() {
		return tamLado;
	}
	public void setTamLado(float tamLado) {
		this.tamLado = tamLado;
	}
	public int calcularPerimetro() {
		return 1;
	}
	public abstract float calcularArea();
}
