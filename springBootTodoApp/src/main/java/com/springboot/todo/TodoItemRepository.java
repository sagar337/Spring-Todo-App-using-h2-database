package com.springboot.todo;

import java.util.List;

import org.springframework.data.repository.CrudRepository;


public interface TodoItemRepository extends CrudRepository<TodoItem, Long>{

	public List<TodoItem> findById(String Id);
}
