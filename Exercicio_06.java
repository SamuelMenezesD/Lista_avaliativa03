import java.util.Scanner;
//Faça um programa que receba o preço de custo de um produto e mostre o valor de venda. 
//Sabe-se que o preço de custo receberá um acréscimo de acordo com um percentual informado pelo usuário.

public class Exercicio_06 {
    public static void executar(){
        Scanner leitor = new Scanner(System.in);

        System.out.println("Informe o valor do custo: ");
        double custo = leitor.nextDouble();

        System.out.println("Infome o percentual de acrescimo: ");
        double acrescimovlr = leitor.nextDouble();

        Acrescimo acrescimo = new Acrescimo(custo, acrescimovlr);

        System.out.println("O valor do produto com o acrescimo é de: "+ acrescimo.vlrProduto());
        
        leitor.close();
    }
    
}
