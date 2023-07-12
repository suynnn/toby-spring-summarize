package book.tobyspring31.ch1.user;

import book.tobyspring31.ch1.user.dao.ConnectionMaker;
import book.tobyspring31.ch1.user.dao.DConnectionMaker;
import book.tobyspring31.ch1.user.dao.NConnectionMaker;
import book.tobyspring31.ch1.user.dao.UserDao;

import java.sql.SQLException;

public class UserDaoTest {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        ConnectionMaker dConnectionMaker = new DConnectionMaker();
        ConnectionMaker nConnectionMaker = new NConnectionMaker();

        UserDao dUserDao = new UserDao(dConnectionMaker);
        UserDao nUserDao = new UserDao(nConnectionMaker);

        // ...
    }
}
