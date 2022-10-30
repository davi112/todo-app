/**
 * 
 */
package academy.learnprogramming.entity;

import javax.ejb.Stateless;
import javax.swing.JOptionPane;

import academy.learnprogramming.annotations.StarWarsCharacter;
import academy.learnprogramming.interfaces.Greeting;

/**
 * @author Davi Martins
 *
 */
@Stateless
@StarWarsCharacter(value = StarWarsCharacter.StarWarsClass.REBEL)
@academy.learnprogramming.annotations.Rebel
public class Rebel implements Greeting{

	@Override
	public String sayGreeting(String arg) {
		// TODO Auto-generated method stub
		String msg = "I have a bad feeling about this - said by " + arg;
		//JOptionPane.showMessageDialog(null, msg);]
		return msg;
	}
	
}
