import java.net.InetAddress;
import java.util.Scanner;

/**
 * @Author dsy
 * @Date 2023/7/5 14:20
 **/
public class User
{
    public static void main(String[] args)throws Exception
    {
        System.out.println("你好,用户 "+args[0]);
        new Thread(new Receiver(Integer.parseInt(args[1]))).start();

    }
}
