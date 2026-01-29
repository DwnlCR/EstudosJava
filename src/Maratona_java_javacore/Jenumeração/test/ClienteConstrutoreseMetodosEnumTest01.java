package Maratona_java_javacore.Jenumeração.test;

import Maratona_java_javacore.Jenumeração.dominio.ClienteCMEnum;
import Maratona_java_javacore.Jenumeração.dominio.TipoCliente;
//import static Maratona_java_javacore.Jenumeração.dominio.ClienteCMEnum.*;

public class ClienteConstrutoreseMetodosEnumTest01 {
    public static void main(String[] args) {
        ClienteCMEnum cliente1 = new ClienteCMEnum("Daniel", TipoCliente.PESSOA_FISICA, ClienteCMEnum.TipoPagamento.DEBITO);//Agora n podemos mais ter apenas esses 2 parametros pois o construtor esta pedindo tambem o tipoPagamento, mas vamos ter q chamar ele de forma diferente ja que esse Enum foi criado dentro da Classe Principal, vai ser algo como: ClienteCMEnum.TipoPagamento.DEBITO, ou podemos simplesmente fazer uma nova classe TipoPagamento e fazer da mesma forma que fizemos com TipoCliente
        ClienteCMEnum cliente2 = new ClienteCMEnum("Iury", TipoCliente.PESSOA_JURIDICA, ClienteCMEnum.TipoPagamento.CREDITO);
        System.out.println(cliente1);
        System.out.println(cliente2);

        //Mas digamos por exemplo que vc quer alterar a forma de dizer se é uma pessoa fisica ou juridica ou apenas mostrar a opção escolhida atravez de um inteiro, para isso vamos ir até TipoCliente e fazer com que PESSOA_FISICA seja representado por 1 e PESSOA_JURIDICA seja representado por 2 por exemplo

        //Agora q ja fizemos todas as alterações necessarias é só chamar o sout de cada cliente, mas ja estamos fazendo isso, ent é só rodar o codigo e ver a magica acontecer
        //Agora q vimos q funciona vc me pergunta, mas pra q isso? n tinha necessidade d fzr isso tudo por tão pouco, e é ai q eu te falo, realmente n é muito util para nos, mas para quem vai receber esses dados e adicionar em um banco de dados por exemplo isso é um sonho

        //Nosso trabalho nessa Aula ja foi concluido, agora vamos para a classe ClienteSMEnum onde iremos aprender como sobreescrever metodos da classe Enum ->ClientesSMEnum
    }
}
