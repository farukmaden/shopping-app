package com.store.project.Dal;
import java.util.List;

import com.store.project.Entities.Store;

public interface IStoreDal {
	List<Store> getAll();
	void add(Store store);
	void update (Store store);
	void delete (Store store);
	Store getById(int id);

}
