import java.util.Scanner;
//Escrever um programa que leia o nome e as três notas obtidas por um aluno durante o semestre.
//Calcular a sua média (aritmética),
// informar o nome e sua menção aprovado (media >= 7),Reprovado (media <= 5) e Recuperação (media entre 5.1 a 6.9)
public class Exercicio_08 {
    public static void executar(){
        Scanner leitor = new Scanner(System.in);

        System.out.print("Digite o nome do aluno: ");
        String nome = leitor.nextLine();
        
        System.out.print("Digite a nota da primeira prova: ");
        double not1 = leitor.nextDouble();
        
        System.out.print("Digite a nota da segunda prova: ");
        double not2 = leitor.nextDouble();
        
        System.out.print("Digite a nota da terceira prova: ");
        double not3 = leitor.nextDouble();

        Alunoex08 alunoex08 = new Alunoex08(nome, not1, not2, not3);

        System.out.println("Nome: " + alunoex08.getNome());
        System.out.println("Situação: " + alunoex08.resultadoAptidao());

        leitor.close();
    }
    
}
