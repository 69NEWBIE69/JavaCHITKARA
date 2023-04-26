import java.util.Scanner;

class Even{
    int a;
    int ans=0;
    void getdata(){
        System.out.println("Enter number ");
        Scanner sc=new Scanner(System.in);
        a= sc.nextInt();
    }
    void fun(){
   for (int i=0;i<a;i++){
            if(i%2==0){
                ans=ans+a;
            }
            a--;
        }
    }
    void display(){
        System.out.println("the sum of even numbers is "+a);
    }
}

public class Evenfunc {
    public static void main(String[] args) {


        Even en = new Even();
        en.getdata();
        en.fun();
        en.display();
    }
}