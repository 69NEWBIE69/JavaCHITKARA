//import java.util.Scanner;
//
//class pow{
//    Scanner sc=new Scanner(System.in);
//    int a= sc.nextInt();
//    int b= sc.nextInt();
//    void pp(){
//        int exp=1;
//        for(int i=0;i<b;i++){
//            exp=exp*a;
//        }
//        System.out.println("the expontial form is "+exp);
//
//    }
//}
//public class Power {
//    public static void main(String[] args) {
//        System.out.println("Enter A and B");
//        pow p=new pow();
//        p.pp();
//    }
//}
import java.util.Scanner;

class pow{
    int a,b;
    int exp=1;
    void getdata(){
        System.out.println("Enter A and B");
        Scanner sc=new Scanner(System.in);
        a= sc.nextInt();
        b= sc.nextInt();
    }
    void pp(){
        for(int i=0;i<b;i++){
            exp=exp*a;
        }}
       void display(){
           System.out.println("number"+exp);
    }
}
    public class Power {
        public static void main(String[] args) {
            pow p=new pow();
            p.getdata();
            p.pp();
            p.display();
        }
    }
