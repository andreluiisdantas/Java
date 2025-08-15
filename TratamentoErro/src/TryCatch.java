import java.util.Scanner;

public class TryCatch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            int numero = scanner.nextInt();
            System.out.println(numero);
        }catch (Exception e){
            System.out.println("Digite apenas números: ");
        }



    }
}
