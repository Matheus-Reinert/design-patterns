package br.com.designPatterns.behavioral.chain.processplus.steps;

import br.com.designPatterns.behavioral.chain.processplus.repository.UserRepository;
import br.com.designPatterns.behavioral.chain.processplus.service.ProcessContext;

import java.util.Map;

public class SaveUser extends ProcessStep {
	
	public SaveUser(Object... args) {
		super(args);
	}

	@Override
	@SuppressWarnings("unchecked")
	public ProcessContext execute(ProcessContext context) throws Exception {
		Map<String, Object> userInput = (Map<String, Object>) context.get("input");
		UserRepository.getInstance().saveUser(userInput);
		return next(context, String.format("User '%s' saved!", userInput.get("name")));
	}

}
