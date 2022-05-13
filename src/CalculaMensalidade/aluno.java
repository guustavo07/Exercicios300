package CalculaMensalidade;

public class aluno {
	public String nomAluno;
	public double mensalidade, mensalidadeTotal;
	public int numIrmaos;
	public aluno(String nomAluno, double mensalidade, int numIrmaos) {
		super();
		this.nomAluno = nomAluno;
		this.mensalidade = mensalidade;
		this.numIrmaos = numIrmaos;
	}
	public String getNomAluno() {
		return nomAluno;
	}
	public void setNomAluno(String nomAluno) {
		this.nomAluno = nomAluno;
	}
	public double getMensalidade() {
		return mensalidade;
	}
	public void setMensalidade(double mensalidade) {
		this.mensalidade = mensalidade;
	}
	public int getNumIrmaos() {
		return numIrmaos;
	}
	public void setNumIrmaos(int numIrmaos) {
		this.numIrmaos = numIrmaos;
	}
	public void setMensalidadeTotal(double mensalidadeTotal) {
		this.mensalidadeTotal = mensalidade;
	}
	public double getMensalidadeTotal() {
		return mensalidadeTotal;
	}
	public void mostrarMensalidade() {
		System.out.println("A mensalidade do aluno "+getNomAluno()+" será: "+getMensalidadeTotal());
	}
}
