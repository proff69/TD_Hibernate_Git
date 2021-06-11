package com.TD_Hibernate_Git;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.hibernate.Session;

import com.Model.Client;
import com.Model.Produit;
import com.Service.ClientService;

public class Principale {

	public static void main(String[] args) {
		
		ClientService cs = new ClientService();

		Client c1 = new Client("Jean", "Jacques");
		
		Produit p1 = new Produit("Samsung S20", "S2020", "01/03/2021", 899.99, "Smartphone Samsung S20 appareil photo 24Mpx");
		Produit p2 = new Produit("Iphone I12", "I1212", "01/04/2021", 999.99, "Smartphone Apple Iphone I12...");
		
		Set<Produit> listeP = new HashSet<Produit>();
		listeP.add(p1);
		listeP.add(p2);
		
		c1.setProduits(listeP);
		
		Session session = HibernateUtil.getSessionFactory().openSession();
		session.beginTransaction();
		
//		cs.delete(session, 3);
//		c1.setPrenom("Paul");
//		cs.update(session, 2);
		Client c2 = cs.findById(session, 1);
		System.out.println("nom : " + c2.getNom() + ", prenom : " + c2.getPrenom() + ", liste produits : " + c2.getProduits().toString());
		
		List<Client> listeC = cs.findAll(session);

		for(Client cli : listeC)
		{
			System.out.println("nom : " + cli.getNom() + ", prenom : " + cli.getPrenom());
		}
		
		session.getTransaction().commit();
		HibernateUtil.shutdown();

	}

}
