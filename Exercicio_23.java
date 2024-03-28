import java.util.Scanner;

public class Exercicio_23 {
    public static void executar(){
        Scanner leitor = new Scanner(System.in);

        System.out.print("Digite o nome da pessoa: ");
        String nome = leitor.nextLine();

        System.out.print("Digite o sexo da pessoa (M/F): ");
        char sexo = leitor.next().charAt(0);

        System.out.print("Digite a altura da pessoa: ");
        double altura = leitor.nextDouble();

        System.out.print("Digite a idade da pessoa: ");
        int idade = leitor.nextInt();

        Peso23 peso23 = new Peso23(nome, sexo, altura, idade);

        System.out.println(peso23.escreverNome());
        System.out.println("O seu peso ideal é: " + peso23.contaPeso());

        leitor.close();
    }
    
}
