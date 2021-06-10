package com.Service;

import java.io.Serializable;

import org.hibernate.Hibernate;
import org.hibernate.Session;

import com.Model.Client;
import com.TD_Hibernate_Git.HibernateUtil;

public class ClientService implements Serializable {
	
	public boolean create(Client c, Session s)
	{
		s.save(c); // INSERT INTO Client (nom, prenom) VALUES (c.getNom(), c.getPrenom());
		
		return true;
	}
	
	public void delete(Client c, Session s)
	{
		c = s.get(Client.class, 3);
		s.delete(c); 
		
	}

}
