package br.com.designPatterns.structural.mediator.swing.before.components;


public class State {
	private int counter;
	
	public State() {
		counter = 0;
	}
	
	public void addCount() {
		counter++;
	}

	public int getCounter() {
		return counter;
	}

	public void setCounter(int counter) {
		this.counter = counter;
	}
}
