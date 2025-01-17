package com.mjc.stage2.impl;

import com.mjc.stage2.ConnectionFactory;
import lombok.SneakyThrows;

import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Properties;

public class H2ConnectionFactory implements ConnectionFactory {

    @SneakyThrows
    @Override
    public Connection createConnection() {
        Properties props = new Properties();
        try (InputStream fis = H2ConnectionFactory.class.getClassLoader().getResourceAsStream("h2database.properties")) {
            props.load(fis);
        }
        String url = props.getProperty("db_url");
        String password = props.getProperty("password");
        String name = props.getProperty("user");
        return DriverManager.getConnection(url, name, password);
    }
}

