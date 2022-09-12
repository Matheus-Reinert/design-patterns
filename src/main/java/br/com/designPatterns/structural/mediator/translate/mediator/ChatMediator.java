package br.com.designPatterns.structural.mediator.translate.mediator;

import br.com.designPatterns.structural.mediator.translate.model.User;

public class ChatMediator extends Mediator {

	public String getMessage(String message, User to, User from) {
		return message;
	}
}
