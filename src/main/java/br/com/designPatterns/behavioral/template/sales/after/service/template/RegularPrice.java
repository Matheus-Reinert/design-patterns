package br.com.designPatterns.behavioral.template.sales.after.service.template;

import br.com.designPatterns.behavioral.template.sales.after.model.Cart;

public class RegularPrice extends BestOfferTemplate {

	public RegularPrice(Cart cart) {
		super(cart);
	}

	@Override
	public boolean isAppliable() {
		return true;
	}

	@Override
	protected void calibrateVariables() {
		// Nothing to adjust!
	}

}
