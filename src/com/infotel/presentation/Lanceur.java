package com.infotel.presentation;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.infotel.metier.Adresse;
import com.infotel.metier.Client;
import com.infotel.metier.Connexion;
import com.infotel.metier.Employe;
import com.infotel.metier.Personne;
import com.infotel.services.Iservices;
import com.infotel.services.ServicesImpl;

public class Lanceur {

	public static void main(String[] args) {
		
		//EntityManagerFactory emf = Persistence.createEntityManagerFactory("demojpa-pu");
		Iservices services = new ServicesImpl();
		
		/*
		Personne p = new Personne();
		p.setNom("ZEC");
		p.setPrenom("UNION");
		p.setAge(20);
		services.ajouterPersonne(p);
		*/
		/*
		Personne p1 = new Personne();
		p1.setNom("Fléchard");
		p1.setPrenom("Hughes");
		p1.setAge(48);
		services.ajouterPersonne(p1);
		
		Personne p2 = new Personne();
		p2.setNom("Paul");
		p2.setPrenom("Jean");
		p2.setAge(20);
		services.ajouterPersonne(p2);
		
		Personne p3 = new Personne();
		p3.setNom("Ultron");
		p3.setPrenom("Roger");
		p3.setAge(45);
		services.ajouterPersonne(p3);
		
		Personne p4 = new Personne();
		p4.setNom("Bizarre");
		p4.setPrenom("Bulle");
		p4.setAge(12);
		services.ajouterPersonne(p4);
		*/
		
		/*
		Client c = new Client();
		c.setNom("Bond");
		c.setPrenom("James");
		c.setAge(70);
		c.setNumeroAdherent(7);
		
		services.ajouterPersonne(c);
		
		Employe e = new Employe();
		e.setNom("Huge");
		e.setPrenom("Jacque");
		e.setAge(41);
		e.setSalaire(2000);
		
		services.ajouterPersonne(e);
		*/
		/*
		System.out.println(services.getPersonneAff(2));
		*/
		/*
		Personne p = new Personne();
		p=services.getPersonneSuppr(3);
		services.supprimerPersonne(p);
		*/
		/*
		Personne p = new Personne();
		p=services.getPersonneAff(2);
		p.setAge(60);
		services.modifierPersonne(p);
		System.out.println(p);
		*/
		/*
		System.out.println(services.findAllPersonne());
		*/
		//System.out.println(services.rechercherParMC("ZEC"));
		
		/*
		Adresse a1 = new Adresse();
		a1.setNomRue("Orsel");
		a1.setNumRue(5);
		a1.setVille("Paris");
		services.ajouterAdresse(a1);
		
		Adresse a2 = new Adresse();
		a2.setNomRue("Olege");
		a2.setNumRue(15);
		a2.setVille("Riguen");
		services.ajouterAdresse(a2);
		
		Adresse a3 = new Adresse();
		a3.setNomRue("Mont à regret");
		a3.setNumRue(2);
		a3.setVille("Limoges");
		services.ajouterAdresse(a3);
		
		Connexion c1 = new Connexion();
		c1.setLogin("jeanjean");
		c1.setMdp("jean87");
		services.ajouterConnexion(c1);
		
		Connexion c2 = new Connexion();
		c2.setLogin("kevindu14");
		c2.setMdp("olol");
		services.ajouterConnexion(c2);
		
		Connexion c3 = new Connexion();
		c3.setLogin("micheldater");
		c3.setMdp("rosemarie");
		services.ajouterConnexion(c3);
		
		Connexion c4 = new Connexion();
		c4.setLogin("ergot");
		c4.setMdp("2k18:!%");
		services.ajouterConnexion(c4);
		*/
		/*
		System.out.println(services.getAdresseAff(2));
		System.out.println(services.getConnexionAff(3));
		*/
		
		/*
		Adresse a = new Adresse();
		a=services.getAdresseSuppr(2);
		services.supprimerAdresse(a);
		
		Connexion c = new Connexion();
		c = services.getConnexionSuppr(3);
		services.supprimerConnexion(c);
		*/
		
		/*
		Adresse a = new Adresse();
		a=services.getAdresseAff(3);
		a.setNumRue(3);
		a.setNomRue("Echafaud");
		services.modifierAdresse(a);
		System.out.println(a);
		
		Connexion c = new Connexion();
		c=services.getConnexionAff(2);
		c.setLogin("Raoul");
		c.setMdp("Octopus");
		services.modifierConnexion(c);
		System.out.println(c);
		*/
		
		//System.out.println(services.findAllAdresse());
		//System.out.println(services.findAllConnexion());
		
		//System.out.println(services.rechercherParMCConnexion("go"));
		
		/*
		Personne p = new Personne();
		Adresse a = new Adresse();
		//a.setCp("75000");
		a.setNomRue("rue des lilas");
		a.setNumRue(15);
		a.setVille("Paris");
		
		p.setNom("Marcel");
		p.setPrenom("Pagnol");
		p.setAge(25);
		p.setAdresse(a);
		
		services.ajouterPersonne(p);
		*/
		
		/*
		Adresse a = new Adresse();
		a = services.getAdresseSuppr(4);
		services.supprimerAdresse(a);
		*/
		
		
		
		//Appel à la méthode pour la jointure
		for (Personne pers : services.findAllPersonnesAdresse()) {
			System.out.println(pers +" "+ pers.getAdresse());

		}
		
	}

}
