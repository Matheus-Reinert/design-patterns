package br.com.designPatterns.criational.builder.spolleto.after.model.builder;

import br.com.designPatterns.criational.builder.spolleto.after.model.Pasta;

public class PastaBuilder extends MealBuilderOpt {

	public Pasta getResult() {
		return new Pasta(toppings, sauces, size, cheese, pepper);
	}
}
