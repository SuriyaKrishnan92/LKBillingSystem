/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.utils;

import java.sql.*;

/**
 *
 * @author Suriya & Gowrisundar
 */
public class MySqlConnectioProvider {

    public static Connection getConn() {
        try {
            //Class.forName("com.mysql.jdbc.Driver");
            Connection conn = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/lkconnbillingschema", "lkconnbilling", "lkconnbilling");
            return conn;
        } catch (Exception exp) {
            System.out.println("Exception Occured: " + exp);
            return null;
        }
    }
}
