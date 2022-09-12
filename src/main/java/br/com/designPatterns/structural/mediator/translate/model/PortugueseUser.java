package br.com.designPatterns.structural.mediator.translate.model;

import br.com.designPatterns.structural.mediator.translate.mediator.Mediator;

public final class PortugueseUser extends User {

	public PortugueseUser(String name, Mediator mediator) {
		super(name, mediator, Language.PORTUGUESE);
	}
	
}
