public class Alunoex08 {
    private String nome;
    private double not1;
    private double not2;
    private double not3;

    public Alunoex08(String nome, double not1, double not2, double not3) {
        this.nome = nome;
        this.not1 = not1;
        this.not2 = not2;
        this.not3 = not3;
    }

    public double calcularMedia() {
        return (not1 + not2 + not3) / 3;
    }

    public String getNome() {
        return nome;
    }
    public String resultadoAptidao(){
        if (calcularMedia() >= 7) {
            return  "aprovado";   
        }
        if (calcularMedia() <= 5) {
            return "Reprovado"; 
        }
        else{
            return "Recuperação";
        }
    }
    
}
