import java.util.Scanner;

//class cons{
//    cons(){
//        System.out.println("this is basic constructor");
//    }
//    int b=5;
//    cons(int b){
//        this.b=b;
//        System.out.println("this is parmeterised constructor "+b);
//    }
//}
class cons{
    String s="deevyam";
    int b=1234;
    Scanner sc=new Scanner(System.in);
    cons(){
        System.out.println("Enter the bank details Name , account number");
        String st=sc.next();
        int b=sc.nextInt();
    }
    cons(String s,int b){
        this.s=s;this.b=b;
        System.out.println("account name"+s);
        System.out.println("account number"+b);
    }

}
public class Const {
    public static void main(String[] args) {
        cons c=new cons("deevyam",1234);

    }
}
