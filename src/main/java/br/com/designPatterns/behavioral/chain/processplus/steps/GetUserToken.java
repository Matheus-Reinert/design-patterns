package br.com.designPatterns.behavioral.chain.processplus.steps;

import br.com.designPatterns.behavioral.chain.processplus.service.ProcessContext;

public class GetUserToken extends ProcessStep {

	public GetUserToken(Object... args) {
		super(args);
	}

	@Override
	public ProcessContext execute(ProcessContext context) throws Exception {
		String emailDb = (String) context.get("user.email");
		context.put("token", emailDb.toUpperCase());
		return next(context, emailDb.toUpperCase());
	}

}
