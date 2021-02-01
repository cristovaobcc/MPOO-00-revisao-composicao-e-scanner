package controller;

import model.DadosArmazenados;
import model.Livro;

public class Controller {
	
	
	public Controller() {
		
	}
	
	public boolean insereNomeDeLivro(String nome, Integer estante) {
		
		Livro livro = new Livro(nome, estante);
		
		return DadosArmazenados.livros.add(livro);
	}
	
	public void metodoA(Livro l) {
		l.setNome(l.getNome()+ "_metodoA");
		metodoB(l);
	}
	
	public void metodoB(Livro l) {
		l.setNome(l.getNome()+"_metodoB");
	}

}
