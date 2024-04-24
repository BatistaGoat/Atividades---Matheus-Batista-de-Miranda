import java.util.Scanner;

public class AnalisePessoas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int totalPessoas = 25;
        int pessoasMaisDe50Anos = 0;
        int totalPessoasEntre10e20Anos = 0;
        double somaAlturasEntre10e20Anos = 0;
        int pessoasComPesoInferiorA40Quilos = 0;

        System.out.println("Informe a idade, a altura (em metros) e o peso (em kg) de 25 pessoas:");

        for (int i = 0; i < totalPessoas; i++) {
            System.out.println("Pessoa " + (i + 1) + ":");
            System.out.print("Idade: ");
            int idade = scanner.nextInt();
            System.out.print("Altura (em metros): ");
            double altura = scanner.nextDouble();
            System.out.print("Peso (em kg): ");
            double peso = scanner.nextDouble();

            if (idade > 50) {
                pessoasMaisDe50Anos++;
            }

            if (idade >= 10 && idade <= 20) {
                totalPessoasEntre10e20Anos++;
                somaAlturasEntre10e20Anos += altura;
            }

            if (peso < 40) {
                pessoasComPesoInferiorA40Quilos++;
            }
        }

        double mediaAlturasEntre10e20Anos = totalPessoasEntre10e20Anos > 0 ? somaAlturasEntre10e20Anos / totalPessoasEntre10e20Anos : 0;
        double porcentagemPesoInferiorA40Quilos = (double) pessoasComPesoInferiorA40Quilos / totalPessoas * 100;

        System.out.println("a) Quantidade de pessoas com idade superior a 50 anos: " + pessoasMaisDe50Anos);
        System.out.println("b) Média das alturas das pessoas com idade entre 10 e 20 anos: " + mediaAlturasEntre10e20Anos + " metros");
        System.out.println("c) Porcentagem de pessoas com peso inferior a 40 quilos: " + porcentagemPesoInferiorA40Quilos + "%");

        scanner.close();
    }
}
