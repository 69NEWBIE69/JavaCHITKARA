import java.util.Scanner;

class square{
    Scanner sc=new Scanner(System.in);
    int a= sc.nextInt();
    int m;
    int sum=0;
    void sum(){
        while(a!=0){
            m=a*a;
            sum=sum+m;
            a--;
        }
        System.out.println("Sum of squre is "+sum);
    }
}
public class SquareSum {
    public static void main(String[] args) {
        System.out.println("Enter number ");
        square sq=new square();
        sq.sum();
    }
}
