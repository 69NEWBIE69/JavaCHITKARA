import java.util.Scanner;

class Sort{
    int ar[]=new int[10];
    int x=ar.length;
     void add(){
         Scanner sc=new Scanner(System.in);
         for(int i=0;i<x;i++){
             ar[i]= sc.nextInt();
         }
         if(x%2==0){
             funcc();
         }
         else if(x==0 || x%2!=0){
             System.out.println("Invalid");
         }
     }
     void funcc(){
         int y=x/2;
         for(int i=0;i<y-1;i++){
             for(int j=i+1;j<y;j++){
                 int temp=ar[i];
                 ar[j]=temp;
             }
         }
         for(int i=y;i<x;i++){
             for(int j=i+1;j<y;j++){
                 int temp=ar[i];
                 ar[j]=temp;
             }
     }
     }
    void display2(){
        System.out.println("the Sorted array is");
        for (int j=0;j<x;j++)
        {
            System.out.println(ar[j]);
        }
    }
}
public class ArraySort {
    public static void main(String[] args) {
        Sort s=new Sort();
        s.add();
        s.display2();
    }
}
