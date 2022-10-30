package scopes;

import javax.inject.Inject;
import javax.inject.Named;

@javax.enterprise.context.RequestScoped //usando para o dependent scope pegar esse session scoped
@Named
public class Scopes {
	
	@Inject
	private DependentScope dependentScope;
	
	@Inject
	private scopes.SessionScoped sessionScoped;
	
	@Inject
	private ApplicationScoped applicationScoped;
	
	@Inject
	private RequestScoped requestScoped;

	public DependentScope getDependentScope() {
		return dependentScope;
	}

	public void setDependentScope(DependentScope dependentScope) {
		this.dependentScope = dependentScope;
	}

	public scopes.SessionScoped getSessionScoped() {
		return sessionScoped;
	}

	public void setSessionScoped(scopes.SessionScoped sessionScoped) {
		this.sessionScoped = sessionScoped;
	}

	public ApplicationScoped getApplicationScoped() {
		return applicationScoped;
	}

	public void setApplicationScoped(ApplicationScoped applicationScoped) {
		this.applicationScoped = applicationScoped;
	}

	public RequestScoped getRequestScoped() {
		return requestScoped;
	}

	public void setRequestScoped(RequestScoped requestScoped) {
		this.requestScoped = requestScoped;
	}
	
	
}
