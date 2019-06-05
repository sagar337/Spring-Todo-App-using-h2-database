package com.springboot.todo;

import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class TodoController {

	
	private TodoItemRepository todoItemRepository;
	
	@RequestMapping("/")
	public String index(Model model) {
		
		ArrayList<TodoItem> todoList = (ArrayList<TodoItem>) todoItemRepository.findAll();
		model.addAttribute("newitem",new TodoItem());
		model.addAttribute("items", new TodoListModel(todoList));
		
		return "index";
	}
	
	@RequestMapping("/add")
	public String addTodo(@ModelAttribute TodoItem reqItem) {
		
		System.out.println("addTodo called");
		TodoItem item = new TodoItem(reqItem.getCategory(),reqItem.getName());
		todoItemRepository.save(item);
		return "redirect:/";
	}
	 @RequestMapping("/update")
	public String updateTodo(@ModelAttribute TodoListModel reqItems) {
		
		System.out.println("addTodo called");
		
		for(TodoItem Item: reqItems.getTodoList()) {
			
			TodoItem item = new TodoItem(Item.getCategory(),Item.getName());
			item.setComplete(Item.isComplete());
			item.setId(Item.getId());
			todoItemRepository.save(item);
			
			
		}
		return "redirect:/";
	}
}
