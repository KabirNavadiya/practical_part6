import java.util.*;
public class part6_pr3 {
    public static void main(String[] args) throws Exception{
        Scanner sc=new Scanner(System.in);
        System.out.println("ENTER A NUMBER : ");
        int x=sc.nextInt();
        for(int i=0;i<5;i++)
        {
            Thread.sleep(1000);
            System.out.println(x++);
        }
        System.out.println("PREPARED BY 21CE080-KABIR NAVADIYA");

    }
}
