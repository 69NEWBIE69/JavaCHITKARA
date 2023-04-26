import java.util.Scanner;

class arr2d{

    int ar[][]=new int[3][3];
    Scanner sc=new Scanner(System.in);
    void add(){
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++)
            ar[i][j]=sc.nextInt();
        }
    }
    void display(){
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++)
                System.out.println(ar[i][j]);
        }
    }
    void sumrow(){
        int sum=0;
        for(int i=0;i<1;i++){
            for(int j=0;j<3;j++)
                sum=sum+ar[i][j];
        }
        System.out.println("sum of first row is"+sum);
    }
    void sumcolm(){
        int sum=0;
        for(int i=0;i<3;i++){
            for(int j=0;j<1;j++)
                sum=sum+ar[i][j];
        }
        System.out.println("sum of first colum is"+sum);
    }
    void sumdiag(){
        int sum=0;
        for(int i=0;i<3;i++){
            for(int j=0;j<1;j++)
                sum=sum+ar[i][i];
        }
        System.out.println("sum of diagonal is"+sum);
    }
    void sumrev(){
        int sum=0;
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++)
                sum=sum+ar[i][2-i];
        }
        System.out.println("sum of  reverse diagonal is"+sum);
    }
    void sumcube(){
        int sum=0;
        int x;
        for(int i=0;i<3;i++){
            for(int j=1;j<3;j++)
                sum=sum+(ar[i][j]*ar[i][j]*ar[i][j]);

        }
        System.out.println("sum of  reverse diagonal is"+sum);
    }
}


public class Array2D {
    public static void main(String[] args) {
        arr2d d=new arr2d();
        d.add();
        d.sumrow();
        d.sumcolm();
        d.sumdiag();
        d.sumrev();
        d.sumcube();
    }
}
