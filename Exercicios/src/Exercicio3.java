import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        float altura;
        float peso;
        float IMC;

        System.out.println("Digite seu peso: ");
        peso = scanner.nextFloat();

        System.out.println("Digite sua altura: ");
        altura = scanner.nextFloat();

        IMC = peso / (altura * altura);

        System.out.printf("Seu IMC é: %.2f", IMC);
    }
}
