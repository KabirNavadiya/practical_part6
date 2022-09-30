import java.sql.SQLOutput;
import java.util.*;
class RandomArray{
    static Random Ra= new Random();
    static int k[] = new int[15];
    static {
        for (int i=0;i<15;i++){
            k[i]= Ra.nextInt(100);
        }
    }

}
class C1 extends RandomArray implements Runnable{
    public void run(){
        for(int i=0;i<15;i++)
        {
            if(i%2!=0){
                System.out.println("k["+i+"]"+"="+k[i] );
            }
        }
    }

}
class C2 extends RandomArray implements Runnable{
    public void run(){
        for(int i=0;i<15;i++)
        {
            if(i%2==0){
                System.out.println("k["+i+"]"+"="+k[i] );
            }
        }
    }

}
public class part6_pr2 {
    public static void main(String[] args) {
        C1 obj1=new C1();
        C2 obj2 =new C2();
        System.out.println("ODD INDEX NUMBERS : ");
        obj1.run();
        System.out.println("EVEN INDEX NUMBERS : ");
        obj2.run();
        System.out.println("PREPARED BY 21CE080-KABIR NAVADIYA");

    }
}
