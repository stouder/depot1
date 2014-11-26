package com.hb.projet.metier;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "Tournoi")
public class Tournoi {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;

	@Column(name = "Intitule")
	private String intitule;

	@Column(name = "Activite")
	private String activite;

	@Column(name = "DateDeb")
	// @Temporal(TemporalType.DATE)
	private String dateDeb;

	@Column(name = "DateFin")
	// @Temporal(TemporalType.DATE)
	private String dateFin;

	@Column(name = "Lieu")
	private String lieu;

	@Column(name = "DateFinInscription")
	// @Temporal(TemporalType.DATE)
	private String dateFinInscription;

	@Column(name = "NbParticipants")
	private int nbParticipants;
	
	@ManyToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="id_organisateur")
	private Organisateur organisateur;
	
	public Organisateur getOrganisateur() {
		return organisateur;
	}

	public void setOrganisateur(Organisateur organisateur) {
		this.organisateur = organisateur;
	}


	public String getIntitule() {
		return intitule;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public void setIntitule(String intitule) {
		this.intitule = intitule;
	}

	public String getActivite() {
		return activite;
	}

	public void setActivite(String activite) {
		this.activite = activite;
	}

	public String getDateDeb() {
		return dateDeb;
	}

	public void setDateDeb(String dateDeb) {
		this.dateDeb = dateDeb;
	}

	public String getDateFin() {
		return dateFin;
	}

	public void setDateFin(String dateFin) {
		this.dateFin = dateFin;
	}

	public String getLieu() {
		return lieu;
	}

	public void setLieu(String lieu) {
		this.lieu = lieu;
	}

	public String getDateFinInscription() {
		return dateFinInscription;
	}

	public void setDateFinInscription(String dateFinInscription) {
		this.dateFinInscription = dateFinInscription;
	}

	public int getNbParticipants() {
		return nbParticipants;
	}

	public void setNbParticipants(int nbParticipants) {
		this.nbParticipants = nbParticipants;
	}
}
