package scopes;

import javax.enterprise.context.Dependent;

@Dependent //default
public class DependentScope {
	
	public String getHashCode() {
		return this.hashCode() + "";
	}
}
