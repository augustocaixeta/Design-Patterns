package com.aacs.pack;

import java.sql.Connection;
import java.sql.DriverManager;

public class MySQLConnection implements DBConnection {
    private final String url;
    private final String user;
    private final String password;
    
    public MySQLConnection(String host, int port, String database, String user, String password) {
        this.url = "jdbc:mysql://" + host + ":" + port + "/" + database;
        this.user = user;
        this.password = password;
    }
    
    @Override
    public Connection getConnection() throws Exception {
        return DriverManager.getConnection(url, user, password);
    }
}
