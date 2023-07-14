package book.tobyspring31.ch1.user.dao;

import book.tobyspring31.ch1.user.dao.connectionmaker.ConnectionMaker;
import book.tobyspring31.ch1.user.dao.connectionmaker.DConnectionMaker;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DaoFactory {

    @Bean
    public UserDao userDao() {
        return new UserDao(connectionMaker());
    }

    @Bean
    public ConnectionMaker connectionMaker() {
        return new DConnectionMaker();
    }
}
