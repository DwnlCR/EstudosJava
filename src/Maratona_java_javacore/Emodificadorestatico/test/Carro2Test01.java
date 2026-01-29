package Maratona_java_javacore.Emodificadorestatico.test;

import Maratona_java_javacore.Emodificadorestatico.dominio.Carro2;

public class Carro2Test01 {
    public static void main(String[] args) {
        //Agora que vimos como o modificador Static funciona em atributos, nassa aula iremos aprender como seria seu funcionamento quando o assunto são metodos -> Carro2
                Carro2 carro1 = new Carro2("BMW", 280);
                Carro2 carro2 = new Carro2("Mercedes", 275);
                Carro2 carro3 = new Carro2("Audi", 290);
                Carro2.setVelocidadeLimite(270); //Carro2.velocidadeLimite = 270; -> Carro2.setVelocidadeLimite(270);
                carro1.imprime();
                carro2.imprime();
                carro3.imprime();
                //O que aprendemos hoje é que não podemos acessar variaveis não estaticas dentro de metodos estaticos, porem o contrario funciona, metodos de instancia (não estaticos) podem acessar variaveis ou atributos estaticos
                //Também aprendemos que um atributo estatico é o mesmo para todos os objetos, enquanto os atributos não estaticos são proprios de cada objeto criado

    }
}
