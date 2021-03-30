package com.store.project.Business;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.store.project.Dal.IStoreDal;
import com.store.project.Entities.Store;

@Service
public class StoreManager implements IStoreService{

	private IStoreDal storeDal;
	
	@Autowired
	public StoreManager(IStoreDal storeDal) {
		super();
		this.storeDal = storeDal;
	}

	@Override
	@Transactional
	public List<Store> getAll() {
		return this.storeDal.getAll();
	}

	@Override
	@Transactional
	public void add(Store store) {
		this.storeDal.add(store);
		
	}

	@Override
	@Transactional
	public void update(Store store) {
		this.storeDal.update(store);
		
	}

	@Override
	@Transactional
	public void delete(Store store) {
		this.storeDal.delete(store);
		
	}

	@Override
	@Transactional
	public Store getById(int id) {
		return this.storeDal.getById(id);
		
	}

}
