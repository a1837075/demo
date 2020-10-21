package netL.itheima06;

import java.io.*;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;

/**
模拟用户登陆

 */
public class ClientTest {
    public static void main(String[] args) throws IOException {
        //创建客户端Socket对象
        //Socket s=new Socket(InetAddress.getByName("shinelon"),8888);
        Socket s=new Socket("shinelon",8888);

        //获取用户名和密码
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("请输入用户名");
        String username=br.readLine();
        System.out.println("请输入密码");
        String password=br.readLine();

        //获取输出流对象
        //BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(s.getOutputStream()));
        PrintWriter out=new PrintWriter(s.getOutputStream(),true);
        //写出对象
        out.println(username);
        out.println(password);

        //获取输入流对象
        BufferedReader serverBr=new BufferedReader(new InputStreamReader(s.getInputStream()));
        //获取服务器返回的数据
        String result=serverBr.readLine();
        System.out.println(result);
        //释放资源
        s.close();
        
    }
}
