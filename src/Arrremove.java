import java.util.Scanner;

class Remove{
    int ar[]=new int[3];

    int a;
    Scanner sc=new Scanner(System.in);
    void add(){
        for(int i=0;i<3;i++){
            ar[i]=sc.nextInt();
        }
         a=sc.nextInt();//value to be removed
    }
    void rem(){
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
            if(ar[i]==a){
                ar[i]=ar[j];
            }
    }}
}
void display(){
        for(int j=0;j<3;j++){
            System.out.printf("[%d]",ar[j]);
        }
}
}
public class Arrremove {
    public static void main(String[] args) {
        Remove r=new Remove();
        r.add();
        r.rem();
        r.display();
    }
}
