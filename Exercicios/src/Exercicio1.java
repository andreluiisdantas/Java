import java.util.Scanner;

public class Exercicio1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double temperaturaFahrenheit;
        double temperaturaCelsius;

        System.out.println("Digite a temperatura em Graus Fahrenheit: ");
        temperaturaFahrenheit = scanner.nextDouble();

        temperaturaCelsius = (temperaturaFahrenheit - 32) / 1.8;

        System.out.printf("A temperatura convertida para graus celsius é: %.2f°Celsius", temperaturaCelsius);
    }
}
