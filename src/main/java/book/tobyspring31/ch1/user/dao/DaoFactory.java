package book.tobyspring31.ch1.user.dao;

import book.tobyspring31.ch1.user.dao.connectionmaker.ConnectionMaker;
import book.tobyspring31.ch1.user.dao.connectionmaker.DConnectionMaker;

public class DaoFactory {

    public UserDao userDao() {
        return new UserDao(connectionMaker());
    }

    public AccountDao accountDao() {
        return new AccountDao(connectionMaker());
    }

    public MessageDao messageDao() {
        return new MessageDao(connectionMaker());
    }

    public ConnectionMaker connectionMaker() {
        return new DConnectionMaker();
    }
}
