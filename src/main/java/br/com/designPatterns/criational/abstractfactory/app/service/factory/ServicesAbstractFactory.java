package br.com.designPatterns.criational.abstractfactory.app.service.factory;

import br.com.designPatterns.criational.abstractfactory.app.service.services.CarService;
import br.com.designPatterns.criational.abstractfactory.app.service.services.UserService;

public interface ServicesAbstractFactory {

	UserService getUserService();
	
	CarService getCarService();
}
