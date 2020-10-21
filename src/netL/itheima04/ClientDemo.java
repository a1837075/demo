package netL.itheima04;

import java.io.IOException;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;

/**
使用TCP协议发送数据
    创建发送端Scoket对象（创建连接）
    获取输出流对象
    发送数据
    释放资源

 Socket(InetAddress address,int port)
 Exception in thread "main" java.net.ConnectException: Connection refused: connect

 */
public class ClientDemo {
    public static void main(String[] args) throws IOException {
        //创建发送端Scoket对象（创建连接）
        Socket s=new Socket(InetAddress.getByName("shinelon"),10086);

        //获取输出流对象
        OutputStream os=s.getOutputStream();
        //发送数据
        String str="hello tcp,im comming!!!";
        os.write(str.getBytes());
        //释放资源
        //os.close();
        s.close();
    }
}
