package netL.itheima03;

import java.io.IOException;
import java.net.*;

/**
UDP协议收发数据的注意事项
    端口号错误，数据可以正常发出，不会出现异常，但是收不到数据


 */
public class SendDemo {
    public static void main(String[] args) throws IOException {
        //创建发送端Socket对象
        DatagramSocket ds=new DatagramSocket();
        //创建包对象
        byte[] bys="hello udp,im comming again!!!".getBytes();
        DatagramPacket dp=new DatagramPacket(bys,bys.length, InetAddress.getByName("shinelon"),9999);
        //发送数据
        ds.send(dp);
        //释放资源
        ds.close();
    }
}
