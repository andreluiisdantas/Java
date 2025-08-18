import java.util.InputMismatchException;
import java.util.Scanner;

public class Exemplo1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numero;

        while (true){
            try {
                System.out.println("Digite um número: ");
                numero = Integer.parseInt(scanner.nextLine());
                if (numero < 20){
                    System.out.println("O número que você digitou é menor que 20");
                    continue;
                }
                break;
            }catch (NumberFormatException error){
                System.out.println("Formato incorreto, digite apenas números");
            }
        }

        System.out.println("O número que você digitou é " + numero);
    }
}
