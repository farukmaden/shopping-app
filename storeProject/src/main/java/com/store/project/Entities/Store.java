package com.store.project.Entities;
import javax.persistence.*;

@Entity
@Table(name="store")
public class Store {
	
	@Id
	@Column(name="ID")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id ;
	@Column(name="price")
	private int price;
	@Column(name="brand")
	private String brand;
	
	
	public Store(int id, int price, String brand) {
		super();
		this.id = id;
		this.price = price;
		this.brand = brand;
	}
	public Store() {
		
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	

}
