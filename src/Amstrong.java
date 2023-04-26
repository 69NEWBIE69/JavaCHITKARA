import java.util.Scanner;

class arm{
    Scanner sc=new Scanner(System.in);
    int a= sc.nextInt();
    int b=a;
    void ams(){
        int m,n,ans=0;
        while(a!=0){
         m=a%10;
         n=m*m*m;
         ans=ans+n;
         a/=10;
        }
        if(b==ans){
            System.out.println("Number is Armstrong");
        }
        else{
            System.out.println("Number is not Armstrong");
        }
    }
}
public class Amstrong {
    public static void main(String[] args) {
        System.out.println("Enter armstong number ");
        arm a=new arm();
        a.ams();
    }
}
