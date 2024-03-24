//Escrever um programa que leia os dados de “N” pessoas (nome, sexo, idade e saúde)
// e informe se está apta ou não para cumprir o serviço militar obrigatório. Informe os totais.

public class Exercicio_13 {
    public static void executar(){
        
        ServicoMilitar servicoMilitar = new ServicoMilitar();
        servicoMilitar.verificarAptidao();
        servicoMilitar.mostrarTotais();

    }
}
