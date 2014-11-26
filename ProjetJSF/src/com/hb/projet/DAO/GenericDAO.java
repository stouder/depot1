package com.hb.projet.DAO;

import java.util.List;

public interface GenericDAO<T> {
	public List<T> getAll();
	public T getById(long id);
	public void delete(T object);
	public void update(T object);
	public void insert(T object);
}
