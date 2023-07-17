package book.tobyspring31.ch1.user.dao.connectionmaker;

import book.tobyspring31.ch1.user.dao.connectionmaker.ConnectionMaker;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DConnectionMaker implements ConnectionMaker {

    @Override
    public Connection makeConnection() throws ClassNotFoundException, SQLException {
        // D 사의 독자적인 방법으로 Connection을 생성하는 코드
        Class.forName("org.h2.Driver");
        Connection c = DriverManager.getConnection(
                "jdbc:h2:tcp://localhost/~/files/h2Data/toby", "spring", "1234"
        );
        return c;
    }
}
