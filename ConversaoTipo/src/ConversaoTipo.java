import java.util.Scanner;

public class ConversaoTipo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String numeroEmTexto = scanner.nextLine();

        //Convertendo String para int
        int numeroEmInt = Integer.parseInt(numeroEmTexto);
        System.out.println(numeroEmInt + 18);

        //Convertendo String para Double
        Double numeroEmDouble = Double.parseDouble(numeroEmTexto);
        System.out.println(numeroEmDouble + 18);

        //Convertendo int para String
        int numero = 18;
        String numeroEmString = Integer.toString(numero);
        System.out.println(numeroEmString + 18);


    }
}
