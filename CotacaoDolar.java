public class CotacaoDolar {
    private double cotacao;
    private double quantdolar;

    public CotacaoDolar (double cotacao, double quantdolar){
        this.cotacao = cotacao;
        this.quantdolar = quantdolar;
    }
    public double converReal(){
        return quantdolar*cotacao;
    }
    
}
