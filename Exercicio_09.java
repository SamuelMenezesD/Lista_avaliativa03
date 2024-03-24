import java.util.Scanner;
//Ler 80 números e ao final informar quantos número(s) est(á)ão no
// intervalo entre 10 (inclusive)e 150 (inclusive)
public class Exercicio_09 {
    public static void executar(){
        Scanner leitor = new Scanner(System.in);

        OitentaNumeros oitentanumeros = new OitentaNumeros();

        oitentanumeros.numEntre();
        

        leitor.close();
    }
    
}
