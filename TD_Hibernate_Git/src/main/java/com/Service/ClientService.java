package com.Service;

import java.io.Serializable;

import org.hibernate.Hibernate;
import org.hibernate.Session;

import com.Model.Client;
import com.TD_Hibernate_Git.HibernateUtil;

public class ClientService implements Serializable {
	
	public boolean create(Client c)
	{
		Session session = HibernateUtil.getSessionFactory().openSession();
		session.beginTransaction();

		session.save(c); // INSERT INTO Client (nom, prenom) VALUES (c.getNom(), c.getPrenom());
		
		
		session.getTransaction().commit();
		HibernateUtil.shutdown();
		
		
		return true;
	}

}
