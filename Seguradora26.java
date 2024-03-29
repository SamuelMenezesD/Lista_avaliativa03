import java.util.Scanner;

public class Seguradora26 {
    private String nome;
    private int idade;
    private int grupoRisco;
    private String categoria;

    public void lerDados() {
        Scanner leitor = new Scanner(System.in);

        System.out.print("Digite o nome do pretendente: ");
        nome = leitor.nextLine();

        System.out.print("Digite a idade do pretendente: ");
        idade = leitor.nextInt();

        System.out.print("Digite o grupo de risco do pretendente (1 - baixo, 2 - médio, 3 - alto): ");
        grupoRisco = leitor.nextInt();

        leitor.close();
    }

    public void determinarCategoria() {
        if (idade >= 17 && idade <= 70) {
            if (idade >= 17 && idade <= 20) {
                switch (grupoRisco) {
                    case 1:
                        categoria = "Categoria 1";
                        break;
                    case 2:
                        categoria = "Categoria 2";
                        break;
                    case 3:
                        categoria = "Categoria 3";
                        break;
                }
            } else if (idade >= 21 && idade <= 24) {
                switch (grupoRisco) {
                    case 2:
                        categoria = "Categoria 2";
                        break;
                    case 3:
                        categoria = "Categoria 3";
                        break;
                    case 4:
                        categoria = "Categoria 4";
                        break;
                }
            } else if (idade >= 25 && idade <= 34) {
                switch (grupoRisco) {
                    case 3:
                        categoria = "Categoria 3";
                        break;
                    case 4:
                        categoria = "Categoria 4";
                        break;
                    case 5:
                        categoria = "Categoria 5";
                        break;
                }
            } else if (idade >= 35 && idade <= 64) {
                switch (grupoRisco) {
                    case 4:
                        categoria = "Categoria 4";
                        break;
                    case 5:
                        categoria = "Categoria 5";
                        break;
                }
            } else if (idade >= 65 && idade <= 70) {
                switch (grupoRisco) {
                    case 7:
                        categoria = "Categoria 7";
                        break;
                    case 8:
                        categoria = "Categoria 8";
                        break;
                    case 9:
                        categoria = "Categoria 9";
                        break;
                }
            }
        } else {
            categoria = "Não se enquadra em nenhuma categoria";
        }
    }

    public void exibirDados() {
        System.out.println("Nome do pretendente: " + nome);
        System.out.println("Idade do pretendente: " + idade);
        System.out.println("Grupo de risco do pretendente: " + grupoRisco);
        System.out.println("Categoria do pretendente: " + categoria);
    }
}