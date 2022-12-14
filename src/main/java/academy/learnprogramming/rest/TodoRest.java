/**
 * 
 */
package academy.learnprogramming.rest;

import java.util.List;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.inject.Inject;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import academy.learnprogramming.entity.Todo;
import academy.learnprogramming.service.TodoService;

/**
 * @author Davi Martins
 *
 */
@Path("todo")
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
public class TodoRest {
	
	@Inject
	TodoService todoService;
	
	
	@PostConstruct
	private void init() {
		System.out.println(todoService);
	}
	
	@PreDestroy
	private void kill() {
		System.out.println(todoService);
	}
	
	@Path("new")
	@POST
	public Response createTodo(Todo todo) {
		//api/v1/todo/new
		todoService.createTodo(todo);
		return Response.ok(todo).build();
	}
	
	@Path("update")
	@PUT
	public Response updateTodo(Todo todo) {
		todoService.updateTodo(todo);
		return Response.ok(todo).build();		
	}
	
	@Path("{id}")
	@GET
	public Todo getTodo(@PathParam("id") Long id) {
		return todoService.findById(id);
	}
	
	@Path("list")
	@GET
	public List<Todo> getAll(){
		return todoService.getAll();
	}
	
	@Path("status")
	@POST
	public Response alterarStatus(@QueryParam("id") Long id) {
		Todo todo = todoService.findById(id);
		todo.setComplete(true);
		return updateTodo(todo);
	}
	
}
