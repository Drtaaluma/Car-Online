package com.example.caronline;

import android.os.StrictMode;
import android.util.Log;

import java.sql.Connection;
import java.sql.DriverManager;

public class DataBase {
    private static final String jdbcDriver = "com.mysql.jdbc.Driver";
    private static final String Url = "jdbc:mysql:192.168.43.163//:3306/CarData";

    private static final String Email = "wisemen3236";
    private static final String Password = "wisemen3236*";

    public static Connection connection(){

        StrictMode.ThreadPolicy policy = new StrictMode.ThreadPolicy
                .Builder().permitAll().build();
        StrictMode.setThreadPolicy(policy);

        Connection conn = null;

        try{
            Class.forName(jdbcDriver);
            conn = DriverManager.getConnection(Url, Email, Password);

        } catch (Exception se){
            Log.e("Error: ", se.getMessage());
        }
        return conn;
    }
}

