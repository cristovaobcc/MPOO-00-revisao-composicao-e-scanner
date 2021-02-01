package view;

import java.util.Scanner;

import controller.Controller;

public class View {
	
	
	private static Scanner scanner = new Scanner(System.in);
	private Controller controller;
	
	
	
	public View(Controller controller) {
		super();
		this.controller = controller;
	}

	public void run() {
		
		this.cadastrarLivro();
	}

	public void cadastrarLivro() {
		String opcao;
		do {
			System.err.println("Cadastrar livro...");
			this.insereNomeDeLivro();
			System.out.print("Deseja cadastrar um novo livro?(S/N) ");
			opcao = scanner.next("[sSnN]{1}");
			opcao = opcao.toLowerCase();
		} while (opcao.equals("s"));
	}
	
	
	public boolean insereNomeDeLivro() {
		System.out.print("Digite o nome do livro: ");
		String nome = scanner.nextLine();
		System.out.print("Digite o numero da estante: ");
		String estante = scanner.next();
		Integer numEstante = Integer.parseInt(estante);
		return controller.insereNomeDeLivro(nome, numEstante);
	}
	
	

}
