package book.tobyspring31.ch1.user;

import book.tobyspring31.ch1.user.dao.*;
import book.tobyspring31.ch1.user.domain.User;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

import java.sql.SQLException;

public class UserDaoTest {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {

//        ApplicationContext context = new AnnotationConfigApplicationContext(DaoFactory.class);
        ApplicationContext context = new GenericXmlApplicationContext("applicationContext.xml");
        UserDao userDao = context.getBean("userDao", UserDao.class);

        User user = userDao.get("whiteship");
        System.out.println(user.getId());
        System.out.println(user.getPassword());
        System.out.println(user.getName());
    }
}
