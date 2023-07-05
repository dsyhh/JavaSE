import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.util.concurrent.Callable;

/**
 * @Author dsy
 * @Date 2023/7/5 14:21
 **/
public class Receiver implements Runnable
{
    private int port;
    DatagramSocket receiver;
    String fromName;
    public Receiver(int port)throws Exception
    {
        this.port = port;
        receiver=new DatagramSocket(port);
        fromName=null;
    }

    @Override
    public void run()
    {
        while(true)
        {
            DatagramPacket packet=new DatagramPacket(new byte[1024],0,1023);
            try
            {
                receiver.receive(packet);
            } catch (IOException e)
            {
                throw new RuntimeException(e);
            }
            System.out.println(new String(packet.getData()));
        }
    }
}
