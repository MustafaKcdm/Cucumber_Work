package _JDBC.Gun_01;

import org.testng.annotations.Test;

import java.sql.ResultSet;
import java.sql.SQLException;

public class _02_NextPrevAbsRel extends JDBC_Parent{

        @Test
        public void tectNextPrev() throws SQLException {
            statement.executeQuery("use sakila");
            ResultSet rs = statement.executeQuery("select * from language");

            rs.next();
            System.out.println("Dil adı 1. satır: " + rs.getString(2) ); // 2 sütun sayısı

            rs.next();
            System.out.println("Dil adı 2. satır: " + rs.getString(2) ); // Italian

            rs.next();
            System.out.println("Dil adı 3. satır: " + rs.getString(2) ); // Japanese

            rs.previous(); // 2. satıra gider
        }

        @Test
    public void AbsoluteRelative() throws SQLException {
            statement.executeQuery("use sakila");
            ResultSet rs = statement.executeQuery("select * from film");
           rs.absolute(10);//baştan itibare 10. satıra git
           rs.absolute(-10);//sondan itibare 10. satıra git
           rs.relative(10);//bulunduğu yerden itibaren 10. satıra gider
            System.out.println(rs.getString("title") );



        }
}
