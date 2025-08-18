import java.util.Scanner;

public class TryCatch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um número: ");
        String numeroEmTexto = scanner.nextLine();
        try{
            int numeroEmInt = Integer.parseInt(numeroEmTexto);
            System.out.println("O número que você digitou foi " +numeroEmInt);
        }catch (NumberFormatException error){ // Sempre melhor que os catch sejam especificos
            System.out.println("É necessário digitar um número");
        }finally {
            System.out.println("O finnaly é sempre executado");
        }
    }
}
