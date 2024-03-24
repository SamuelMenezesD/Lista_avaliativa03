public class Vendedor {
    private String nome;
    private double salario;
    private double totalvendas;

    public Vendedor (String nome, double salario, double totalvendas){
        this.nome = nome;
        this.salario = salario;
        this.totalvendas = totalvendas;
    }
    public String getNome(){
        return nome;
    }
    public double getSalario(){
        return salario;
    }
    public double salarioTotal(){
        return salario + (totalvendas*15/100);
    }

}
