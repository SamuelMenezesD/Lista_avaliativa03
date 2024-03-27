public class ContaLuz {
    private int tipo;
    private double consumo;

    public ContaLuz(int tipo, double consumo){
        this.consumo = consumo;
        this.tipo = tipo;
    }
    public double calcularValorConta() {
        double valor = 0;

        switch (tipo) {
            case 1:
                valor = 0.60;
                break;
            case 2:
                valor = 0.48;
                break;
            case 3:
                valor = 1.29;
                break;
            default:
                System.out.println("Tipo de cliente inválido!");
                return 0;
        }
        double valorfinal = valor * consumo;
        return valorfinal;
    }
    
}
