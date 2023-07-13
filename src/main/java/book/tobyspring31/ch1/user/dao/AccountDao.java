package book.tobyspring31.ch1.user.dao;

import book.tobyspring31.ch1.user.dao.connectionmaker.ConnectionMaker;

public class AccountDao {
    private ConnectionMaker connectionMaker;

    public AccountDao(ConnectionMaker connectionMaker) {
        this.connectionMaker = connectionMaker;
    }
}
