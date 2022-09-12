package br.com.designPatterns.criational.builder.spolleto.after.model.builder;

import br.com.designPatterns.criational.builder.spolleto.after.model.Salad;

public class SaladBuilder extends MealBuilderOpt {

	public Salad getResult() {
		return new Salad(toppings, sauces, size, cheese, pepper);
	}
}
