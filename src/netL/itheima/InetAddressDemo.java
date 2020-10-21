package netL.itheima;

import java.net.InetAddress;
import java.net.UnknownHostException;

/**
InetAddress:此类表示互联网协议（IP）地址
 */
public class InetAddressDemo {
    public static void main(String[] args) throws UnknownHostException {
        //static InetAddress getByName(String host)
        //InetAddress address=InetAddress.getByName("shinelon");
        InetAddress address=InetAddress.getByName("127.0.0.1");

        //System.out.println(address);

        String hostAddress=address.getHostAddress();//返回IP地址
        String hostName=address.getHostName();//返回主机名

        System.out.println(hostAddress);
        System.out.println(hostName);
    }
}
