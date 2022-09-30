import java.util.*;
class FIRST extends Thread implements Runnable{
    public void run(){
        System.out.println("NAVADIYA  "+ "(priority) : "+ Thread.currentThread().getPriority());
    }
}
class SECOND extends Thread implements Runnable{
    public void run(){
        System.out.println("KABIR  "+"(priority) : "+Thread.currentThread().getPriority());
    }

}
class THIRD extends Thread implements Runnable{
    public void run(){
        System.out.println("NAVINKUMAR  "+"(priority) : "+ Thread.currentThread().getPriority());
    }

}
public class part6_pr4 {
    public static void main(String[] args) {

        FIRST ob1=new FIRST();
        Thread.currentThread().setPriority(3);
        ob1.run();

        SECOND ob2=new SECOND();
        // ob2.setPriority(Thread.NORM_PRIORITY);
        Thread.currentThread().setPriority(Thread.NORM_PRIORITY);  // it takes the default priority as 5.
        ob2.run();

        THIRD ob3=new THIRD();
        Thread.currentThread().setPriority(7);
        ob3.run();

        System.out.println("PREPARED BY 21CE080-KABIR NAVADIYA");
    }
}
