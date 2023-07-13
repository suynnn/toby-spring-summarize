package book.tobyspring31.ch1.user.dao.connectionmaker;

import book.tobyspring31.ch1.user.dao.connectionmaker.ConnectionMaker;

import java.sql.Connection;
import java.sql.SQLException;

public class DConnectionMaker implements ConnectionMaker {

    @Override
    public Connection makeConnection() throws ClassNotFoundException, SQLException {
        // D 사의 독자적인 방법으로 Connection을 생성하는 코드
        return null;
    }
}
