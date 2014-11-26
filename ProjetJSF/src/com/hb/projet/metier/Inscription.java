package com.hb.projet.metier;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="Inscription")

public class Inscription {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long id;
	
	@ManyToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="id_tournoi")
	private Tournoi tournoi;
	
    public Arbitre getArbitre() {
		return arbitre;
	}

	public void setArbitre(Arbitre arbitre) {
		this.arbitre = arbitre;
	}

	@Column(name="fraisInscripton")
    private int fraisInscription;
   
    @OneToOne(cascade=CascadeType.ALL)
    @JoinColumn(name="id_participant")
    private Participant participant;
    
   @OneToOne(cascade=CascadeType.ALL)
   //@JoinColumn(name="id_arbitre")
   private Arbitre arbitre;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public Tournoi getTournoi() {
		return tournoi;
	}

	public void setTournoi(Tournoi tournoi) {
		this.tournoi = tournoi;
	}

	public int getFraisInscription() {
		return fraisInscription;
	}

	public void setFraisInscription(int fraisInscription) {
		this.fraisInscription = fraisInscription;
	}

	public Participant getParticipant() {
		return participant;
	}

	public void setParticipant(Participant participant) {
		this.participant = participant;
	}


    
}
