package _JDBC.Gun_01;

import org.testng.annotations.Test;

import java.sql.*;

public class _01_Intro {

    @Test
    public void Test1() throws SQLException {
        String hostUrl="jdbc:mysql://db-technostudy.ckr1jisflxpv.us-east-1.rds.amazonaws.com:3306";
        String username="root";
        String password="'\"-LhCB'.%k[4S]z";

        Connection connection = DriverManager.getConnection(hostUrl,username,password);//db'ye giriş
        Statement statement = connection.createStatement(); //sorgu ortamı oluşturma
        ResultSet rs  =  statement.executeQuery("use sakila");//sorgu çalılştırma sonuç setine kaydetme
        ResultSet rs2  =  statement.executeQuery("select * from customer");//sorgu çalılştırma sonuç setine kaydetme
        rs2.next();//ilk satıra gitti
        String fn = rs2.getString("first_name");
        String ln = rs2.getString("last_name");
        System.out.println("1. satır müştosu "+ fn + " " + ln);

        rs2.next();//satır 2
        fn = rs2.getString("first_name");
        ln = rs2.getString("last_name");
        System.out.println("2. satır müştosu "+ fn + " " + ln);

        connection.close();

    }
}
