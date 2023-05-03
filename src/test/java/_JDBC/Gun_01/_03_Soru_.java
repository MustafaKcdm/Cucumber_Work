package _JDBC.Gun_01;


import org.testng.annotations.Test;

import java.sql.ResultSet;
import java.sql.SQLException;

public class _03_Soru_ extends JDBC_Parent {
    //city tablosundaki bütün isimleri next ile yazdırnız

    @Test
    public void Test() throws SQLException {
        statement.executeQuery("use sakila");
        ResultSet rs = statement.executeQuery("select * from city");
     while(rs.next() == true ){
         System.out.println(rs.getString("city"));
     }
    }

    //TODO: şehir isimlerini relative ve absolute ile yazdırınız

}
