public class Peso23 {
    private String nome;
    private char sexo;
    private double altura;
    private int idade;

    public Peso23(String nome, char sexo, double altura, int idade){
        this.nome = nome;
        this.sexo = sexo;
        this.altura = altura;
        this.idade = idade;
    }
    public double contaPeso(){
        double pesoIdeal = 0;

        if (sexo == 'M') {
            if (altura > 1.70 && idade <= 20) {
                return pesoIdeal = (72.7 * altura) - 58;
            } else if (altura > 1.70 && idade >= 21 && idade <= 39) {
                return pesoIdeal = (72.7 * altura) - 53;
            } else if (altura > 1.70 && idade >= 40) {
                return pesoIdeal = (72.7 * altura) - 45;
            } else if (altura <= 1.70 && idade <= 40) {
                return pesoIdeal = (72.7 * altura) - 50;
            } else if (altura <= 1.70 && idade > 40) {
                return pesoIdeal = (72.7 * altura) - 58;
            }
            else{
                return pesoIdeal;
            }
        } 
        else if (sexo == 'F') {
            if (altura > 1.50 && idade >= 35) {
                return pesoIdeal = (62.1 * altura) - 45;
            } else if (altura > 1.50 && idade < 35) {
                return pesoIdeal = (62.1 * altura) - 49;
            } else if (altura <= 1.50) {
                return pesoIdeal = (62.1 * altura) - 44.7;
            }
            return pesoIdeal;
        }
        else {
            return pesoIdeal;
        }
        
    }
    public String escreverNome(){
        return nome;
    }
    
}
