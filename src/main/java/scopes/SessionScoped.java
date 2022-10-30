package scopes;

import java.io.Serializable;

@javax.enterprise.context.SessionScoped
public class SessionScoped implements Serializable{

	private static final long serialVersionUID = 440804699990999L;
	
	public String getHashCode() {
		return this.hashCode() + "";
	}
}
