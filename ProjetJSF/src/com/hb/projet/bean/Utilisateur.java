package com.hb.projet.bean;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.context.FacesContext;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.hb.projet.DAO.PersonneDAO;
import com.hb.projet.metier.Personne;

@ManagedBean(name="utilisateur")
@RequestScoped
public class Utilisateur {
	private String login;
	private String mdp;
	

	public String login() {
		FacesContext context = FacesContext.getCurrentInstance();
		SessionFactory sessionFactory = (SessionFactory) context.getAttributes().get("EntityManager"); 
		Session s = sessionFactory.openSession();
		PersonneDAO pDAO = new PersonneDAO();
		pDAO.setSession(s);
		
		Personne personne = pDAO.login(login,mdp);
		
		if(personne == null){
			return "erreur";
		}else{
			return "login";
		}
	}
}
