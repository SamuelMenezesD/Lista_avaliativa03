import java.util.Scanner;

public class ReajusteFuncionario {
    Scanner leitor = new Scanner(System.in);

    public void receberSalario(){

        System.out.println("Informe o valor do salario minimo: ");
        double salariominimo = leitor.nextDouble();

        double[] salarios = new double[584];

        for(int i = 0; i < 584; i++){
            System.out.println("Informe o salario: ");
            double salarioatual = leitor.nextDouble();

            double novosalario = 0;

            if (salarioatual < 3 * salariominimo) {
                novosalario = salarioatual * 1.5;
            } else if (salarioatual >= 3 * salariominimo && salarioatual <= 10 * salariominimo) {
                novosalario = salarioatual * 1.2;
            } else if (salarioatual > 10 * salariominimo && salarioatual <= 20 * salariominimo) {
                novosalario = salarioatual * 1.15;
            } else {
                novosalario = salarioatual * 1.1;
            }

            salarios[i] = novosalario;
        }
            for (int i = 0; i < 584; i++) {
            System.out.println("Funcionário " + (i + 1) + ": Salário atual = " + salarios[i]);
        
        }
    }
}

    
    

    

