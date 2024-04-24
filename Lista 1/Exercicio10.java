import java.util.Scanner;

public class NumeroPrimo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite um número para verificar se é primo: ");
        int numero = scanner.nextInt();
        
        boolean ehPrimo = verificarPrimo(numero);
        
        if (ehPrimo) {
            System.out.println(numero + " é primo.");
        } else {
            System.out.println(numero + " não é primo.");
        }
        
        scanner.close();
    }
    
    public static boolean verificarPrimo(int n) {
        if (n <= 1) {
            return false;
        }
        
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        
        return true;
    }
}
