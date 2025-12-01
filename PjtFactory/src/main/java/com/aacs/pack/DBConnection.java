package com.aacs.pack;

import java.sql.Connection;

public interface DBConnection {
    public Connection getConnection() throws Exception;
}
