import java.util.Scanner;

public class MaiorNumero {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        double maiorNumero = Double.MIN_VALUE; 
        
        System.out.println("Digite 5 números do tipo ponto flutuante:");

        for (int i = 0; i < 5; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            double numero = scanner.nextDouble();
            
            if (numero > maiorNumero) {
                maiorNumero = numero;
            }
        }

        System.out.println("O maior número informado é: " + maiorNumero);
        
        scanner.close();
    }
}
