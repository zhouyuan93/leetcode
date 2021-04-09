package tect.cglib;

import net.sf.cglib.proxy.Enhancer;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LogInterceptorTest {

    @Test
    void test_cglib() {
        Enhancer enhancer = new Enhancer();
        enhancer.setSuperclass(UserDao.class);
        enhancer.setCallback(new LogInterceptor());
        UserDao userDao = (UserDao) enhancer.create();
        userDao.findAllUser();
        userDao.findUserNameById(123);
    }
}