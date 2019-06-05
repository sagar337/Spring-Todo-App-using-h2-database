package com.springboot.todo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class TodoItem {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;
	private String name;
	private String category;
	private boolean complete;
	
	
	public TodoItem() {}
	public TodoItem(String name, String category) {
		super();
		this.name = name;
		this.category = category;
		this.complete = false;
	}
	
	@Override
	public String toString() {
		return String.format("TodoItem[id=%d,category='%s',name='%s',complete='%b']", id,category,name,
				complete);
		
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public boolean isComplete() {
		return complete;
	}
	public void setComplete(boolean complete) {
		this.complete = complete;
	}
	
	
}
