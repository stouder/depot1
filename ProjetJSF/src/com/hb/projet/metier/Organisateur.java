package com.hb.projet.metier;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.hb.projet.DAO.RencontreDAO;
import com.hb.projet.DAO.TournoiDAO;

@Entity
@Table(name="Organisateur")

public class Organisateur extends Personne {
	@PrimaryKeyJoinColumn(name="id")
	
	private String Type;
	
	//@OneToMany
	//@JoinColumn(name="id_organisateur") //modifie avec id_tournoi
	//private List<Tournoi> tournoi;
	
	public void tirageAuSort(int idTournoi){
		//ParticipantDAO pDAO = new ParticipantDAO();
		//ApplicationContext context = new ClassPathXmlApplicationContext( new String[] {"contextApplication.xml"} );
		//SessionFactory sessionFactory = (SessionFactory)context.getBean("sessionFactory");
		
		//Session s = sessionFactory.openSession();
		
		//InscriptionsDAO iDAO = new InscriptionsDAO();
		//iDAO.setSession(s);
		//RencontreDAO rDAO = new RencontreDAO();
		//rDAO.setSession(s);
		//GestionRencontreDAO grDAO = new GestionRencontreDAO();
		//grDAO.setSession(s);
		
		//List<Inscription> listeI = iDAO.participantAllByTournoi(idTournoi);
		//System.out.println(listeI);
		//List<Rencontre> listeR = rDAO.getAllByTournoi(idTournoi);
		//int n = 0;//(int)Math.random()*listeI.size();
		//GestionRencontre gR = new GestionRencontre();
		//gR.setRencontre(listeR.get(0));
		
		//grDAO.insert(gR);
		
		//while(listeI !=null){
			//Participant j = listeI.get(0).getParticipant();
			//System.out.println(listeI);
			//int m = n/2;
			//Rencontre r = listeR.get(m);
			//gR.setP(j);
			//gR.setRencontre(r);
			//gR.setP(j);
			
			//n++;
		//}
		
		//s.close();
		//System.out.println(listeR.get(0).getListeParticipants().get(0).getNom());
		
		
	}
	
	public String getType() {
		return Type;
	}

	public void setType(String type) {
		Type = type;
	}

	//public List<Tournoi> getTournoi() {
	//	return tournoi;
	//}

	//public void setTournoi(List<Tournoi> tournoi) {
	//	this.tournoi = tournoi;
	//}
	
}
