import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese un número: ");
        int num = scanner.nextInt();
        long factorial = 1;

        for (int i = 2; i <= num; i++) {
            factorial *= i;
        }

        System.out.println("El factorial de " + num + " es: " + factorial);
    }
}
