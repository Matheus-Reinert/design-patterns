package br.com.designPatterns.structural.bridge.backend.dao;

import br.com.designPatterns.structural.bridge.backend.model.User;

public interface UserDao {
	void save(User user);
}
