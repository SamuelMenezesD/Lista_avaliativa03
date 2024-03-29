import java.util.Scanner;

public class Exercicio_26 {
    public static void executar(){
        Scanner leitor = new Scanner(System.in);

        Seguradora26 seguradora26 = new Seguradora26();
        seguradora26.lerDados();
        seguradora26.determinarCategoria();
        seguradora26.exibirDados();

        leitor.close();
    }
    
}
