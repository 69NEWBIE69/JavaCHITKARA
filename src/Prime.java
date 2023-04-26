import java.util.Scanner;

class prim{
Scanner sc=new Scanner(System.in);
int a= sc.nextInt();
int b= sc.nextInt();
int i;
void default1(){
    for( i=a;i<=b;i++){
for(i=2;i<=a/2;++i) {
        if (a % i == 0);
        {
            System.out.println(a);
        }
    }
}}}

public class Prime{
    public static void main(String[] args) {
        System.out.println("Enter range ");
        prim p=new prim();
        p.default1();
    }
}
