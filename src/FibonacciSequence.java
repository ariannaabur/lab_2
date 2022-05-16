import java.util.Scanner;

public class FibonacciSequence {
    public static int f(int n) {
        if (n==0) {
            return 0;
        } else if (n==1) {
            return 1;}
        else {
            return f(n-2)+f(n-1);
        }
    }

    public static void main (String[] args) {
        System.out.println("Число Фибоначчи с индексом 3 равно " + f(3));
        System.out.println("Число Фибоначчи с индексом 8 равно " + f(8));
        System.out.println("Число Фибоначчи с индексом 20 равно " + f(20));
    }
}
