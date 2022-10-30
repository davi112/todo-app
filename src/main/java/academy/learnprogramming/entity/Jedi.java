/**
 * 
 */
package academy.learnprogramming.entity;

import java.io.Serializable;

import javax.ejb.Stateful;
import javax.ejb.Stateless;
import javax.faces.bean.RequestScoped;
import javax.faces.bean.SessionScoped;

import academy.learnprogramming.annotations.StarWarsCharacter;
import academy.learnprogramming.interfaces.Greeting;

/**
 * @author Davi Martins
 *
 */
@Stateful
@StarWarsCharacter(value = StarWarsCharacter.StarWarsClass.JEDI)
@academy.learnprogramming.annotations.Jedi
public class Jedi implements Greeting, Serializable{

	@Override
	public String sayGreeting(String arg) {
		// TODO Auto-generated method stub
		return "May The Force Be With You - said by " + arg;		
	}

}
