//Leia o nome do funcionário, seu salário e o valor do salário mínimo. 
//Calcule o seu novo salárioreajustado. Escrever o nome do funcionário,
// o reajuste e seu novo salário. Calcule quanto à empresa vai aumentar sua folha de pagamento.

import java.util.Scanner;

public class Exercicio_17 {
    public static void executar(){
        Scanner leitor = new Scanner(System.in);

        System.out.println("Insira o nome do funcionario: ");
        String nome = leitor.nextLine();

        System.out.println("Informe o salario: ");
        Double salario = leitor.nextDouble();

        Funcionario17 funcionario17 = new Funcionario17(salario, nome);

        System.out.println("O funcionario " + funcionario17.getNome());
        System.out.println("O salario final é de: "+ funcionario17.salarioFinal());
        System.out.println("O reajuste foi de: " + funcionario17.reajusteValor());


        leitor.close();
    }
    
}
