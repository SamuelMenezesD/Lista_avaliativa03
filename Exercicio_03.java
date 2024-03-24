import java.util.Scanner;
// Escrever um programa que leia o nome de um vendedor, o seu salário fixo e o total de vendas efetuadas
// por ele no mês (em dinheiro). Sabendo que este vendedor ganha 15% de 
//comissão sobre suas vendas efetuadas, informar o seu nome, o salário fixo e salário no final do mês.
public class Exercicio_03 {
    public static void executar(){
        Scanner leitor = new Scanner(System.in);

        System.out.println("Informe o nome do vendedor: ");
        String nome = leitor.nextLine();

        System.out.println("Insira o salario fixo do vendedor: ");
        double salario = leitor.nextDouble();

        System.out.println("Isira total em vendas do vendedor: ");
        double totalvendas = leitor.nextDouble();

        Vendedor vendedor = new Vendedor(nome,salario,totalvendas);

        System.out.println("Nome do vendedor: "+ vendedor.getNome());
        System.out.println("Salario: " + vendedor.getSalario());
        System.out.println("Salario final: "+ vendedor.salarioTotal());

        leitor.close();
    }
    
}
