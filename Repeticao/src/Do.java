import java.util.Scanner;

public class Do {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String valor = "";

        //Primeira iteração são sempre executadas
        do{
            System.out.printf("Digite algo: ");
            valor = scanner.nextLine();
        }while (!valor.equalsIgnoreCase("algo"));
        //Demais operações do laço só são executadas se a condição for verdadeira
        scanner.close();
    }
}


