import java.util.Scanner;

public class While {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int contador = 0, acumulador = 0;

        while (contador < 5){
            contador++;
            System.out.print("Digite um número: ");
            acumulador += scanner.nextInt();
            scanner.nextLine();
            System.out.printf("Contador esta em %d e o acumulador esta em %d\n", contador, acumulador);
        }
    }
}
