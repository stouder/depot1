package com.hb.projet.DAO;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

import com.hb.projet.metier.GestionRencontre;
import com.hb.projet.metier.Participant;

public class GestionRencontreDAO implements GenericDAO<GestionRencontre> {
	
	private Session session;
	
	public void setSession(Session s){
		this.session = s;
	}
	
	public List<GestionRencontre> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

	public GestionRencontre getById(long id) {
		// TODO Auto-generated method stub
		GestionRencontre gR = (GestionRencontre)session.load(GestionRencontre.class,id);

		return gR;
	}

	public void delete(GestionRencontre object) {
		// TODO Auto-generated method stub
		
	}

	public void update(GestionRencontre object) {
		// TODO Auto-generated method stub
		Transaction tx = session.beginTransaction();
		session.saveOrUpdate(object);
		tx.commit();
		
	}

	public void insert(GestionRencontre object) {
		Transaction tx = session.beginTransaction();
		session.save(object);
		tx.commit();	
	}

	public List<Participant> participantByRencontre(long idRencontre) {
		Query query = session.createQuery("from GestionRencontre where rencontre.id = idRencontre");
		List<Participant> liste = query.list();
		
		return liste;
	}


}
