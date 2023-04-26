import java.util.Scanner;

class digit{
    Scanner sc=new Scanner(System.in);
    int a= sc.nextInt();
    int b= sc.nextInt();
    int sum=0;
    int sum1=1;
    void digits(){
        while(b!=0){
            sum=sum+b;
            b--;
        }
        System.out.println("the sum is"+sum);
    }
    void digitm(){
        while(a!=0){
            sum1=sum1*a;
            a--;
        }
        System.out.println("the multiplication is "+sum1);
    }
}
public class DigitSum
{
    public static void main(String[] args) {
        System.out.println("Enter number");
        digit d=new digit();
        d.digits();
        d.digitm();

    }
}
