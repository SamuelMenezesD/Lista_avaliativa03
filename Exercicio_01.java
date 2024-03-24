import java.util.Scanner;

public class Exercicio_01 {
    public static void executar(){
        Scanner leitor = new Scanner(System.in);

        System.out.print("Digite o nome do aluno: ");
        String nome = leitor.nextLine();
        
        System.out.print("Digite a nota da primeira prova: ");
        double nota1 = leitor.nextDouble();
        
        System.out.print("Digite a nota da segunda prova: ");
        double nota2 = leitor.nextDouble();
        
        System.out.print("Digite a nota da terceira prova: ");
        double nota3 = leitor.nextDouble();

        Aluno aluno = new Aluno(nome, nota1, nota2, nota3);
        
        System.out.println("Nome do aluno: " + aluno.getNome());
        System.out.println("Media das notas: " + aluno.calcularMedia());

        leitor.close();
    }
    
}
