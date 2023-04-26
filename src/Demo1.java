import java.util.Scanner;

class arr{
    char[] ar;
    Scanner sc=new Scanner(System.in);
    void getdata(){
        for(int i=0;i<5;i++){
            ar=sc.next().toCharArray();
        }
    }
}
class Demo1 extends arr {
   public void display(){
        for(int i=0;i<ar.length;i++){
            System.out.println(ar[i]);
        }
    }
    public static void main(String[] args) {
        Demo1 d=new Demo1();
        d.getdata();
        d.display();
    }
}
