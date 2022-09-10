package br.com.designPatterns.abstractfactory.app.service.factory;

import br.com.designPatterns.abstractfactory.app.service.services.CarService;
import br.com.designPatterns.abstractfactory.app.service.services.UserService;

public interface ServicesAbstractFactory {

	UserService getUserService();
	
	CarService getCarService();
}
