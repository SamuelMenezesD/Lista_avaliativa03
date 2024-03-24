import java.util.Scanner;
//Escrever um programa que leia o nome e o sexo de 
//56 pessoas e informe o nome e se ela é homem ou mulher. No final informe total de homens e de mulheres.
public class Exercicio_11 {
    public static void executar(){
        Scanner leitor = new Scanner(System.in);

        int quanthomem = 0;
        int quantmulher = 0;

        for (int i = 0; i < 56; i++) {

            System.out.println("Informe o nome: ");
            String nome = leitor.nextLine();

            System.out.println( nome +" é homem ou mulher? (H/M)");
            String sexo = leitor.nextLine();
            

            if (sexo=="M"||sexo=="m") {
                quantmulher++;
                
            }
            if (sexo=="H"||sexo=="h") {
                quanthomem++;
            }
            else{
                System.out.println("Invalido");
            }
            
        }
        System.out.println("Total de homens: " + quanthomem);
        System.out.println("Total de mulheres: " + quantmulher);

        leitor.close();
    }
}
