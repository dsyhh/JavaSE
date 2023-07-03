package base;

/**
 * @Author wwg
 * @Description TODO
 * @Date 2023/7/3 15:57
 **/
public class Demo08 {

    static double salary;//class's volume: belong to class
    int age;//real sample's volume:belong to object
    String name;
    //main method
    public static void main(String[] args) {
        //partial volumes: must announce and initialize
        int i=12;
        System.out.println(i);
        Demo08 demo=new Demo08();
        System.out.println(demo.age);
    }
    //other methods
    public void add(){

    }
}
