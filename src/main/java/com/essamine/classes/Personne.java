package com.essamine.classes;

public class Personne {

	private String nom;
	private String fonction;
	private int age;


	public Personne(String nom,int age){
		this.nom=nom;
		this.age=age;
	}

	public Personne(String nom,String fonction){
		this.nom=nom;
		this.fonction=fonction;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public void setFonction(String fonction) {
		this.fonction = fonction;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String toString(){
		return "Nom:"+nom+"\nFonction:"+fonction+"\nAge:"+age;
	}


}
