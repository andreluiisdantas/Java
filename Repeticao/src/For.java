public class For {
    public static void main(String[] args) {

        /*
        for(int i = 0; i <= 10; i++){
            if(i % 2 != 0){
                continue;
            }
            System.out.println(i);
        }
         */

        externo:
        for(int i = 0; i < 3; i++){
            System.out.println("Banana");
            for (int j = 0; j < 2; j++) {
                System.out.println("- Maçã");
                break externo;
            }
        }
    }
}
