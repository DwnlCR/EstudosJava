package Maratona_java_javacore.Jenumeração.test;

import Maratona_java_javacore.Jenumeração.dominio.ClienteEnum;
import Maratona_java_javacore.Jenumeração.dominio.TipoCliente;

public class ClienteTest01Enum {
    public static void main(String[] args) {
        //Basicamente essa erração toda aqui é por que o 2 parametro do construtor não é mais uma string e sim um TipoCliente, então vamos fazer essas alterações
        ClienteEnum cliente1 = new ClienteEnum("Daniel", TipoCliente.PESSOA_FISICA); //Agora sim, ainda usamos da chamada q eu exemplifiquei la em TipoCliente, agr n tem como mais o povo botar os negocio de qualquer jeito
        ClienteEnum cliente2 = new ClienteEnum("Iury", TipoCliente.PESSOA_JURIDICA);
        System.out.println(cliente1);
        System.out.println(cliente2);
    }
}

