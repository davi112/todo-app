package scopes;

@javax.enterprise.context.RequestScoped
public class RequestScoped {
	
	public String getHashCode() {
		return this.hashCode() + "";
	}	
}
