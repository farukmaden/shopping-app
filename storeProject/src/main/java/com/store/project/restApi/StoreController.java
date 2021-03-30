package com.store.project.restApi;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.store.project.Business.IStoreService;
import com.store.project.Entities.*;

@RestController
@RequestMapping("/api")
public class StoreController {
	private IStoreService storeService;
	

	@Autowired
	public StoreController(IStoreService storeService) {
		
		this.storeService = storeService;
	}

	@GetMapping("/stores")
	public List<Store> get(){ 
		return storeService.getAll();
	}
	
	@PostMapping("/add")
	public void add(@RequestBody Store store) {
		storeService.add(store);
	}
	@PostMapping("/update")
	public void update(@RequestBody Store store) {
		storeService.update(store);
	}
	@PostMapping("/delete")
	public void delete(@RequestBody Store store) {
		storeService.delete(store);
	}
	@GetMapping("/stores/{id}")
	public Store getById(@PathVariable int id){ 
		return storeService.getById(id);
	}
}








