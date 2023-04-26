//import java.util.Scanner;
//
//class fact2{
//    void fact(int n){
//        long ans=1;
//        while(n!=1){
//            ans=ans*n;
//            n--;
//        }
//        System.out.println("the factorialis "+ ans);
//    }
//}
//public class Fact {
//    public static void main(String[] args) {
//        System.out.println("enter number for factorial");
//        Scanner sc=new Scanner(System.in);
//        int x=sc.nextInt();
//        fact2 fa=new fact2();
//        fa.fact(x);
//    }
//}
public class Fact
{
    int result[] = new int[4000];
    public int factorial(int num)
    {
        result[0] = 1;
        int resultSize = 1;

        for (int f = 2; f <= num; f++)
        {
            resultSize = multiply(f, result, resultSize);
        }

        return resultSize;
    }


    static int multiply(int y, int result[], int resultSize)
    {
        int c = 0;
        for (int j = 0; j < resultSize; j++)
        {
            int product = result[j] * y + c;
            result[j] = product % 10;
            c = product / 10;
        }
        while (c != 0)
        {
            result[resultSize] = c % 10;
            c = c / 10;
            resultSize = resultSize + 1;
        }
        return resultSize;
    }
    public static void main(String argvs[])
    {
        int num = 500;
        Fact obj = new Fact();
        int resSize = obj.factorial(num);
        System.out.println("The factorial of the number " + num + " is: ");
        for(int j = resSize - 1; j >= 0; j--)
        {
            System.out.print(obj.result[j]);
        }
    }
}