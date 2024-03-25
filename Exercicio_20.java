//A escola “APRENDER” faz o pagamento de seus professores por hora/aula. 
//Faça um programa que calcule e exiba o salário de um professor. 
//Sabe-se que o valor da hora/aula segue a tabela abaixo:
//Professor Nível 1 R$12,00 por hora/aula
//Professor Nível 2 R$17,00 por hora/aula
//Professor Nível 3 R$25,00 por hora/aula

import java.util.Scanner;

public class Exercicio_20 {
    public static void executar(){
        Scanner leitor = new Scanner(System.in);
        
        System.out.println("Insira o nivel do medico (niveis: 1, 2, 3)");
        int nivel = leitor.nextInt();

        System.out.println("Insira o numero de horas trabalhadas do professor: ");
        int horaprof = leitor.nextInt();

        EscolaAprender escolaAprender = new EscolaAprender(horaprof, nivel);

        System.out.println(escolaAprender.calcularProf());


        leitor.close();
    
    }
}
