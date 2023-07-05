package com.dsy.lesson02;
import java.net.ServerSocket;
public class TCPServerDemo01
{
    public static void main(String[] args) throws Exception
    {//这是服务器端的main方法
        System.out.println(//把接收到的数据(此处是一个Byte类型的数字9)打印在屏幕上
        //以下是如何从客户端接收数据
        new ServerSocket(9998)//建立服务器端套接字 监听端口号9998
        .accept()//等待客户端连接 一旦连接成功，accept方法就会返回一个套接字对象
        .getInputStream()//accept方法返回的是一个
                //输入流 连接至 客户端的 输出流 的 套接字对象
        //因此我们获取输入流就可以读取到客户端写入输出流的数据
        .read());//读取输入流中的数据
    }
}
