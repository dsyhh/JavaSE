package base;

/**

 * @Date 2023/7/3 15:39
 **/
public class Demo05 {
    public static void main(String[] args) {
        int i=128;
        byte b=(byte)i;//over range
        double b2=i;//auto trans
        System.out.println(b);
        System.out.println(b2);
    }
}
