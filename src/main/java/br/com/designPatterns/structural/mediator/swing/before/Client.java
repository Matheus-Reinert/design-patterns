package br.com.designPatterns.structural.mediator.swing.before;

import br.com.designPatterns.structural.mediator.swing.before.components.AddButton;
import br.com.designPatterns.structural.mediator.swing.before.components.Label;
import br.com.designPatterns.structural.mediator.swing.before.components.ResetButton;
import br.com.designPatterns.structural.mediator.swing.before.components.State;

import javax.swing.*;
import java.awt.*;

public class Client {
	private AddButton button;
	private ResetButton reset;
	private Label label;
	private State state;
	
	public Client() {
		state = new State();
		label = new Label(state);
		button = new AddButton(state, label);
		reset = new ResetButton(state, label, button);
	}

	public void run() {
		JFrame frame = new JFrame();  
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(new BorderLayout());
		
		JLabel title = new JLabel("Counter");
		frame.add(title, BorderLayout.NORTH);

		frame.add(reset, BorderLayout.WEST);
		frame.add(button, BorderLayout.CENTER);
		frame.add(label, BorderLayout.SOUTH);
		
		frame.setSize(400,200);  
		frame.setVisible(true);
	}
	
	public static void main(String[] args) {
		new Client().run();
	}
}
