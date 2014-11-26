package com.hb.projet.metier;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="Resultat")

public class Resultat {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long id;
	
	@OneToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="id_rencontre",nullable=false,unique=true)
	private Rencontre rencontre;
	
	@OneToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="id_gagnant",nullable=false,unique=true)
	private Participant gagnant;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public Rencontre getRencontre() {
		return rencontre;
	}

	public void setRencontre(Rencontre rencontre) {
		this.rencontre = rencontre;
	}

	public Participant getGagnant() {
		return gagnant;
	}

	public void setGagnant(Participant gagnant) {
		this.gagnant = gagnant;
	}

}
