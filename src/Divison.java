import java.util.Scanner;

class students{
    Scanner sc=new Scanner(System.in);
    int m=sc.nextInt();
    int p=sc.nextInt();
    int b=sc.nextInt();
    int c=sc.nextInt();
    int cm=sc.nextInt();
    void result(){
        int result;
        result=((m+p+b+c+cm)/500)*100;
        if(result>90){
            System.out.println("divisoin A "+result);
        }
       else if(result>80){
            System.out.println("divisoin B "+result);
        }
         else if(result>60){
            System.out.println("divisoin C "+result);
        }
       else {
            System.out.println("divisoin D "+result);
        }
    }
}
public class Divison {
    public static void main(String[] args) {
        System.out.println("enter marks of students");
        students st=new students();
        st.result();
    }
}
