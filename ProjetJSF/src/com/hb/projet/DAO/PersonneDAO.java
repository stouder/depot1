package com.hb.projet.DAO;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;

import com.hb.projet.metier.Inscription;
import com.hb.projet.metier.Personne;

public class PersonneDAO implements GenericDAO<Personne> {
	private Session session;
	
	public void setSession(Session s){
		this.session = s;
	}

	public List<Personne> getAll() {
		// TODO Auto-generated method stub
		return null;
	}


	public Personne getById(long id) {
		// TODO Auto-generated method stub
		return null;
	}

	public void delete(Personne object) {
		// TODO Auto-generated method stub
		
	}

	public void update(Personne object) {
		// TODO Auto-generated method stub
		
	}

	public void insert(Personne object) {
		// TODO Auto-generated method stub
		
	}
	
	public Personne login(String login,String passwd) {
		Criteria query = session.createCriteria(Personne.class).add(Restrictions.eq("Passwd", new String(passwd))).add(Restrictions.eq("Login", new String(login)));
		List<Personne> liste = query.list();
		Personne personne;
		if(liste.size()==0)
			personne = null;
		else
			personne = liste.get(0);
		
		return personne;
		
	}
}
