import java.util.Scanner;

class Line{
    int arr[]=new int [5];
    Scanner sc=new Scanner(System.in);
    void add(){
        for(int i=0;i<5;i++){
         arr[i]=sc.nextInt();
        }
    }
    boolean search(){
        System.out.println("Enter number to be searched");
        int x=sc.nextInt();
        int flag=0;
        for(int i=0;i<5;i++){
        if(arr[i]==x){
            return true;
        }
    }
    return false;}
}
public class Linear {
    public static void main(String[] args) {
        Line l=new Line();
        l.add();
        boolean num =l.search();
        System.out.println(num);
    }
}
