import java.util.Scanner;

 class input{

    Scanner sc= new Scanner(System.in);
    int a=sc.nextInt();
    int b=sc.nextInt();
    int c=sc.nextInt();
    void dif(){
        if(a>b&&a>c){
            System.out.println("a is gretest");
        }
        else if(b>c&&b>a){
            System.out.println("b is gretest");
        }
        else{
            System.out.println("c is gretest");
        }
    }
}

public class Hello {
    public static void main(String[] args) {
        System.out.println("enter number");
        input in=new input();
        in.dif();
    }
}
