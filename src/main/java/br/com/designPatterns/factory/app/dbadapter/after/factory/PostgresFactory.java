package br.com.designPatterns.factory.app.dbadapter.after.factory;

import br.com.designPatterns.factory.app.dbadapter.after.db.DB;
import br.com.designPatterns.factory.app.dbadapter.after.db.PostgresDB;

public class PostgresFactory implements DBFactory {

	@Override
	public DB getDatabase() {
		return new PostgresDB();
	}

}
