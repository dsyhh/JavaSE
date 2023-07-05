package com.dsy.tcp;
import java.net.Socket;
public class MyClient
{
    public static void main(String[] args) throws Exception
    {
        byte SYN=0;
        byte ACK=0;
        byte seq=0;
        byte ack=0;
        byte clientSeq=0;
        Socket socket = new Socket("localhost",9998);
        // 第一次握手
        SYN=1;
        seq=clientSeq++;
        socket.getOutputStream().write(new byte[]{SYN,seq});
        socket.shutdownOutput();

        //第二次握手
        SYN=(byte)socket.getInputStream().read();
        ACK=(byte)socket.getInputStream().read();
        ack=(byte)socket.getInputStream().read();
        seq=(byte)socket.getInputStream().read();
        socket.shutdownInput();
        if(SYN!=1||ACK!=1||ack!=clientSeq)return;

        //第三次握手
        ack= (byte) (seq+1);
        socket.getOutputStream().write(ACK);
        socket.getOutputStream().write(ack);
        socket.shutdownOutput();

    }
}
