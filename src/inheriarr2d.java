import java.util.Scanner;

class iinput2d{
    Scanner sc=new Scanner(System.in);
    int ar[][]=new int[3][3];
    void add(){
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
            ar[i][j]=sc.nextInt();
        }
    }
}}
class second2d extends iinput2d{
    int sum=0,sum2=0;
    void asum(){
        for(int i=0;i<1;i++){
            for(int j=0;j<3;j++){
                sum=sum+ar[i][j];
            }}
            for(int i=0;i<3;i++){
                for(int j=0;j<1;j++){
                    sum2=sum2+ar[i][j];
                }
    }
}}
class third2d extends second2d{
    void display(){
        System.out.println(" sum of rows "+sum);
        System.out.println(" sum of columns "+sum2);
    }
}
public class inheriarr2d {
    public static void main(String[] args) {
        third2d t=new third2d();
        t.add();
        t.asum();
        t.display();
    }
}
