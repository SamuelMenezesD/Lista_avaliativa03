import java.util.Scanner;

public class ConcessionariaCarango {
    private double totalDesconto;
    private double totalPago;

    public ConcessionariaCarango() {
        totalDesconto = 0;
        totalPago = 0;
    }

    public void calcularDescontoEValorPago() {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Digite o valor do veículo (ou 0 para encerrar): ");
            double valorVeiculo = scanner.nextDouble();

            if (valorVeiculo == 0) {
                break;
            }

            System.out.print("Digite o tipo de combustível (álcool, gasolina ou diesel): ");
            String tipoCombustivel = scanner.next();

            double desconto = 0;

            if (tipoCombustivel.equalsIgnoreCase("álcool")) {
                desconto = valorVeiculo * 0.25;
            } else if (tipoCombustivel.equalsIgnoreCase("gasolina")) {
                desconto = valorVeiculo * 0.21;
            } else if (tipoCombustivel.equalsIgnoreCase("diesel")) {
                desconto = valorVeiculo * 0.14;
            }

            double valorPago = valorVeiculo - desconto;

            System.out.println("Valor do desconto: " + desconto);
            System.out.println("Valor a ser pago pelo cliente: " + valorPago);

            totalDesconto += desconto;
            totalPago += valorPago;
        }

        scanner.close();
    }

    public void mostrarTotais() {
        System.out.println("Total de desconto concedido: " + totalDesconto);
        System.out.println("Total pago pelos clientes: " + totalPago);
    }
    
}
