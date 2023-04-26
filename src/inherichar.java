import java.util.Scanner;

class iiinput{
    Scanner sc=new Scanner(System.in);
    String str=sc.nextLine();
    char[]ar=str.toCharArray();
    char[] arr=new char[10];}
class secondc extends iiinput{
    int j=0;
    void wow(){
        for(int i=0;i<str.length();i++){
            if(ar[i]=='a'||ar[i]=='e'||ar[i]=='i'||ar[i]=='o'||ar[i]=='u'||ar[i]=='A'||ar[i]=='E'||ar[i]=='I'||ar[i]=='O'||ar[i]=='U'){
                continue;
            }
            else{
                  arr[j] = ar[i];
                  j++;
            }
        }
    }
}
class thirdc extends secondc{
    void display(){
        for(int j=0;j<str.length();j++) {
        System.out.println(arr[j]);
    }}
}
public class inherichar {
    public static void main(String[] args) {
        thirdc t=new thirdc();

        t.wow();
        t.display();
    }
}
