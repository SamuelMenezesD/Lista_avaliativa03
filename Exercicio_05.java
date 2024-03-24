import java.util.Scanner;
//A Loja Mamão com Açúcar está vendendo seus produtos em 5 (cinco) 
//prestações sem juros.Faça um programa que receba um valor de uma compra e mostre o valor das prestações
public class Exercicio_05 {
    public static void executar(){
        Scanner leitor = new Scanner(System.in);

        System.out.println("Informe o valor da compra: ");
        double vlrcompra = leitor.nextDouble();

        Parcelas parcelas = new Parcelas(vlrcompra);

        System.out.println("O valor de cada uma das cinco parcelas é de: "+parcelas.prestacaoSemjuros()); 

        leitor.close();
    }
    
}
