public class OperadoresLogicos {
    public static void main(String[] args) {
        boolean condicao1 = true;
        boolean condicao2 = 15 < 12;

        System.out.println(condicao1);
        System.out.println(condicao2);

        System.out.println(condicao1 && condicao2); // AND
        System.out.println(condicao1 || condicao2); // OR
        System.out.println(!condicao1); // NOT
        System.out.println(condicao1 ^ condicao2); // XOR
    }
}
