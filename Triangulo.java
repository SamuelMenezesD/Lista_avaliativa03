public class Triangulo {
    private int lado1;
    private int lado2;
    private int lado3;

    public Triangulo(int lado1, int lado2, int lado3){
        this.lado1 = lado1;
        this.lado2 = lado2;
        this.lado3 = lado3;

    }

    public String tipoTriangulo(){

        if (lado1 < lado2 + lado3) {
            if (lado1==lado2&& lado2==lado3) {

                return "Triangulo equilatero!";
                
            }
            if (lado1==lado2|| lado2==lado3) {

                return"Triangulo Isóscele!!";
                
            }
            else{
                return"Triangulo Escaleno!!!";
            }

            
        }
        else{
           return "Valor invalido!!!";
        }

    }
    
}
