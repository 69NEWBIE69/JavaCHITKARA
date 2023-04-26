import java.util.Scanner;

class Buzz{
    Scanner sc=new Scanner(System.in);
    int a=sc.nextInt();
    void fun(){
        while(a!=0){
            if(a%10==7&&a%7==0){
                System.out.println(a);
            }
            a--;
        }
    }
    void fun2(){
        for(int i=1;i<a;i++){
            if(i%10==7&&i%7==0){
                System.out.println(i);
            }
        }
    }
}
public class BuzzNumber {
    public static void main(String[] args) {
    Buzz b=new Buzz();
    b.fun2();
}}
