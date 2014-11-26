package com.hb.projet.metier;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.PrimaryKeyJoinColumn;

@Entity
@Table(name="Participant")

@PrimaryKeyJoinColumn(name="id")

public class Participant extends Personne {

	@ManyToOne
	@JoinColumn(name="id_rencontre")
	private GestionRencontre gestionRencontre;
	
	public Participant() {
		// TODO Auto-generated constructor stub
	}
	
	public void setGestionRencontre(GestionRencontre gestionRencontre) {
		this.gestionRencontre = gestionRencontre;
	}
	
	public GestionRencontre getGestionRencontre() {
		return gestionRencontre;
	}
	
}
