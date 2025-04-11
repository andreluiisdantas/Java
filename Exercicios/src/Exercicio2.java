import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double temperaturaFahrenheit;
        double temperaturaCelsius;

        System.out.println("Digite a temperatura em Graus Celsius: ");
        temperaturaCelsius = scanner.nextDouble();

        temperaturaFahrenheit = (temperaturaCelsius * (9/5)) + 32;

        System.out.printf("A temperatura convertida para graus celsius é: %.2f°Fahrenheit", temperaturaFahrenheit);
    }
}
