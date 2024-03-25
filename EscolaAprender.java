public class EscolaAprender {
    private int horaprof;
    private int nivel;

    public EscolaAprender(int horaprof, int nivel){
        this.horaprof = horaprof;
        this.nivel = nivel;
    }

    public String calcularProf(){
        if (nivel == 1) {

            return "O salario é igual a: " + 12 * horaprof;
            
        }
        if (nivel == 2) {

            return "O salario é igual a: " + 17 * horaprof;
            
        }
        else{
            return "O salario é igual a: " + 25 * horaprof;
        }
    }
    
}
