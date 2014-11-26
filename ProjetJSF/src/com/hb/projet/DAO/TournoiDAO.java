package com.hb.projet.DAO;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;

import com.hb.projet.metier.Tournoi;

public class TournoiDAO implements GenericDAO<Tournoi> {
	private Session session;

	public void setSession(Session s) {
		this.session = s;
	}

	public List<Tournoi> getAll() {
		Query query = session.createQuery("from Tournoi");
		List<Tournoi> liste = query.list();

		return liste;
	}

	public Tournoi getById(long id) {
		// Tournoi tournoi =
		// (Tournoi)session.createQuery("from Tournoi where id=:id");//load(Tournoi.class,(long)id);
		Criteria query = session.createCriteria(Tournoi.class).add(Restrictions.eq("id", new Long(id)));
	
		//query.setLong("id", id);
		List result = query.list();
		Tournoi tournoi = (Tournoi) result.get(0);

		return tournoi;
	}

	public void delete(Tournoi object) {
		Transaction tx = session.beginTransaction();
		session.delete(object);
		tx.commit();
	}

	public void update(Tournoi object) {
		Transaction tx = session.beginTransaction();
		session.saveOrUpdate(object);
		System.out.println("id Object : " +object.getId());
		tx.commit();
	}

	public void insert(Tournoi object) {
		// Transaction tx = session.beginTransaction();
		session.save(object);
		// tx.commit();
	}

	public List<Tournoi> tournoiByActivite(String activite) {
		Query query = session
				.createQuery("from Tournoi where activite = :activite");
		query.setString("activite", activite);
		List<Tournoi> tournoi = query.list();
		System.out.println("result size A : " + tournoi.size());
		return tournoi;
	}

	public List<Tournoi> tournoiByOrganisateur(long idOrganisateur) {
		Query query = session
				.createQuery("from Tournoi where organisateur.id = :idOrganisateur");
		query.setLong("idOrganisateur", idOrganisateur);
		List<Tournoi> result = query.list();
		System.out.println("result size : " + result.size());

		return result;
	}

}
