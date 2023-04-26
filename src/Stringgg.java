import java.util.Scanner;

class strin{
    Scanner sc=new Scanner(System.in);
    String st=sc.next();
    void fun() throws InterruptedException {
        for(int i=0;i<st.length();i++){
            Thread.sleep(500) ;
            System.out.println(st.charAt(i));
        }
    }}
public class Stringgg {
    public static void main(String[] args) throws InterruptedException {
    strin st=new strin();
        st.fun();
    }
}
