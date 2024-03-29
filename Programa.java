import java.util.Scanner;

public class Programa {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Menu de Opções:");
        System.out.println("1. exercicio 1");
        System.out.println("2. exercicio 2");
        System.out.println("3. exercicio 3");
        System.out.println("4. exercicio 4");
        System.out.println("5. exercicio 5");
        System.out.println("6. exercicio 6");
        System.out.println("7. exercicio 7");
        System.out.println("8. exercicio 8");
        System.out.println("9. exercicio 9");
        System.out.println("10. exercicio 10");
        System.out.println("11. exercicio 11");
        System.out.println("12. exercicio 12");
        System.out.println("13. exercicio 13");
        System.out.println("14. exercicio 14");
        System.out.println("15. exercicio 15");
        System.out.println("15. exercicio 16");
        System.out.println("15. exercicio 17");
        System.out.println("15. exercicio 18");
        System.out.println("15. exercicio 19");
        System.out.println("15. exercicio 20");
        System.out.println("15. exercicio 21");
        System.out.println("15. exercicio 22");
        System.out.println("15. exercicio 23");
        System.out.println("15. exercicio 24");
        System.out.println("15. exercicio 25");
        System.out.println("15. exercicio 26");


        System.out.print("Escolha uma exercicio: ");
        int opcao = scanner.nextInt();

        switch (opcao) {
            case 1:
                System.out.println("Você escolheu a Exercicio 1");
                Exercicio_01.executar();
                break;
            case 2:
                System.out.println("Você escolheu a Exercicio 2");
                Exercicio_02.executar();
                break;
            case 3:
                System.out.println("Você escolheu a Exercicio 3");
                Exercicio_03.executar();
                break;
            case 4:
                System.out.println("Você escolheu a Exercicio 4");
                Exercicio_04.executar();
                break;
            case 5:
                System.out.println("Você escolheu a Exercicio 5");
                Exercicio_05.executar();
               break;
            case 6:
                System.out.println("Você escolheu a Exercicio 6");
                Exercicio_06.executar();
                break;
            case 7:
                System.out.println("Você escolheu a Exercicio 7");
                Exercicio_07.executar();
                break;
            case 8:
                System.out.println("Você escolheu a Exercicio 8");
                Exercicio_08.executar();
                break;
            case 9:
                System.out.println("Você escolheu a Exercicio 9");
                Exercicio_09.executar();
                break;
            case 10:
                System.out.println("Você escolheu a Exercicio 10");
                Exercicio_10.executar();
                break;
            case 11:
                System.out.println("Você escolheu a Exercicio 11");
                Exercicio_11.executar();
                break;
            case 12:
                System.out.println("Você escolheu a Exercicio 12");
                Exercicio_12.executar();
                break;
            case 13:
                System.out.println("Você escolheu a Exercicio 13");
                Exercicio_13.executar();
                break;
            case 14:
                System.out.println("Você escolheu a Exercicio 14");
                Exercicio_14.executar();
                break;
            case 15:
                System.out.println("Você escolheu a Exercicio 15");
                Exercicio_15.executar();
                break;
            case 16:
                System.out.println("Você escolheu a Exercicio 16");
                Exercicio_16.executar();
                break;        
            case 17:
                System.out.println("Você escolheu a Exercicio 17");
                Exercicio_17.executar();
                break;  
            case 18:
                System.out.println("Você escolheu a Exercicio 18");
                Exercicio_18.executar();
                break;  
            case 19:
                System.out.println("Você escolheu a Exercicio 19");
                Exercicio_19.executar();
                break;  
                case 20:
                System.out.println("Você escolheu a Exercicio 20");
                Exercicio_20.executar();
                break;  
            case 21:
                System.out.println("Você escolheu a Exercicio 21");
                Exercicio_21.executar();
                break;
            case 22:
                System.out.println("Você escolheu a Exercicio 22");
                Exercicio_22.executar();
                break;
            case 23:
                System.out.println("Você escolheu a Exercicio 23");
                Exercicio_23.executar();
                break;
            case 24:
                System.out.println("Você escolheu a Exercicio 24");
                Exercicio_24.executar();
                break;
            case 25:
                System.out.println("Você escolheu a Exercicio 25");
                Exercicio_25.executar();
                break;
            case 26:
                System.out.println("Você escolheu a Exercicio 26");
                Exercicio_26.executar();
                break;
            default:
                System.out.println("Exercicio inválida!");
                break;
        }

        scanner.close();
        
        
    }

}
