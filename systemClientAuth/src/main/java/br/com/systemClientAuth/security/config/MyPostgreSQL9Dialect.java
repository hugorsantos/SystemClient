package br.com.systemClientAuth.security.config;

import org.hibernate.dialect.PostgreSQL94Dialect;
import org.hibernate.dialect.function.StandardSQLFunction;

public class MyPostgreSQL9Dialect extends PostgreSQL94Dialect {

	public MyPostgreSQL9Dialect() {
		super();
		registerFunction("STRING_AGG", new StandardSQLFunction("STRING_AGG"));
	}
}
