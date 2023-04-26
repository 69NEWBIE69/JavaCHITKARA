import java.util.Scanner;

class alpha {
    char s[] = new char[10];
    Scanner sc = new Scanner(System.in);

    void add() {
        for (int i = 0; i <= 4; i++) {
            s[i] = sc.next().charAt(i);
        }
    }

    void sol() {

        int x = s.hashCode();
        System.out.println(x);

    }
}
public class Stringprac {
    public static void main(String[] args) {
        alpha a = new alpha();
        a.add();
        a.sol();
    }

}