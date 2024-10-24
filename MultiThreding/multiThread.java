public class multiThread {
    public static void main(String[] args) {
        
        
   
    new A(). start();
    new B(). start();
    new C(). start();

 }

    
}
class A extends Thread 
{
    public void run()
    {
        for (int i=50;i>=0;i--)
        System.out.println("i=" +i);
    }
}
class B extends Thread 
{
    public void run()
    {
        for (int j=50;j>=0;j--)
        System.out.println("j=" +j);
    }
}
class C extends Thread 
{
    public void run()
    {
        for (int k=50;k>=0;k--)
        System.out.println("k=" +k);
    }
}


