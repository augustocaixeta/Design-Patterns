package com.aacs.pack;

public final class DBConnectionFactory {
    private DBConnectionFactory() { }

    public static DBConnection createMySQLConnection(String host, int port, String database, String user, String password) {
        return new MySQLConnection(host, port, database, user, password);
    }
    
    public static DBConnection createPostgresConnection(String host, int port, String database, String user, String password) {
        return new PostgresConnection(host, port, database, user, password);
    }
}
