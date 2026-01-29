package Maratona_java_introducao;

public class Aula06SwitchExercicio {
    public static void main(String[] args) {
        // Dados os valores de 1 a 7, imprima se é dia util ou final de semana, 1 é domingo
        int dia = 4;
        switch (dia){
            case 1:
            case 7:
                System.out.println("Fim de semana");
                break;
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                System.out.println("Dia util");
                break;
            default:
                System.out.println("Opcao invalida");
                break;
        }
        if(dia == 1 || dia == 7){
            System.out.println("Fim de semana");
        }
        else{
            System.out.println("Dia util");
        }
    }
}
