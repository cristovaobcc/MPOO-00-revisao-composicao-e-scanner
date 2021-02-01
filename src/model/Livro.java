package model;

public class Livro {
	
	private String nome;
	
	private Estante estante;

	public Livro(String nome, Integer numEstante) {
		this.nome = nome;
		this.estante = new Estante(numEstante ,this);
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Estante getEstante() {
		return estante;
	}

	public void setEstante(Estante estante) {
		this.estante = estante;
	}
	
	

}
