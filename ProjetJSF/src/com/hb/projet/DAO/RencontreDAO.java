package com.hb.projet.DAO;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;

import com.hb.projet.metier.Rencontre;
import com.hb.projet.metier.Tournoi;

public class RencontreDAO implements GenericDAO<Rencontre> {

	private Session session;
	
	public void setSession(Session s){
		this.session = s;
	}
	
	public List<Rencontre> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

	public Rencontre getById(long id) {
		// TODO Auto-generated method stub
		return null;
	}

	public void delete(Rencontre object) {
		// TODO Auto-generated method stub
		
	}

	public void update(Rencontre object) {
		// TODO Auto-generated method stub
		
	}

	public void insert(Rencontre object) {
		Transaction tx = session.beginTransaction();
		session.save(object);
		tx.commit();
	}

	public List<Rencontre> getAllByTournoi(long idTournoi) {
		Criteria query = session.createCriteria(Rencontre.class).add(Restrictions.eq("tournoi.id",new Long(idTournoi)));
		List<Rencontre> liste = query.list();
		
		return liste;
	}
	
	public List<Rencontre> rencontreByArbitre(long idArbitre){
		Query query =  session.createQuery("from Rencontre where arbitre.id=:idArbitre");
		query.setLong("idArbitre",idArbitre);
		List<Rencontre> result = query.list();
		
		//Criteria query = session.createCriteria(Rencontre.class).add(Restrictions.eq("arbitre.id",idArbitre));
		//List<Rencontre> liste = query.list();
		
		System.out.println("Taille : " + result.size());
		return result;
	}
	
}
