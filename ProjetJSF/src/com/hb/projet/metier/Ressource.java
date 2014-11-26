package com.hb.projet.metier;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Ressource")

public class Ressource {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	
	private long id;
}
