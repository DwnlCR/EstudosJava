package Maratona_java_introducao;

public class Aula07ExercicioBreak {
    public static void main(String[] args) {
        //Dado o valor de um carro, descubra quantas vezes ele pode ser parcelado
        //Condição: Valor da parcela deve ser >= 1000
        double valorCarro = 50000;
        for(int parcelas = 1; parcelas <= valorCarro; parcelas++){
            double valorParcelas = valorCarro/parcelas;
            if(valorParcelas < 1000){
                break;
            }
            System.out.println("Quantidade de parcelas: " + parcelas + "; Valor das parcelas: R$" + valorParcelas);
        }
    }
}
