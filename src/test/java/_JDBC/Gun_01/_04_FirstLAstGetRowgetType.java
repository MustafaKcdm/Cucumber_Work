package _JDBC.Gun_01;

import org.testng.annotations.Test;

import java.sql.ResultSet;
import java.sql.SQLException;

public class _04_FirstLAstGetRowgetType extends  JDBC_Parent{

    @Test
    public void Test1() throws SQLException {
        statement.executeQuery("use sakila");
        ResultSet rs = statement.executeQuery("select city from city");
        rs.last(); //son satıra gider
        System.out.println("son şehir: " + rs.getString(1));

        rs.first();
        System.out.println("ilk şehir: " + rs.getString(1));

        int kacinciSatir = rs.getRow();
        System.out.println(kacinciSatir);
    }
}
