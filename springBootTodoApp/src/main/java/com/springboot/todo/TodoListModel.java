package com.springboot.todo;

import java.util.ArrayList;

import javax.validation.Valid;

public class TodoListModel {
	@Valid
	private ArrayList<TodoItem> todoList = new ArrayList<>();

	
	public TodoListModel() {}
	public TodoListModel(ArrayList<TodoItem> todoList) {
		super();
		this.todoList = todoList;
	}
	
	public ArrayList<TodoItem> getTodoList(){
		return todoList;
	}
	
	public void setTodoList(ArrayList<TodoItem> todoList) {
		this.todoList = todoList;
	}
	
	
}
