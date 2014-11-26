package com.hb.projet.DAO;

import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.Query;
import org.hibernate.Session;

import com.hb.projet.metier.Arbitre;
import com.hb.projet.metier.Rencontre;
import com.hb.projet.metier.Tournoi;


public class ArbitreDAO implements GenericDAO<Arbitre> {
	
	private Session session;
	
	public void setSession(Session s){
		this.session = s;
	}
	
	public List<Arbitre> getAll() {
		Query query = session.createQuery("from Arbitre");
		List<Arbitre> liste = query.list();
		
		return liste;
	}
	
	public Arbitre getById(long id) {
		// TODO Auto-generated method stub
		Arbitre arbitre = (Arbitre)session.load(Arbitre.class,(int)id);

		return arbitre;
	}
	
	@Transactional
	public void delete(Arbitre object) {
		//Transaction tx = session.beginTransaction();
		session.delete(object);
		//tx.commit();
		
	}
	
	@Transactional
	public void deleteById(int id) {
		// TODO Auto-generated method stub
		Arbitre a = (Arbitre)session.load(Arbitre.class,(int)id);
		session.delete(a);
			
	}

	@Transactional
	public void update(Arbitre object) {
		// TODO Auto-generated method stub
		//Transaction tx = session.beginTransaction();
		session.saveOrUpdate(object);
		//tx.commit();
		
		
	}

	public void insert(Arbitre object) {
		session.save(object);
		//t.commit();
	}
	
	public List<Tournoi>  listTournoiByActivite(String activite){
		Query query =  session.createQuery("from Tournoi where activite=:activite");
		query.setString("activite",activite);		
		List<Tournoi> result = query.list();
		
		//System.out.println("result size" + result.size());
		return result;	
	}

}
