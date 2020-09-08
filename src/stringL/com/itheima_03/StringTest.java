package stringL.com.itheima_03;

import java.util.Scanner;

/**
模拟登陆，给三次机会，并提示还有几次

 分析：
 A:定义两个字符串对象，用于储存已经存在的用户名和密码
 B:键盘录入用户名和密码
 C:拿键盘录入的用户名和密码和已经存在的用户名和密码进行比较
    如果内容相同，提示登陆成功，
    如果内容不同，提示登陆失败，并提示还有几次机会

 */
public class StringTest {
    public static void main(String[] args) {
        String username="admin";
        String password="admin";

        for (int x=0;x<3;x++){
            Scanner sc=new Scanner(System.in);
            System.out.println("请输入用户名");
            String name=sc.nextLine();
            System.out.println("请输入密码");
            String pwd=sc.nextLine();

            if (username.equals(name)&&password.equals(pwd)){
                System.out.println("登陆成功");
                break;
            }else {
                if((2-x)==0){
                    System.out.println("用户名和密码被锁定，请与管理员联系");
                }else {
                    System.out.println("登陆失败,你还有"+(2-x)+"次机会");
                }

            }
        }

    }
}
