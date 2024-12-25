package Controllers;

import java.util.ArrayList;
import java.util.Scanner;

import Model.Student;
import View.StudentView;

public class StudentController {
	private final ArrayList<Student>  students;
	private final Scanner scanner  = new Scanner(System.in);
	private  final StudentView view ;

    public StudentController(ArrayList<Student> listOfStudents,StudentView studentView ) {
		this.students = listOfStudents;
		this.view = studentView;
	}
	
	public void start() {
		while (true) {
		this.view.menu();
			System.out.println("quelle oeration tu veux appliquer ? \n");
			System.out.print("order : ");
			int order = scanner.nextInt();
			scanner.nextLine();
			switch (order) {
				case 1 -> addStudent();
				case 2 -> removeStudent();
				case 3 -> updateStudent();
				case 4 ->  this.view.displayStudent();
				case 5 -> {
					 break;
				}
				default -> System.out.println("option invalid reessayer");
			}

		}
	}
	
	
	

	public  void addStudent() {
		String name ;
		int age ;

		System.out.print("donner votre nom : ");
		 name = scanner.next();
		 scanner.nextLine();

		System.out.print("donner votre age : ");
		 age = scanner.nextInt();
		 scanner.nextLine();

		System.out.print("donner un id au etudiant : ");
		int id = scanner.nextInt();
		scanner.nextLine();

		var s = new Student(age, name, id);

		if (this.students.stream().anyMatch(st -> st.getId() == id)) {
		System.out.println("etudiant avec cet Id exist deja!");

		}else {

			students.add(s);
		}


	}

	public void removeStudent() {
		System.out.print("donner le id du etudiant pour supprimer: ");
		int id = scanner.nextInt();
		scanner.nextLine();

		for (Student student : students) {
			if(student.getId() == id) {
				students.remove(student);
				return;
			}
		}
		System.out.print(" etudiant avec cet Id n'exist pas! ");

		

	}
	public void updateStudent() {
		System.out.print("donner le id du etudiant pour le mise a jour: ");
		int id = scanner.nextInt();
		scanner.nextLine();

		for (Student student : students) {
			if(student.getId() == id) {
				System.out.print("donner une nouveau age:");
				int age = scanner.nextInt();
				scanner.nextLine();
				System.out.print("donner une nouveau nom:");
				String name = scanner.nextLine();
				student.setAge(age);
				student.setName(name);
			}
		}

	}



}
