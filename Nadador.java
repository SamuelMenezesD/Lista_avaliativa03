public class Nadador {
    
    private int idade;

    public Nadador(int idade){
        this.idade = idade;
    }
    public String categoriaIdade(){
        if (idade < 7 && idade > 5) {
            return "Infantil A";
            
        }
        if (idade < 10 && idade > 8) {
            return "Infantil B";
            
        }
        if (idade > 11 && idade < 13) {
            return "Juvenil A";
            
        }
        if (idade > 14 && idade < 17) {
            return "Juvenil B";
            
        }
        if (idade > 18 && idade < 25) {
            return "Senior";
            
        }
        else{
            return "Idade fora da faixa etária";
        }
    }
    
}
