class A{
    public synchronized void display(String name){
        for (int i=0;i<2;i++){
            System.out.print("HELLO EVERYONE");
            try{
                Thread.sleep(1000);
            }catch (Exception e){}

            System.out.println(name);
        }
    }
}
class B extends Thread{
    A obj= new A();
    String name;
    B(A obj,String name){
        this.obj=obj;
        this.name=(name);
    }
    public void run(){
        obj.display(name);
    }
}
public class part6_pr5 {
    public static void main(String[] args) {
        A a=new A();
        B b=new B(a," I AM KABIR ");
        B c=new B(a," I AM KABIR FROM CE1");
        b.start();
        c.start();
        System.out.println(" PREPARED BY 21CE080-KABIR NAVADIYA");

    }
}
