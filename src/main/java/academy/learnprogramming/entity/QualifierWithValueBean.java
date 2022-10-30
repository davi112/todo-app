/**
 * 
 */
package academy.learnprogramming.entity;

import javax.inject.Inject;
import javax.inject.Named;

import academy.learnprogramming.annotations.StarWarsCharacter;
import academy.learnprogramming.interfaces.Greeting;

/**
 * @author Davi Martins
 *
 */

@Named
public class QualifierWithValueBean {

	@Inject
	@StarWarsCharacter(value = StarWarsCharacter.StarWarsClass.JEDI)
	private Greeting jedi;
	
	@Inject
	@StarWarsCharacter(value = StarWarsCharacter.StarWarsClass.REBEL)
	private Greeting rebel;
	
	private String name;
	
	private String jediGreeting;
	
	private String rebelGreeting;

	public Greeting getJedi() {
		return jedi;
	}

	public void setJedi(Greeting jedi) {
		this.jedi = jedi;
	}

	public Greeting getRebel() {
		return rebel;
	}

	public void setRebel(Greeting rebel) {
		this.rebel = rebel;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getJediGreeting() {
		return jediGreeting;
	}

	public void setJediGreeting(String jediGreeting) {
		this.jediGreeting = jediGreeting;
	}

	public String getRebelGreeting() {
		return rebelGreeting;
	}

	public void setRebelGreeting(String rebelGreeting) {
		this.rebelGreeting = rebelGreeting;
	}
	
	public void defineJediGreeting() {
		jediGreeting = jedi.sayGreeting(name);
	}
	
	public void defineRebelGreeting() {
		rebelGreeting = rebel.sayGreeting(name);
	}
	
}
