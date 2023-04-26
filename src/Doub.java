import java.util.Scanner;

class Area{
    double r;
    int l,b;
    public double areaofcircle(double r){
        return 3.14*r*r;
    }
    public double areaofcircle(double r,double h){
        return 3.14*r*r*h;
    }
    public int areaofrect(int l,int b){
        return l*b;
    }
}
public class Doub {
    public static void main(String[] args) {
        Area a = new Area();
        Scanner obj = new Scanner(System.in);
        int n = obj.nextInt();
        int ans = a.areaofrect(n,n);
        System.out.println(ans);

        double d = obj.nextDouble();
        double ans1 = a.areaofcircle(d,d);
        System.out.println(ans1);
    }
}
