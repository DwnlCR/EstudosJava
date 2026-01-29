package Maratona_java_javacore.Imodificadorfinal.test;

import Maratona_java_javacore.Imodificadorfinal.dominio.Carro;

public class CarroTest01 {
    public static void main(String[] args) {
        //Agora vamo criar um carro
        Carro carro = new Carro();
        //Temos um carro
        //System.out.println(carro.VELOCIDADE_LIMITE); //Pode nn man, isso daqui é feio dms, o negocio é estatico, mt melhor só chamar a classe em vez do objeto ja q esse valor serve pra qualquer carro feito pela classe Carro
        System.out.println("De acordo com a nova lei do sinal de transito furado, a nova velocidade maxima permitida em todo o territorio norte americano é de "+Carro.VELOCIDADE_LIMITE+" Km/h"); //Agora sim ta bonitin
        //E se terntarmos atribuir um valor novo a VELOCIDADE_LIMITE???
        //Carro.VELOCIDADE_LIMITE = 180; //É, basicamente aq a gente é chamado de burro pelo java, o final nn deixa alterar esse valor
        
    }
}
