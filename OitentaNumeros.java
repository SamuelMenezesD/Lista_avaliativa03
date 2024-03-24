import java.util.Scanner;

public class OitentaNumeros {

    Scanner leitor = new Scanner(System.in);
    
    public int numEntre(){
        int quantentre = 0;
        for(int i = 0; i < 8; i++){
            System.out.println("Digite um numero para a posição  " + (i+1));
            int num = leitor.nextInt();
            if (num > 10 && num < 150) {
                quantentre++;
            }
        }
        System.out.println("A quantidade de numeros no intevalo é de: " + quantentre);
        return quantentre;
    }
    
}
