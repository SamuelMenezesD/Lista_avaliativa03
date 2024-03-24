import java.util.Scanner;

public class PrecoProdutos {
    private double somaCusto;
    private double somaVenda;
    private int totalProdutos;

    public PrecoProdutos() {
        somaCusto = 0;
        somaVenda = 0;
        totalProdutos = 0;
    }

    public void calcularLucroOuPrejuizo() {
        Scanner leitor = new Scanner(System.in);

        for (int i = 1; i <= 40; i++) {
            System.out.print("Digite o preço de custo do produto " + i + ": ");
            double custo = leitor.nextDouble();

            System.out.print("Digite o preço de venda do produto " + i + ": ");
            double venda = leitor.nextDouble();

            double lucroOuPrejuizo = venda - custo;

            if (lucroOuPrejuizo > 0) {
                System.out.println("Produto " + i + ": Houve lucro.");
            } else if (lucroOuPrejuizo < 0) {
                System.out.println("Produto " + i + ": Houve prejuízo.");
            } else {
                System.out.println("Produto " + i + ": Houve empate.");
            }

            somaCusto += custo;
            somaVenda += venda;
            totalProdutos++;
        }

        leitor.close();
    }
    public void calcularMediaPrecos() {
        double mediaCusto = somaCusto / totalProdutos;
        double mediaVenda = somaVenda / totalProdutos;

        System.out.println("Média de preço de custo: " + mediaCusto);
        System.out.println("Média de preço de venda: " + mediaVenda);
    }
    
}
