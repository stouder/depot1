/**
 * 
 */
package com.hb.projet.DAO;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.hb.projet.metier.GestionRencontre;
import com.hb.projet.metier.Inscription;
import com.hb.projet.metier.Participant;

/**
 * @author HumanBooster
 *
 */
public class ParticipantDAO implements GenericDAO<Participant> {
	
	private Session session;
	
	public void setSession(Session s){
		this.session = s;
	}
	
	public List<Participant> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

	public Participant getById(long id) {
		// TODO Auto-generated method stub
		Participant p = (Participant)session.load(Participant.class,(int)id);
		
		return p;
	}

	public void delete(Participant object) {
		// TODO Auto-generated method stub
		
	}

	public void update(Participant object) {
		// TODO Auto-generated method stub
		
	}

	public void insert(Participant object) {
		// TODO Auto-generated method stub
		session.save(object);
	}
	
	public List<Participant> tournoiAllByParticipant(long idTournoi){
		//Criteria query = session.createCriteria(Inscription.class).add(Restrictions.eq("tournoi.id", new Long(idTournoi)));
		//String strQuery = "from Inscription i where i.tournoi.id = ?";
		String strQuery = "from GestionRencontre gr where gr.rencontre.id = ?";
		idTournoi = 1;
		
		List<Participant> liste = session.createQuery(strQuery).setLong(0,idTournoi).list();
		//Criteria query2 = session.createCriteria(Participant.class).add(Restrictions.not(""));
		//List<Inscription> liste = query.list();
		
		System.out.println(liste.size());
		//Criteria criteria = session.createCriteria(Inscription.class);//.add(Restrictions.eq("id_tournoi", idTournoi));
		//Query query = session.createQuery("from Inscription");
		//List<Arbitre> liste = query.list();
		//List<Participant> lstPart = query.list();
		
		//return lstPart;
		//Query query = session.createQuery("from Arbitre");
		
		
		return liste;
		
		
	}


}
