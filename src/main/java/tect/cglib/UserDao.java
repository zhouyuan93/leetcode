package tect.cglib;

/**
 * @author yuan.zhou
 */
public class UserDao {
    public void findAllUser() {
        System.out.println("UserDao 查找所有用户");
    }

    public String findUserNameById(long id) {
        System.out.println("UserDao 查找用户by id");
        return "用户" + id;
    }
}
