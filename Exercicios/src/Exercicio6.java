import java.util.Scanner;

public class Exercicio6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a;
        int b;
        int c;
        int delta;

        System.out.println("Digite o valor de (A)");
        a = scanner.nextInt();

        System.out.println("Digite o valor de (B)");
        b = scanner.nextInt();

        System.out.println("Digite o valor de (C)");
        c = scanner.nextInt();

        delta = b*b-4*a*c;

        scanner.close();

        System.out.printf("O valor de Delta é: %d", delta);
    }
}

