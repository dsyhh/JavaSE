package com.dsy.tcp;
import java.net.ServerSocket;
public class MyServer
{
    public static void main(String[] args) throws Exception
    {
        ServerSocket serverSocket = new ServerSocket(9998);
        int SYN=0;
        int ACK=0;
        int seq=0;
        int ack=0;
        int serverSeq=0;
        while(true)
        {
            // 第一次握手
            SYN=serverSocket.accept().getInputStream().read();
            seq=serverSocket.accept().getInputStream().read();
            serverSocket.accept().shutdownInput();
            if(SYN!=1)continue;

            //第二次握手
            ack=seq+1;
            ACK=1;
            seq=serverSeq++;
            serverSocket.accept().getOutputStream().write(SYN);
            serverSocket.accept().getOutputStream().write(ACK);
            serverSocket.accept().getOutputStream().write(ack);
            serverSocket.accept().getOutputStream().write(seq);
            serverSocket.accept().shutdownOutput();

            //第三次握手
            ACK=serverSocket.accept().getInputStream().read();
            ack=serverSocket.accept().getInputStream().read();
            serverSocket.accept().shutdownInput();
            if(ACK!=1 || ack!=serverSeq)continue;

            System.out.println("成功建立连接!");
        }
    }
}
