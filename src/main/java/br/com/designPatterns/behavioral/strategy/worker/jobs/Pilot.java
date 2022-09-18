package br.com.designPatterns.behavioral.strategy.worker.jobs;

import br.com.designPatterns.behavioral.strategy.worker.strategies.eat.MeatFoodStrategy;
import br.com.designPatterns.behavioral.strategy.worker.strategies.transportation.AirplaneStrategy;
import br.com.designPatterns.behavioral.strategy.worker.strategies.work.PilotStrategy;

public class Pilot implements Worker {

	@Override
	public void eat() {
		new MeatFoodStrategy().eat();
	}

	@Override
	public void move() {
		new AirplaneStrategy().move();
	}

	@Override
	public void work() {
		new PilotStrategy().work();
	}

}
