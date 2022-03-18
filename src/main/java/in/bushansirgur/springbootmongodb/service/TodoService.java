package in.bushansirgur.springbootmongodb.service;

import java.util.List;

import in.bushansirgur.springbootmongodb.model.TodoDTO;
import in.bushansirgur.springbootmongodbException.TodoCollectionException;

public interface TodoService {
public List<TodoDTO> getAllTodos();
	
	public TodoDTO getSingleTodo(String id) throws TodoCollectionException;
	
	public void createTodo(TodoDTO todo) throws TodoCollectionException;
	
	public void updateTodo(String id, TodoDTO todo) throws TodoCollectionException;
	
	public void deleteTodoById(String id) throws TodoCollectionException;

}
