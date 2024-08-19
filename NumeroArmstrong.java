import java.util.Scanner;

public class NumeroArmstrong {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese un número: ");
        int num = scanner.nextInt();
        int temp = num, suma = 0, digitos = 0;

        // Calcular el número de dígitos
        while (temp != 0) {
            digitos++;
            temp /= 10;
        }

        temp = num;
        // Sumar las potencias de los dígitos
        while (temp != 0) {
            int digito = temp % 10;
            suma += Math.pow(digito, digitos);
            temp /= 10;
        }

        if (suma == num) {
            System.out.println(num + " es un número de Armstrong.");
        } else {
            System.out.println(num + " no es un número de Armstrong.");
        }
    }
}
