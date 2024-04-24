public class NumerosDivisiveisPor5 {
    public static void main(String[] args) {
        System.out.println("Números entre 1000 e 2000 divisíveis por 5 com resto 3:");

        for (int i = 1000; i <= 2000; i++) {
            if (i % 5 == 3) {
                System.out.println(i);
            }
        }
    }
}
