package br.com.designPatterns.factory.app.dbadapter.after.factory;

import br.com.designPatterns.factory.app.dbadapter.after.db.DB;

public interface DBFactory {
	DB getDatabase();
}
