import java.net.DatagramSocket;
import java.util.Scanner;

/**
 * @Author dsy
 * @Date 2023/7/5 14:20
 **/
public class UserClient
{
    final static int centralPort=7499;
    final static int firstReachablePort=7500;
    final static int lastReachablePort=8888;
    public static void main(String[] args) throws Exception
    {
        Scanner SysIn=new Scanner(System.in);
        DatagramSocket server=new DatagramSocket(centralPort);
        int reachablePort=firstReachablePort;
        while(reachablePort<=lastReachablePort)
        {
            System.out.println("请输入用户名");
            String opt1=null;
            if(SysIn.hasNext())
            {
                opt1 = SysIn.next();
                if ("exit".equals(opt1)) break;
                Runtime.getRuntime().exec(new String[]{"cmd", "/k", "start", "java", "User", opt1});
            }
        }
        SysIn.close();

    }
}