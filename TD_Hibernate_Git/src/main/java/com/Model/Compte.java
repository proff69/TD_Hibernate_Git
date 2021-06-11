package com.Model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "Compte")
public class Compte {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id", nullable = false, unique = true)
	private int id;
	
	@Column(name = "email", nullable = true, unique = false, length = 50)
	private String email;
	
	@Column(name = "mot_de_passe", nullable = true, unique = false, length = 50)
	private String mot_de_passe;
	
	@OneToOne(mappedBy = "compte")
	private Client client;

}
