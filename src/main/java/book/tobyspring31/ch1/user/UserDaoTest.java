package book.tobyspring31.ch1.user;

import book.tobyspring31.ch1.user.dao.*;

import java.sql.SQLException;

public class UserDaoTest {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        UserDao userDao = new DaoFactory().userDao();

        // ...
    }
}
