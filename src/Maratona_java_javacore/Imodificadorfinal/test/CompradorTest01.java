package Maratona_java_javacore.Imodificadorfinal.test;

import Maratona_java_javacore.Imodificadorfinal.dominio.Carro;
import Maratona_java_javacore.Imodificadorfinal.dominio.Ferrari;

public class CompradorTest01 {
    public static void main(String[] args) {
        Carro carro = new Carro();
        System.out.println("De acordo com a nova lei do sinal de transito furado, a nova velocidade maxima permitida em todo o territorio norte americano é de " + Carro.VELOCIDADE_LIMITE + " Km/h");
        System.out.println(Carro.VELOCIDADE_LIMITE);//Ok aqui estamos mostrando a velocidade limite aplicada a todos os carros criados a partir da classe Carro
        System.out.println(carro.COMPRADOR);//E aqui estamos dizendo que esse objeto carro tem seu atributo comprador, não que todos os  carros tem um comprador só
        //Agora vamos tentar fazer uma referencia entre carro e comprador
        //carro.COMPRADOR = comprador; //Não funciona pois apesar de COMPRADOR ser publico na classe Carro ele ainda é privado na verdadeira Classe de origem Comprador, agora vamo fzr do jeito certo né
        //Agora vamos fazer isso da forma correta, vamos dar um valor ao atributo privado nome direto na Classe comprador atravez do metodo setNome de lá
        carro.COMPRADOR.setNome("Joãozin comprador de Carros"); //Agora sim está correto, o objeto carro chama o atributo COMPRADOR
        System.out.println(carro.COMPRADOR);

        //final+herança: Metodos e Classes Aula03
        //Agora vamos tentar usar nosso metodo final ne, ele está na Classe Carro, mas Ferrari é um Carro então em tese ele deve conseguir chamar esse metodo
        Ferrari ferrari = new Ferrari();
        ferrari.imprime(); //Oia só e num é q funciona mermo, agr a gente tem q dar um nome pra essa ferrari né?
        ferrari.setNome("Ferrari da braba");//Agora vamo chamar o imprime dnv p ver se sai esse mesmo valor
        ferrari.imprime();

    }
}


