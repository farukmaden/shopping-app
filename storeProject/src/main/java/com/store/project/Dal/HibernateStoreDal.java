package com.store.project.Dal;

import java.util.List;

import javax.persistence.EntityManager;

import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.store.project.Entities.Store;

@Repository
public class HibernateStoreDal implements IStoreDal{

	private EntityManager entityManager;
	@Autowired
	public HibernateStoreDal(EntityManager entityManager) {
		
		this.entityManager = entityManager;
	}

	@Override
	@Transactional
	public List<Store> getAll() {
		Session session = entityManager.unwrap(Session.class);
		List<Store> stores = session.createQuery("from Store" , Store.class).getResultList();
		return stores;
	}

	@Override
	public void add(Store store) {
		Session session = entityManager.unwrap(Session.class);
		session.saveOrUpdate(store);
		
	}

	@Override
	public void update(Store store) {
		Session session = entityManager.unwrap(Session.class);
		session.saveOrUpdate(store);
		
	}

	@Override
	public void delete(Store store) {
		Session session = entityManager.unwrap(Session.class);
		Store storeToDelete = session.get(Store.class, store.getId());
		session.delete(storeToDelete);
		
	}

	@Override
	public Store getById(int id) {
		Session session = entityManager.unwrap(Session.class);
		
		Store store = session.get(Store.class, id);
		return store;
	}

}
