package netL.itheima06;

import java.util.ArrayList;
import java.util.List;

/**
 * @author dawnStamp
 * @date 2020/9/28 16:58
 */
public class UserDB {
    private static List<User> users=new ArrayList<User>();

    static {
        users.add(new User("zhangsan","123456"));
        users.add(new User("lisi","654321"));
        users.add(new User("shinelon","shinelon"));
        users.add(new User("admin","admin"));
    }

    public static List<User> getUsers(){
        return users;
    }

   
}
