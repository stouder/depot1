package com.hb.projet.DAO;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.hb.projet.metier.Organisateur;

public class OrganisateurDAO implements GenericDAO<Organisateur> {
	private Session session;
	
	public void setSession(Session s){
		this.session = s;
	}
	
	public List<Organisateur> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

	public Organisateur getById(long id) {
		// TODO Auto-generated method stub
		return null;
	}

	public void delete(Organisateur object) {
		// TODO Auto-generated method stub
		
	}

	public void update(Organisateur object) {
		// TODO Auto-generated method stub
		
	}

	public void insert(Organisateur object) {
		// TODO Auto-generated method stub
		session.save(object);
	}

	
}
