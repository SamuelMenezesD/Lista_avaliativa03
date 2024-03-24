public class Automovel {
    private double distancia;
    private double combustivelgasto;

    public Automovel (double distancia, double combustivelgasto){
        this.distancia = distancia;
        this.combustivelgasto = combustivelgasto;
    }
    public double calcularMedia(){
        return distancia / combustivelgasto;
    }
    
}
