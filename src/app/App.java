package app;

import controller.Controller;
import view.View;

public class App {
	
	public static void main(String[] args) {
		Controller controller = new Controller();
		View view = new View(controller);
		
		view.run();
		
	}

}
