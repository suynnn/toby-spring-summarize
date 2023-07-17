package book.tobyspring31.ch1.user;

import book.tobyspring31.ch1.user.dao.CountingDaoFactory;
import book.tobyspring31.ch1.user.dao.UserDao;
import book.tobyspring31.ch1.user.dao.connectionmaker.CountingConnectionMaker;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.sql.SQLException;

public class UserDaoConnectionCountingTest {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(CountingDaoFactory.class);

        UserDao dao = context.getBean("userDao", UserDao.class);

        //
        // DAO 사용코드
        //
        CountingConnectionMaker ccm = context.getBean("connectionMaker", CountingConnectionMaker.class);
        System.out.println("Connection counter : " + ccm.getCounter());
    }
}
