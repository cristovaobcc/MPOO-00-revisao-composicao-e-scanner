package model;

public class Estante {
	
	private Integer numero;

	public Estante(int numero) {
		super();
		this.numero = numero;
	}

	public Estante(Integer numEstante, Livro livro) {
		this.numero = numEstante;
		livro.setEstante(this);
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}
	
	
}
