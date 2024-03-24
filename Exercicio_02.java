//Escrever um programa para determinar o consumo médio de um automóvel 
//sendo fornecida a distância total percorrida pelo automóvel e o total de combustível gasto.

import java.util.Scanner;

public class Exercicio_02 {
    public static void executar(){
        Scanner leitor = new Scanner(System.in);

        System.out.println("Insira a distancia percorrida: ");
        double distancia = leitor.nextDouble();

        System.out.println("Insira o total de combustivel gasto: ");
        double combustivelgasto = leitor.nextDouble();

        Automovel automovel = new Automovel(distancia, combustivelgasto);

        System.out.println("O consumo medio do carro é: "+ automovel.calcularMedia());

        leitor.close();


    }
    
}
