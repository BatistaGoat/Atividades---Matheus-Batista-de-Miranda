import java.util.Scanner;

public class SomaNumeros {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int[] numeros = new int[10];
        int somaPares = 0;
        int somaImpares = 0;
        int somaDivisiveisPor3 = 0;

        System.out.println("Digite 10 números:");

        for (int i = 0; i < 10; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            numeros[i] = scanner.nextInt();

            if (numeros[i] % 2 == 0) {
                somaPares += numeros[i];
            } else {
                somaImpares += numeros[i];
            }

            if (numeros[i] % 3 == 0) {
                somaDivisiveisPor3 += numeros[i];
            }
        }

        System.out.println("Soma dos números pares: " + somaPares);
        System.out.println("Soma dos números ímpares: " + somaImpares);
        System.out.println("Soma dos números divisíveis por 3: " + somaDivisiveisPor3);
        
        scanner.close();
    }
}
