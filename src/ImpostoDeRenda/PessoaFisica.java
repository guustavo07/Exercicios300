package ImpostoDeRenda;

public class PessoaFisica {
	private String nome, cpf;
	private float rendaBruta;
	public PessoaFisica(String nome, String cpf, float rendaBruta) {
		super();
		this.nome = nome;
		this.cpf = cpf;
		this.rendaBruta = rendaBruta;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public float getRendaBruta() {
		return rendaBruta;
	}
	public void setRendaBruta(float rendaBruta) {
		this.rendaBruta = rendaBruta;
	}

}
