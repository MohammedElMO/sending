package View;

import java.util.ArrayList;

import Model.Student;

public class StudentView {
	private final ArrayList<Student> students ;

	public StudentView(ArrayList<Student> students) {
		this.students = students;
	}

	public void menu() {
		System.out.println("<<<Gestion Des Etudiants>>>");
		System.out.println("1.Ajouter un etudiant");
		System.out.println("2.supprimer un etudiant");
		System.out.println("3.mise à jour un étudiant");
		System.out.println("4.afficher les  etudiants");
		System.out.println("5.retour au menu principal");
	}

	public void displayStudent() {
		System.out.println("les etudiant sont : ");
		for (Student student : students) {
			System.out.println(student);
		}
	}

	
}
