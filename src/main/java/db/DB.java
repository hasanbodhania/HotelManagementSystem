/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package db;
import java.sql.Connection;
import java.sql.DriverManager;

public class DB {
    public static Connection connect() {
        try {
            return DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/hotel_db",
                "root",
                "Hasan4043/"
            );
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}

