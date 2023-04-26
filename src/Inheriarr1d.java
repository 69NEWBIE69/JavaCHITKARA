import java.util.Scanner;

class iinput{
    Scanner sc=new Scanner(System.in);
    int ar[]=new int[5];
    void add(){
        for(int i=0;i<5;i++){
            ar[i]=sc.nextInt();
        }
    }
}
class second extends iinput{
    int sum=0;
    void asum(){
        for(int i=0;i<5;i++){
            sum=sum+ar[i];
        }
    }
}
class third extends second{
    void display(){
            System.out.println(sum);
    }
}
public class Inheriarr1d {
    public static void main(String[] args) {
        third t=new third();
        t.add();
        t.asum();
        t.display();
    }
}
