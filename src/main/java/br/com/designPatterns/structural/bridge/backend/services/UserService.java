package br.com.designPatterns.structural.bridge.backend.services;

import br.com.designPatterns.structural.bridge.backend.dao.UserDao;
import br.com.designPatterns.structural.bridge.backend.model.User;

public abstract class UserService {
	protected UserDao dao;

	public UserService(UserDao dao) {
		this.dao = dao;
	}
	
	public abstract void save(User user);
}
