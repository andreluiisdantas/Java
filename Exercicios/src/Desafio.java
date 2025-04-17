public class Desafio {
    public static void main(String[] args) {

        double x = -1;
        double y = -3;

        double numerador = 3 * Math.pow( y /4 , -2) + 6 * (Math.pow(3, x) / 4) - 4;
        double denominador = 7 * Math.pow(y/ 4, x) + 2;

        double resultado = Math.pow(numerador / denominador, x) + 4;

        System.out.println(resultado);
    }
}
