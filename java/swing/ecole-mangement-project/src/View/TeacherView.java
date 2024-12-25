package  View;

import java.util.ArrayList;

import Model.Teatcher;


public class TeacherView {
	private final ArrayList<Teatcher> teachers ;

	public TeacherView(ArrayList<Teatcher> teachers) {
		this.teachers = teachers;
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
		for (Teacher teacher : teachers) {
			System.out.println(teacher);
		}
	}

}
