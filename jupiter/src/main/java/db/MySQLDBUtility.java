package db;

public class MySQLDBUtility {
	private static final String INSTANCE = "project-instance.c2bgylnaa4ou.us-west-1.rds.amazonaws.com";
	private static final String PORT_NUM = "3306";
	public static final String DB_NAME = "Jupiter";
	private static final String USERNAME = "admin";
	private static final String PASSWORD = "x64540340";
	public static final String URL = "jdbc:mysql://"
			+ INSTANCE + ":" + PORT_NUM + "/" + DB_NAME
			+ "?user=" + USERNAME + "&password=" + PASSWORD
			+ "&autoReconnect=true&serverTimezone=UTC";
}
