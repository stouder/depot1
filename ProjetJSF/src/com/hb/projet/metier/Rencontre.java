package com.hb.projet.metier;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="Rencontre")
@Inheritance(strategy=InheritanceType.JOINED)

public class Rencontre {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long id;
	
	@OneToOne(cascade=CascadeType.ALL)
	private Arbitre arbitre;
	
	@ManyToOne(cascade=CascadeType.ALL)
	private Tournoi tournoi;
	
	@Column(name="Vainqueur")
	private int vainqueur;
	
	//@OneToMany
	//private List<Participant> participants;
	/*@OneToOne
	@JoinColumn(name="id_p1")
	private Participant p1;
	
	@OneToOne
	@JoinColumn(name="id_p2")
	private Participant p2;
	*/
	
	
//	@OneToMany(cascade=CascadeType.ALL)
//	@JoinColumn(name="id_participant")
//	private List<Participant> p;
	
    //@OneToMany
    //@JoinColumn(name="id_participant",referencedColumnName="id")
    //private List<Participant> listeParticipants;
    
	public Rencontre(){

	}
	
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

	public Arbitre getArbitre() {
		return arbitre;
	}

	public void setArbitre(Arbitre arbitre) {
		this.arbitre = arbitre;
	}


	
}
