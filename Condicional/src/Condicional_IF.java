import java.util.Scanner;

public class Condicional_IF {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        boolean postura;
        String situacao;

        System.out.println("Digite a nota: ");
        double media = scanner.nextDouble();

        System.out.println("Digite a quantidade de faltas: ");
        int faltas = scanner.nextShort();

        System.out.println("Escolha a opção:\n 1 - Com postura\n 2 - Sem postura");
        int opcao = scanner.nextShort();

        if(opcao == 1){
            postura = true;
        } else if (opcao == 2) {
            postura = false;
        }else {
            System.out.println("Opção Invalida");
            postura = false;
        }


        if(media >= 5.0 && faltas < 25 && postura == true) {
            situacao = "Aprovado";
        }
        else if (media < 5.0 && faltas < 25 && postura) {
            situacao = "Recuperação";
        }
        else if (media >= 5.0 && faltas >= 25 && postura) {
            situacao = "Reforço nas férias";
        }
        else if (media >= 5.0 && faltas < 25 && !postura){
            situacao = "Chamar para conversar";
        }
        else {
            situacao = "Reprovado";
        }

        System.out.println(situacao);
    }
}