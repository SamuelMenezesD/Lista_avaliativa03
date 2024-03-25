import java.util.Scanner;

public class Exercicio_18 {
    public static void executar(){

        Scanner leitor = new Scanner(System.in);
        
        System.out.println("Insira o sexo(M/H): ");
        String sexo = leitor.nextLine();

        System.out.println("Insira o nome: ");
        String nome = leitor.nextLine();

        System.out.println("Insira o salario: ");
        double salariofixo = leitor.nextDouble();
            
        
            
        System.out.println("Insira idade: ");
        int idade = leitor.nextInt();
            
        Funcionario18 funcionario18 = new Funcionario18(nome, salariofixo, sexo, idade);

        
        System.out.println(funcionario18.escreverNome());
        System.out.println("O salario com abono é: "+ funcionario18.receberSalario());

        

        leitor.close();

    }
    
}
