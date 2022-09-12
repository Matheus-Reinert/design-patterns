package br.com.designPatterns.structural.adapter.tvPort.devices;

import br.com.designPatterns.structural.adapter.tvPort.intefaces.VGA;

public class OldMonitor implements VGA {

	@Override
	public void setImage(String image) {
		System.out.println(">>> This is your video: " + image);
	}
	
}
