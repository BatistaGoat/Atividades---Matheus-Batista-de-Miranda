import java.util.Scanner;

public class AnalisePessoas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int pessoasMaisDe90Kg = 0;
        int somaIdades = 0;

        System.out.println("Informe a idade e o peso de sete pessoas:");

        for (int i = 0; i < 7; i++) {
            System.out.println("Pessoa " + (i + 1) + ":");
            System.out.print("Idade: ");
            int idade = scanner.nextInt();
            somaIdades += idade;

            System.out.print("Peso (em kg): ");
            double peso = scanner.nextDouble();
            
            if (peso > 90) {
                pessoasMaisDe90Kg++;
            }
        }

        double mediaIdades = (double) somaIdades / 7;
        
        System.out.println("Quantidade de pessoas com mais de 90kg: " + pessoasMaisDe90Kg);
        System.out.println("Média das idades das sete pessoas: " + mediaIdades);
        
        scanner.close();
    }
}
