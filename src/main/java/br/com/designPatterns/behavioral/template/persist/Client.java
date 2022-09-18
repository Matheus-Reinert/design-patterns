package br.com.designPatterns.behavioral.template.persist;

import br.com.designPatterns.behavioral.template.persist.models.UserModel;

public class Client {

	public static void main(String[] args) {
		UserModel user = new UserModel("user", "passwd");
		user.save();
		
		System.out.println("---------");
		
		UserModel invalidUser = new UserModel(null, null);
		invalidUser.save();
	}
}
