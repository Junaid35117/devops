package com.napier.world;

import java.sql.*;

public class App {

    private Connection con;

    public void connect() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (Exception e) {
            System.out.println("Could not load SQL driver.");
            return;
        }

        try {
            System.out.println("Connecting to database...");
            con = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/world?useSSL=false&allowPublicKeyRetrieval=true",
                    "root",
                    "example");
            System.out.println("Connected Successfully.");
        } catch (Exception e) {
            System.out.println("Failed to connect: " + e.getMessage());
        }
    }

    public void disconnect() {
        try {
            if (con != null) con.close();
        } catch (Exception e) {
            System.out.println("Error closing connection.");
        }
    }

    public static void main(String[] args) {
        App a = new App();
        a.connect();
        a.disconnect();
    }
}
