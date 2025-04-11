import java.util.Scanner;

public class Exercicio4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double numero;
        double quadrado;
        double cubo;

        System.out.println("Digite um número: ");
        numero = scanner.nextDouble();

        quadrado = Math.pow(numero,2);
        cubo = Math.pow(numero, 3);

        System.out.printf("%.0f ao quadrado é %.0f\n", numero, quadrado);
        System.out.printf("%.0f ao cubo é %.0f", numero, cubo);
    }
}
