package com.essamine.classes;

import java.text.DecimalFormat;
import java.util.List;

public class Personne {

	private List<Object> favNumers;
	private String fonction;
	private String nom;
	private int age;


	public Personne(){	
	}

	public Personne(String nom,int age){
		this.nom=nom;
		this.age=age;
	}

	public Personne(String nom,String fonction){
		this.nom=nom;
		this.fonction=fonction;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public void setBiens(List<Object> favNumers) {
		this.favNumers = favNumers;
	}

	public void setFonction(String fonction) {
		this.fonction = fonction;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String toString(){
		String fichePer="Nom:"+nom+"\nFonction:"+fonction+"\nAge:"+age;

		StringBuffer buffer=new StringBuffer();
		DecimalFormat formatter=new DecimalFormat("0 00");

		for(Object favNumer:favNumers){
			buffer.append("-");
			buffer.append(formatter.format((Integer) favNumer));	
		}
		return fichePer+"\nNombres preferés:"+buffer.toString();
	}
}
