import java.util.Scanner;
//Elaborar um programa que efetue a apresentação do valor da conversão em real (R$) de um valor lido em dólar (US$)
// O programa deverá solicitar o valor da cotação do dólar e também aquantidade de dólares disponíveis com o usuário

public class Exercicio_04 {
    public static void executar(){
        Scanner leitor = new Scanner(System.in);

        System.out.println("Insira a cotação do dolar: ");
        double cotacao = leitor.nextDouble();

        System.out.println("Insira a quantidade de dolares disponiveis: ");
        double quantdolar = leitor.nextDouble();

        CotacaoDolar cotacaodolar = new CotacaoDolar(cotacao, quantdolar);

        System.out.println("O valor para Reais é: "+ cotacaodolar.converReal());




        leitor.close();


    }
    
}
