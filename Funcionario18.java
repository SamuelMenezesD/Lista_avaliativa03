import java.util.Scanner;

public class Funcionario18 {
    private String nome;
    private double salariofixo;
    private String sexo;
    private int idade;

    public Funcionario18(String nome, double salariofixo, String sexo, int idade){
        this.nome = nome;
        this.salariofixo = salariofixo;
        this.sexo = sexo;
        this.idade = idade;
    }
    Scanner leitor = new Scanner(System.in);

    public double receberSalario(){
        
        if (sexo=="M"||sexo=="m") {
            if (idade<30) {
                salariofixo = salariofixo + 50;
            }
            else{
                salariofixo = salariofixo + 100;
            }
            
        }
        else{
            if (idade < 30) {
                salariofixo = salariofixo + 80;
                
            }
            else{
                salariofixo = salariofixo + 100;
            }
        }
        return salariofixo;
    }
    public String escreverNome() {
        return "Funcionario: "+ nome;
    }
}
