import java.util.Scanner;
//Dado o nome de um estudante, com o respectivo número de matrícula e as três notas acima mencionadas,
// desenvolva um programa para calcular a nota final e a classificação de cada estudante.
// A classificação é dada conforme a lista abaixo:
//Nota Final Classificação
//[8,10] A
//[7,8] B
//[6,7] C
//[5,6] D
//[0,5] R
//RImprima o nome do estudante, com o seu número, nota final e classificação.
public class Exercicio_25 {
    public static void executar(){
        Scanner leitor = new Scanner(System.in);

        System.out.println("Insira o nome do estudante: ");
        String nome = leitor.nextLine();

        System.out.println("Insira o numero do estudante: ");
        String matricula = leitor.nextLine();

        System.out.println("Insira a nota do laboratorio: ");
        double ntlab = leitor.nextDouble();

        System.out.println("Insira a nota da avaliação semestral: ");
        double ntav = leitor.nextDouble();

        System.out.println("Insira a nota do exame final: ");
        double ntexfinal = leitor.nextDouble();

        Aluno25 aluno25 = new Aluno25(nome, matricula, ntlab, ntav, ntexfinal);

        System.out.println("O aluno " +  aluno25.nomeAluno());
        System.out.println("De matricula: " + aluno25.matriculaAluno());
        System.out.println("Teve como media: " + aluno25.notafinal);
        System.out.println("Ficando na classificação: " + aluno25.classificacao());


        leitor.close();
    }
    
}
