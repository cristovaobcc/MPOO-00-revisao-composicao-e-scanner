package view;

import java.util.Scanner;

import controller.Controller;

public class View {
	
	
	private Scanner scanner;
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
		scanner = new Scanner(System.in);
		do {
			
			System.err.println("Cadastrar livro...");			
			this.insereNomeDeLivro(scanner);
			System.out.print("Deseja cadastrar um novo livro?(S/N) ");
			opcao = scanner.next("[sSnN]{1}");
			opcao = opcao.toLowerCase();
			
		} while (opcao.equals("s"));
	}
	
	
	public boolean insereNomeDeLivro(Scanner scanner) {
		System.out.print("Digite o nome do livro: ");
		String nome = scanner.nextLine();
		System.out.print("Digite o numero da estante: ");
		String estante = scanner.next();
		Integer numEstante = Integer.parseInt(estante);
		return controller.insereNomeDeLivro(nome, numEstante);
	}
	
	

}
