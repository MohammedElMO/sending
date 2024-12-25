package Controllers;

import java.util.Scanner;

import Model.School;
import View.MainView;
import View.StudentView;
import View.TeacherView;


public class MainController {
	private final MainView  mainView;
	private final School model; 
	private  Scanner scanner  ;

	public MainController(MainView mainView,School model) {
		this.mainView = mainView;
		this.model = model;
		scanner = new Scanner(System.in);
	}


	public void start() {
		while (true) {
		this.mainView.menu();
			System.out.println("quelle operation tu veux appliquer ? \n");
			System.out.print("order : ");
			int order = this.scanner.nextInt();

			switch (order) {
				case 1 -> {
				var studentView  = new StudentView(this.model.getStudents());
				new StudentController(this.model.getStudents(), studentView).start();

				}
				case 2 -> {
					var teacherView  = new TeacherView(this.model.getTeatchers());
				new TeacherController(this.model.getTeatchers(), teacherView).start();

				}
				case 4 -> System.exit(202);
				default -> System.out.println("operation introuvable reessayer!");
			}

		}
	}
}
