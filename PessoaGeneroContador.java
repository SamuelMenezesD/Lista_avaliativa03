import java.util.Scanner;

public class PessoaGeneroContador {
    
    Scanner leitor = new Scanner(System.in);
    public String contarSexo(){
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
                return "Invalido";
            }
            
        }
        return "Total de homens: " + quanthomem + "Total de mulheres: " + quantmulher;
    }
}
