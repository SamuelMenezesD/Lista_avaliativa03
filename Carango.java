import java.util.Scanner;
public class Carango {
    private int totalCarrosAte2000;
    private int totalGeral;

    public Carango() {
        totalCarrosAte2000 = 0;
        totalGeral = 0;
    }

    public void calcularDesconto() {
        Scanner leitor = new Scanner(System.in);

        String resposta = "S";
        while (resposta.equalsIgnoreCase("S")) {
            System.out.print("Digite o ano do veículo: ");
            int ano = leitor.nextInt();

            double desconto;
            if (ano <= 2000) {
                desconto = 0.12;
                totalCarrosAte2000++;
            } else {
                desconto = 0.07;
            }

            System.out.print("Digite o valor do veículo: R$");
            double valor = leitor.nextDouble();

            double valorDesconto = valor * desconto;
            double valorFinal = valor - valorDesconto;

            System.out.println("Valor do desconto: R$" + valorDesconto);
            System.out.println("Valor a ser pago pelo cliente: R$" + valorFinal);

            totalGeral++;

            System.out.print("Deseja continuar calculando desconto? (S/N): ");
            resposta = leitor.next();
        }

        leitor.close();
    }
    public void mostrarTotais() {
        System.out.println("Total de carros com ano até 2000: " + totalCarrosAte2000);
        System.out.println("Total geral de carros: " + totalGeral);
    }
}