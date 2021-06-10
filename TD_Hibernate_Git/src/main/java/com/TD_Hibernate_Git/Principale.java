package com.TD_Hibernate_Git;

import java.util.HashSet;
import java.util.Set;

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
		
		cs.create(c1);

	}

}
