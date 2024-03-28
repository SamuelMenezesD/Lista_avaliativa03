public class Aluno25 {
    private String nome;
    private String matricula;
    private double ntlab;
    private double ntav;
    private double ntexfinal;

    public Aluno25 (String nome, String matricula, double nlab, double ntav, double ntexfinal){
        this.nome = nome;
        this.matricula = matricula;
        this.ntlab = nlab;
        this.ntav = ntav;
        this.ntexfinal = ntexfinal;
    }
    double notafinal = 0;
    public double notaAluno(){
        double notafinal= ((ntlab * 2)+(ntav * 3)+(ntexfinal * 5))/5;
        return notafinal;
    }
    public String nomeAluno(){
        return nome;
    }
    public String matriculaAluno(){
        return matricula;
    }
    public char classificacao(){
        if(notafinal >= 8){
            return 'A';
        }
        if(notafinal < 8 && notafinal >= 7){
            return 'B';
        }
        if (notafinal < 7 && notafinal >= 6) {
            return 'C';     
        }
        if (notafinal < 6 && notafinal >= 5) {
            return 'D';
            
        }
        else{
            return 'R';
        }
    }
    
}
