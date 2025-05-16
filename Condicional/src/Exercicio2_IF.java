import java.util.Scanner;

public class Exercicio2_IF {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um número: ");
        int num = scanner.nextInt();

        if (num % 2 == 0 && num % 5 == 0){
            System.out.println("FizzBuzz");
        } else if (num % 2 == 0) {
            System.out.println("Fizz");
        } else if (num % 5 == 0) {
            System.out.println("Buzz");
        }else {
            System.out.println("ERRO!");
        }
    }
}
