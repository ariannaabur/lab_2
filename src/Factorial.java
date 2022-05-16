import java.util.Scanner;

public class Factorial {
    int factR (int n){
        int result;
        if (n == 1) {
            return 1;
        } else {
            result = factR(n-1)*n;
            return result;
        }
    }

    int factI(int n ){
        int result = 1;
        for (int i = 1;  i <= n; i++) {
            result = result * i;
        }
        return result;
    }

    public static void main (String[] arrgs){
        Factorial f = new Factorial();
        System.out.println("Вычисление рекурсивным методом");
        System.out.println("Факториал 3 равен" + f.factR(3));
        System.out.println("Факториал 4 равен" + f.factR(4));
        System.out.println("Факториал 5 равен" + f.factR(5));
        System.out.println("Вычисление интеративным методом");
        System.out.println("Факториал 3 равен" + f.factI(3));
        System.out.println("Факториал 4 равен" + f.factI(4));
        System.out.println("Факториал 5 равен" + f.factI(5));
    }
}
