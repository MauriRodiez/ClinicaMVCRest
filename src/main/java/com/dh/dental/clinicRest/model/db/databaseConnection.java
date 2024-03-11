package com.dh.dental.clinicRest.model.db;

import org.apache.log4j.Logger;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class databaseConnection {

    private static Connection dbConnect;
    private static final String DB_URL = "jdbc:mysql://localhost:3306/clinica";
    private static final String DB_USER = "root";
    private static final String DB_PASSWORD = "Bdatos2023";

    private static final Logger LOGGER = Logger.getLogger(databaseConnection.class);



    static {

            try {

                dbConnect = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD);
                LOGGER.info("Se conecto a la base de datos");

            } catch (SQLException e) {
                e.printStackTrace();
                throw new RuntimeException("No es posible establecer una conexión a la base de datos");
            }
    }

    public static Connection getDbConnect() {
        return dbConnect;
    }
}
