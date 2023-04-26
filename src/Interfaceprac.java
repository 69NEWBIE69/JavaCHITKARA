interface MyInterface
{
    public void fun1();
    public void fun2();
}

interface MyInterface2
{
    public void fun3();
    public void fun4();
}

interface MyInterface3 extends MyInterface
{
    public void fun5();
    public void fun6();
}

class Test1 implements MyInterface3
{

    public void fun1()
    {
        System.out.println("im fun1");
    }
    public void fun2()
    {
        System.out.println("im fun2");
    }


    public void fun5() {
        System.out.println("im fun5");
    }
    public void fun6(){
        System.out.println("im fun6");
    }
}

public class Interfaceprac {
    public static void main(String[] args) {
        Test1 t=new Test1();
        t.fun1();
        t.fun2();
        t.fun5();
        t.fun6();
    }
}
