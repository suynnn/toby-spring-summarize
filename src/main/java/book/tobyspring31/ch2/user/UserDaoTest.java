package book.tobyspring31.ch2.user;

import book.tobyspring31.ch1.user.dao.UserDao;
import book.tobyspring31.ch1.user.domain.User;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

import java.sql.SQLException;

public class UserDaoTest {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {

        ApplicationContext context = new GenericXmlApplicationContext("applicationContext.xml");
        UserDao userDao = context.getBean("userDao", UserDao.class);

        User user = userDao.get("whiteship");

        if (!user.getName().equals("백기선")) {
            System.out.println("테스트 실패 (name)");
        } else if (!user.getPassword().equals("married")) {
            System.out.println("테스트 실패 (password)");
        } else  {
            System.out.println("조회 테스트 성공");
        }
    }
}
