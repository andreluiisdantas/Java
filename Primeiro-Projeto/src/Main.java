import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

         /*
        Tipos de máscaras:
        %d - Inteiros: byte, short, int, long
        %f - Reais: float, double
        %c - Caractere: char
        %b - Lógico: boolean
        %s - String
        */

        /*
        // Tipos de variaveis inteiras
        byte variavelByte = 127; // Padrão de nomenclatura Camel Case - Primeiroa palavra começa com letra maiuscula e as outras demais com letra minuscula
        System.out.printf("Tamanho do byte: %d \n", variavelByte); // printf é o print formatado, onde as variaveis são trocadas por mascarás de substituição

        short variavelShort = 32767;
        System.out.printf("Tamanho do short: %d \n", variavelShort);

        int variavelInt = 2147483647;
        System.out.printf("Tamanho do int: %d \n", variavelInt);

        // Ao final do long sempre é necessário colocar a letra "L" no final do valor
        long variavelLong =  9_223_372_036_854_775_807L; // Se o número for muito grande posso separar as centenas por _ para não se perder durante a escrita, não será interpretado pelo computador
        System.out.printf("Tamanho do long: %d \n", variavelLong);
        */

        /*
        // Tipos de variaveis Reais
        // Ao final do float sempre é necessário colocar a letra "F" no final do valor
        float varaivelFloat = 3.4e+38F;
        System.out.printf("Tamanho do float: %f \n", varaivelFloat);

        double varaivelDouble = 1.7e+308;
        System.out.printf("Tamanho do double: %f \n", varaivelDouble);

        // Limitar casa decimais
        double limiteCasas = 3.1415678;
        System.out.printf("Valor da varaivel com as casas decimais limitadas: %.2f\n", limiteCasas);
        */

        /*
        // Tipos de variaveis char
        char variavelCaractere = 'A';
        System.out.printf("Variavel char: %c", variavelCaractere);


        /*
        // Tipo de variaveis lógica
        boolean varaivelBoolean = true;
        System.out.printf("A varaivel boolean é: %b", varaivelBoolean);
        */


        /*
        String texto = "Tamo Junto MLKADA!";


        System.out.print("Digite um número: ");
        int num1 = digitado.nextInt();

        System.out.print("Digite outro número: ");
        int num2 = digitado.nextInt();

        int resultado = num1 + num2;

        System.out.printf("%d + %d = %d\n", num1, num2, resultado);
        System.out.println(texto);
        */

        /*
        int idade = 19;
        int dia = 7;
        int mes = 2;
        int ano = 2006;

        System.out.printf("Olá, meu nome é André Luis, nasci em 0%d/0%d/%d, então tenho %d. TMJ É NOIS!", dia, mes, ano, idade);

        // outra opção

        String nome = "André Luis";
        String dataNascimento = "07/02/2006";
        int idade = 19;

        System.out.printf("Aooba! Sou o %s, nasci no dia %s, ou seja tenho %d anos. TMJ É NOIS!", nome, dataNascimento, idade);
        */


        /*
        // Tipo de variaveis String

        String variavelString = "Bem-vindo a Bosch";
        System.out.println(variavelString.length()); // Conta a quantidade de caracteres de uma String
        System.out.println(variavelString.toUpperCase()); // Deixa a String toda maiuscula
        System.out.println(variavelString.toLowerCase()); // Deixa a String toda minuscula
        System.out.println(variavelString.charAt(5)); // Procura o caractere em determinada posição
        System.out.println(variavelString + "!!!"); // Concatenação
        variavelString += "!"; // Alterando o valor da variavel
        System.out.println(variavelString);
        */


        /*
        // Operações matemáticas

        int numero1 = 19;
        int numero2 = 8;

        System.out.println(numero1 + numero2); // Adição
        System.out.println(numero1 - numero2); // Subtração
        System.out.println(numero1 * numero2); // Multiplicação
        System.out.println(numero1 / numero2); // Divisão
        System.out.println(numero1 % numero2); // Resto da divisão
         */

        /*
        // Operações com potencia

        double potencia = Math.pow(2,3); // Função para potencia, o primeiro argumento é a base e o segundo argumento o expoente
        System.out.println(potencia);
         */

        /*
        // Operações de raiz

        double raiz = Math.sqrt(4); // Função para raiz quadrada
        System.out.println(raiz);
         */

        /*
        // Entrada de dados via teclado
        Scanner scanner = new Scanner(System.in);

        int numero;

        System.out.print("Digite um número: ");
        numero = scanner.nextInt();
        System.out.printf("O número digitado foi: %d", numero);
        scanner.close();
         */

        /*
        Scanner scanner = new Scanner(System.in);
        int numero1;
        int numero2;

        System.out.print("Digite um número: ");
        numero1 = scanner.nextInt();

        System.out.print("Digite outro número: ");
        numero2 = scanner.nextInt();
        scanner.close();

        int soma = numero1 + numero2;

        System.out.printf("%d + %d = %d", numero1, numero2, soma);
         */

        /*
        Scanner scanner = new Scanner(System.in);

        String nome, sobrenome;
        System.out.print("Digite seu nome: ");
        nome = scanner.nextLine();
        System.out.print("Digite seu sobrenome: ");
        sobrenome = scanner.nextLine();
        System.out.printf("Olá, %s %s!", nome, sobrenome);

        scanner.close(); // Close é a ultima coisa do código
         */

        Scanner scanner = new Scanner(System.in);

        String nome;
        String sobrenome;
        int idade;

        System.out.print("Digite seu nome: ");
        nome = scanner.nextLine();

        System.out.print("Digite a sua idade: ");
        idade = scanner.nextInt();
        scanner.nextLine();//nextLine vazio para limpar o buffer

        System.out.print("Digite seu sobrenome: ");
        sobrenome = scanner.nextLine();

        System.out.println(nome);
        System.out.println(idade);
        System.out.println(sobrenome);

    }
}