import java.math.BigInteger;
import java.util.Scanner;

class First {
    Scanner sc = new Scanner(System.in);
    int n1, n2;

    void input() {
        System.out.print("Enter the first number: ");
        n1 = sc.nextInt();
        System.out.print("Enter the second number: ");
        n2 = sc.nextInt();
    }
}

class Second extends First {
    int sum = 0;

//    boolean isPrime(int num) {
//        if (num <= 1) {
//            return false;
//        }
//        for (int i = 2; i <= Math.sqrt(num); i++) {
//            if (num % i == 0) {
//                return false;
//            }
//        }
//        return true;
//    }
//
//    void generateSum() {
//        for (int i = n1; i <= n2; i++) {
//            if (isPrime(i)) {
//                sum += i;
//            }
//        }
//    }
    void prime(int y){
        BigInteger x=new BigInteger(""+y);
        if(x.isProbablePrime(1)){
            sum+=y;
        }
    }
}

class Third extends Second {
    int evenCount = 0;

    void countEvenDigits() {
        int temp = sum;
        while (temp != 0) {
            int digit = temp % 10;
            if (digit % 2 == 0) {
                evenCount++;
            }
            temp /= 10;
        }
    }

    void display() {
        System.out.println("The sum of prime numbers between " + n1 + " and " + n2 + " is: " + sum);
        System.out.println("The number of even digits in the sum is: " + evenCount);
    }
}

public class Primerange {
    public static void main(String[] args) {
        Third t = new Third();
        t.input();
       // t.prime();
        t.countEvenDigits();
        t.display();
    }
}
