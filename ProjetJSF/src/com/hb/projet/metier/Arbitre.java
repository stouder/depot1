package com.hb.projet.metier;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

@Entity
@Table(name="Arbitre")

@PrimaryKeyJoinColumn(name="id")

public class Arbitre extends Personne {
	@Column(name="activite")
	private String activite;

	public String getActivite() {
		return activite;
	}

	public void setActivite(String activite) {
		this.activite = activite;
	}
	

}
