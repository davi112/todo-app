/**
 * 
 */
package academy.learnprogramming.service;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import academy.learnprogramming.entity.Todo;

/**
 * @author Davi Martins
 *
 */
@Transactional
public class TodoService {
	
	@PersistenceContext
	EntityManager entityManager;
	
	public Todo createTodo(Todo todo) {
		//Persist into db
		entityManager.persist(todo);
		return todo;
	}
	
	public Todo updateTodo(Todo todo) {
		entityManager.merge(todo);
		return todo;
	}
	
	public Todo findById(Long id) {
		return entityManager.find(Todo.class, id);
	}
	
	public List<Todo> getAll(){
		return entityManager.createQuery("SELECT t from Todo t", Todo.class).getResultList();
	}
	
}
