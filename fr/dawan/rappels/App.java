package fr.dawan.rappels;
import java.beans.XMLEncoder;

public class App {

	public static void main(String[] args) {
		//Java est un langage complètement orienté objets
		
		Humain h = new Femme();
		
		Tools t = new Tools();
		t.afficher();
		
		Tools.test();
		
		String s = "test";
		s.toUpperCase();
		
		User u = new User(); // id =  0 - nom = null - roles = null
		u.getRoles().add("admin");
		
		//Constructeur: méthode spéciale publique qui porte le nom de classe. Son rôle est d'instancier la classe
		// créer des objets à partir de classe (initialiser tous les attributs de l'objet)

	}

}
