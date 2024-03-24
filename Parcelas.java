public class Parcelas {
    private double vlrcompra;

    public Parcelas (double vlrcompra){
        this.vlrcompra = vlrcompra;
    }

    public double prestacaoSemjuros(){
        return vlrcompra /5;
    }
    
}
