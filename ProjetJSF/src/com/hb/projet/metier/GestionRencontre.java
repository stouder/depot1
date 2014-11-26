package com.hb.projet.metier;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="GestionRencontre")

public class GestionRencontre {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long id;
	
//	@ManyToOne(cascade=CascadeType.ALL)
//	@JoinColumn(name="id_participant")
	@OneToMany(cascade=CascadeType.ALL)
	@JoinColumn(name="id_participant")
	private List<Participant> participant;
	
	@ManyToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="id_rencontre")
	private Rencontre rencontre;
	
	@Column(name="resultat")
	private boolean resultat;
	
	public boolean isResultat() {
		return resultat;
	}

	public void setResultat(boolean resultat) {
		this.resultat = resultat;
	}

	public Rencontre getRencontre() {
		return rencontre;
	}

	public void setRencontre(Rencontre rencontre) {
		this.rencontre = rencontre;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public List<Participant> getParticipant() {
		return participant;
	}

	public void setParticipant( List<Participant>  participant) {
		this.participant = participant;
	}

}
