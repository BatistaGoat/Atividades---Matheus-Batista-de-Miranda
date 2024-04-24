import java.util.Scanner;

public class Fatorial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite um número para calcular o fatorial: ");
        int numero = scanner.nextInt();
        
        int resultado = fatorial(numero);
        
        System.out.println(numero + "! = " + resultado);
        
        scanner.close();
    }
    
    public static int fatorial(int n) {
        if (n == 0) {
            return 1;
        } else {
            return n * fatorial(n - 1);
        }
    }
}
