public class CienciaComputacao {
    private double ntlab;
    private double ntav;
    private double ntexfinal;

    public CienciaComputacao(double nlab, double ntav, double ntexfinal){
        this.ntlab = nlab;
        this.ntav = ntav;
        this.ntexfinal = ntexfinal;

    }
    public double notaCiencia(){
        return ((ntlab * 2)+(ntav * 3)+(ntexfinal * 5))/5;

        
    }
    
}
