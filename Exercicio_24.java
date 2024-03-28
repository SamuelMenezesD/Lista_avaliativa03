import java.util.Scanner;
//Em um curso de Ciência da Computação a nota do estudante é calculada a partir de três notas atribuídas,
// respectivamente, a um trabalho de laboratório, a uma avaliação semestral e a um exame final.
// As notas variam, de 0 a 10 e a nota final é a média ponderada das três notas mencionadas.
//A lista abaixo fornece os pesos:
//a. Laboratório: peso 2
//b. Avaliação semestral: peso 3
//c. Exame final: peso 5
public class Exercicio_24 {
    public static void executar(){
        Scanner leitor = new Scanner(System.in);

        System.out.println("Insira a nota do laboratorio: ");
        double ntlab = leitor.nextDouble();

        System.out.println("Insira a nota da avaliação semestral: ");
        double ntav = leitor.nextDouble();

        System.out.println("Insira a nota do exame final: ");
        double ntexfinal = leitor.nextDouble();

        CienciaComputacao cienciaComputacao = new CienciaComputacao(ntlab, ntav, ntexfinal);

        System.out.println("A nota do aluno foi de: " + cienciaComputacao.notaCiencia());

        leitor.close();
    }
    
}
