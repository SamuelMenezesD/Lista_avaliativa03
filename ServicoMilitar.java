import java.util.Scanner;
public class ServicoMilitar {
    private int totalAptas;
    private int totalInaptas;

    public ServicoMilitar() {
        totalAptas = 0;
        totalInaptas = 0;
    }

    public void verificarAptidao() {
        Scanner leitor = new Scanner(System.in);

        System.out.print("Digite a quantidade de pessoas: ");
        int numPessoas = leitor.nextInt();

        for (int i = 1; i <= numPessoas; i++) {
            System.out.print("Digite o nome da pessoa " + i + ": ");
            String nome = leitor.next();

            System.out.print("Digite o sexo da pessoa " + i + " (M/F): ");
            String sexo = leitor.next();

            System.out.print("Digite a idade da pessoa " + i + ": ");
            int idade = leitor.nextInt();

            System.out.print("Digite a saúde da pessoa " + i + " (Boa/Ruim): ");
            String saude = leitor.next();

            if (sexo.equalsIgnoreCase("M") && idade >= 18 && saude.equalsIgnoreCase("Boa")) {
                System.out.println(nome + " está apto para o serviço militar obrigatório.");
                totalAptas++;
            } 
            else {
                System.out.println(nome + " não está apto para o serviço militar obrigatório.");
                totalInaptas++;
            }
        }

        leitor.close();
    }

    public void mostrarTotais() {
        System.out.println("Total de pessoas aptas para o serviço militar obrigatório: " + totalAptas);
        System.out.println("Total de pessoas inaptas para o serviço militar obrigatório: " + totalInaptas);
    }
}
