package com.dsy.lesson02;
import java.net.Socket;
public class TCPClientDemo01
{
    public static void main (String[] args) throws Exception
    {//这是客户端的main方法
        new Socket("localhost"//建立客户端套接字 尝试连接服务器
                //此处是在同一台电脑上的两个程序之间通信 因此主机名为localhost(代表"本机")
                , 9998)//设端口号为9998 必须与服务器端监听的端口号一致
                .getOutputStream()//获取输出流
                .write(9);//向输出流中写入数据 此处是一个Byte类型的数字9
    }
}
