import java.util.Scanner;

public class NumerosPares {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int numerosPares = 0;

        System.out.println("Digite 10 números inteiros:");

        for (int i = 0; i < 10; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            int numero = scanner.nextInt();
            
            if (numero % 2 == 0) {
                numerosPares++;
            }
        }

        System.out.println("Quantidade de números pares: " + numerosPares);
        
        scanner.close();
    }
}
