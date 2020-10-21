package netL.itheima06;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.List;

/**
 * @author dawnStamp
 * @date 2020/9/28 16:41
 */
public class ServerTest {
    public static void main(String[] args) throws IOException {
        //创建服务器端Socket对象
        ServerSocket ss=new ServerSocket(8888);
        //监听
        Socket s=ss.accept();
        //获取输入流对象
        BufferedReader br=new BufferedReader(new InputStreamReader(s.getInputStream()));
        //获取用户名和密码
        String username=br.readLine();
        String password=br.readLine();
        //判断用户名和密码是否正确
        boolean flag=false;
        /*if ("shinelon".equals(username) && "123456".equals(password)){
            flag=true;
        }*/
        List<User> users=UserDB.getUsers();
        User user=new User(username,password);
        if (users.contains(user)){
            //匹配成功
            flag=true;
        }

        //获取输出流对象
        PrintWriter out=new PrintWriter(s.getOutputStream(),true);

        //返回判断信息
        if (flag){
            out.println("登陆成功");
        }else {
            out.println("登陆失败");
        }
        //是否资源
        s.close();
        //ss.close();//服务器一般不关闭
    }
}
