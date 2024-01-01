package fr.dawan.rappels;

import java.util.ArrayList;
import java.util.List;

public class User {
	
	private int id;
	private String nom;
	private List<String> roles;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	
	public void afficherDetails() {
		
	}
	public User() {
		super();
		roles = new ArrayList();
	}
	public List<String> getRoles() {
		return roles;
	}
	public void setRoles(List<String> roles) {
		this.roles = roles;
	}
}