class Base
{
    Base()
    {
        System.out.println("default cons. of base");
    }
    Base(int a)
    {
        System.out.println("parameterized cons. of base");
    }
}
class derived extends Base
{
    Base b=new Base(4);
    derived(int x)
    {
        System.out.println("parameterized cons. of dirived");
    }
}
public class Inheritance1 {
    public static void main(String[] args) {
        derived d1=new derived(4);
    }
}
