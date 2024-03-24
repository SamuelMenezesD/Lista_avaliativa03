public class Acrescimo {
    private double custo;
    private double acrescimovlr;

    public Acrescimo(double custo, double acrescimovlr){
        this.acrescimovlr = acrescimovlr;
        this.custo = custo;
    }
    public double vlrProduto(){
        return custo*acrescimovlr/100;
    }
    
}
