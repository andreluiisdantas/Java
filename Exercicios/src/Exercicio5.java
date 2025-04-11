import java.util.Scanner;

public class Exercicio5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double base;
        double altura;
        double area;

        System.out.println("Digite a base do triângulo: ");
        base = scanner.nextDouble();

        System.out.println("Digite a altura do triângulo: ");
        altura = scanner.nextDouble();

        area = (base * altura)/2;

        System.out.printf("A área do triângulo é: %.1f", area);
    }
}
