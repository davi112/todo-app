package scopes;

@javax.enterprise.context.ApplicationScoped
public class ApplicationScoped {

	public String getHashCode() {
		return this.hashCode() + "";
	}
}
