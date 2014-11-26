package com.hb.projet.DAO;

import java.util.List;

import javassist.bytecode.Descriptor.Iterator;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;

import com.hb.projet.metier.Arbitre;
import com.hb.projet.metier.Inscription;

public class InscriptionsDAO implements GenericDAO<Inscription> {
	private Session session;

	public void setSession(Session s) {
		this.session = s;
	}

	public List<Inscription> getAll() {
		Query query = session.createQuery("from Inscription");
		List<Inscription> liste = query.list();

		return liste;
	}

	public Inscription getById(long id) {
		Inscription inscription = (Inscription) session.load(Inscription.class,
				(int) id);
		return inscription;
	}

	public void delete(Inscription object) {
		// TODO Auto-generated method stub

	}

	public void update(Inscription object) {
		// TODO Auto-generated method stub

	}

	public void insert(Inscription object) {
		// TODO Auto-generated method stub
		session.save(object);
	}

	public long nbInscrit(long id) {
		// Criteria qNbInscrit = session.createCriteria(Inscription.class)
		Query query = session
				.createQuery("Select count(*) from Inscription where tournoi.id = :idTournoi");
		query.setParameter("idTournoi", id);
		long resultCount = 1;// query.uniqueResult();

		return resultCount;
	}

	public List<Inscription> participantAllByTournoi(long idTournoi) {
		Criteria query = session.createCriteria(Inscription.class).add(
				Restrictions.eq("tournoi.id", new Long(idTournoi)));
		List<Inscription> liste = query.list();

		return liste;

		// String strQuery = "from Inscription i where i.tournoi.id = ?";
		// String strQuery =
		// "from Inscription i where i.GestionRencontre where i.tournoi.id = 4";
		// List<Inscription> liste =
		// session.createQuery(strQuery).list();//.setLong(0,idTournoi).list();
		// Criteria query2 =
		// session.createCriteria(Participant.class).add(Restrictions.not(""));
		// Criteria criteria =
		// session.createCriteria(Inscription.class);//.add(Restrictions.eq("id_tournoi",
		// idTournoi));

	}

	public List tournoiAllByParticipant(long idParticipant) {
		Query query = session
				.createQuery("from Inscription i Join i.tournoi where i.participant.id=:idParticipant");
		query.setParameter("idParticipant", idParticipant);
		List result = query.list();

		return result;
	}

	public List<Inscription> inscriptionByIdByTournoi(long idParticipant,
			long idTournoi) {
		Criteria query = session.createCriteria(Inscription.class)
				.add(Restrictions.eq("tournoi.id", new Long(idTournoi)))
				.add(Restrictions.eq("participant.id", new Long(idParticipant)));
		List<Inscription> liste = query.list();

		return liste;
	}
}
