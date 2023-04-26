

// Multithreading by implements the Runnable interface.
/*
	new Thread();
	new Thread(Object)
	new Thread(this)
	new Thread(this,name);
*/
class first implements Runnable
{
    public void run()
    {
        for(int i=1;i<=10;i++)
        {
            System.out.println("i = "+i);
        }
        System.out.println("Exit from first.");
    }
}
class secondd implements Runnable
{
    public void run()
    {
        for(int j=1;j<=10;j++)
        {
            System.out.println("j = "+j);
        }
        System.out.println("Exit from second.");
    }
}
class thirdd implements Runnable
{
    public void run()
    {
        for(int k=1;k<=10;k++)
        {
            System.out.println("k = "+k);
        }
        System.out.println("Exit from third");
    }
}
public class ThreadingRunable {
    public static void main(String args[])
    {
        first f = new first();
        secondd s  = new secondd();
        thirdd t = new thirdd();

        Thread t1 = new Thread(f);
        Thread t2 = new Thread(s);
        Thread t3 = new Thread(t);
        t1.start();
        t2.start();
        t3.start();

        System.out.println("Hello Java");
    }
}

