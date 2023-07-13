package book.tobyspring31.ch1.user.dao;

import book.tobyspring31.ch1.user.dao.connectionmaker.ConnectionMaker;

public class MessageDao {

    private ConnectionMaker connectionMaker;

    public MessageDao(ConnectionMaker connectionMaker) {
        this.connectionMaker = connectionMaker;
    }
}
