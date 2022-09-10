package br.com.designPatterns.factory.apple.after.factory;

import br.com.designPatterns.factory.apple.after.model.IPhone;
import br.com.designPatterns.factory.apple.after.model.IPhoneX;

public class IPhoneXFactory extends IPhoneFactory {

	public IPhone createIPhone() {
		return new IPhoneX();
	}

}
