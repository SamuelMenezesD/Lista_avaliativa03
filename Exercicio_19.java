import java.util.Scanner;
//Escrever um programa que leia três valores inteiros e verifique se eles podem ser os lados deum triângulo. 
//Se forem, informar qual o tipo de triângulo que eles formam: equilátero, isóscele ouescaleno.
public class Exercicio_19 {
    public static void executar(){
        Scanner leitor = new Scanner(System.in);

        System.out.println("Informe o lado 1 do triangulo: ");
        int lado1 = leitor.nextInt();

        System.out.println("Informe o lado 2 do triangulo: ");
        int lado2 = leitor.nextInt();

        System.out.println("Informe o lado 3 do triangulo: ");
        int lado3 = leitor.nextInt();

        Triangulo triangulo = new Triangulo(lado1, lado2, lado3);

        System.out.println(triangulo.tipoTriangulo());

        leitor.close();

    }
    
}
