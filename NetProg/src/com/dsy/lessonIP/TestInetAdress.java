package com.dsy.lessonIP;

import java.net.InetAddress;
import java.net.UnknownHostException;

/**
 * @Author dsy
 * @Date 2023/7/5 09:34
 **/
public class TestInetAdress
{
    public static void main(String[] args) throws UnknownHostException
    {
        InetAddress inetAddress1 = InetAddress.getByName("127.0.0.1");
        InetAddress inetAddress2 = InetAddress.getByName("www.baidu.com");
        InetAddress inetAddress4 = InetAddress.getByName("localhost");
        InetAddress inetAddress5 = InetAddress.getLocalHost();
        System.out.println(inetAddress1);
        System.out.println(inetAddress2);
        System.out.println(inetAddress4);
        System.out.println(inetAddress5);
    }
}
