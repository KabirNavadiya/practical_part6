import java.util.*;
//EXTENDING THREAD CLASS
/*class kabir extends Thread{
    public void display()
    {
        System.out.println("Hello world");
    }
}*/
//USING RUNNABLE INTERFACE
class kabir implements Runnable{
    public  void run()
    {
        System.out.println("Hello world");
    }

}
public class part6_pr1 {
    public static void main(String[] args) {
        kabir k =new kabir();
        k.run();
        System.out.println("PREPARED BY 21CE080-KABIR NAVADIYA");
    }
}
