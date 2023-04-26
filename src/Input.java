import java.util.Scanner;

class Demo{
    int b;int x,y,z;
    void getdata(int n) {
        Scanner sc = new Scanner(System.in);
        while((b=sc.nextInt())!=0){
        if(b>0){
            x++;
        } else if (b<0) {
            y++;
        }
        else{
            z++;
        }
        }
    }
    void Display(){
        System.out.println("Positive "+x);
        System.out.println("Negetive "+y);
        System.out.println("zeros "+z);
    }
    }

public class Input {
    public static void main(String[] args) {
        System.out.println("To  add value press 1");
        Scanner sc=new Scanner(System.in);
        int a;
        a=sc.nextInt();
        Demo d=new Demo();
        d.getdata(a);
        d.Display();
    }
}
