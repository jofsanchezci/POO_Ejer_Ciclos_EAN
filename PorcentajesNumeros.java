import java.util.Scanner;

public class PorcentajesNumeros {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el tamaño del arreglo: ");
        int n = scanner.nextInt();
        int[] numeros = new int[n];

        System.out.println("Ingrese " + n + " números: ");
        for (int i = 0; i < n; i++) {
            numeros[i] = scanner.nextInt();
        }

        int positivos = 0, negativos = 0, ceros = 0;

        for (int num : numeros) {
            if (num > 0) {
                positivos++;
            } else if (num < 0) {
                negativos++;
            } else {
                ceros++;
            }
        }

        double porcentajePositivos = (positivos * 100.0) / n;
        double porcentajeNegativos = (negativos * 100.0) / n;
        double porcentajeCeros = (ceros * 100.0) / n;

        System.out.println("Porcentaje de números positivos: " + porcentajePositivos + "%");
        System.out.println("Porcentaje de números negativos: " + porcentajeNegativos + "%");
        System.out.println("Porcentaje de ceros: " + porcentajeCeros + "%");
    }
}
