import java.util.Scanner;

class Patt{
    Scanner sc=new Scanner(System.in);
    int a= sc.nextInt();
    void fun2(){
        for(int i=0;i<10;i++){
            for(int j=0;j<10;j++){
                System.out.printf("%d",a);
                a=a-(i-j)*a;
            }
            System.out.printf("\n");
        }
    }
}

public class Pattern {
    public static void main(String[] args) {
        Patt pt=new Patt();
        pt.fun2();
    }
}
