package Maratona_java_javacore.Mpolimorfismo.test;

import Maratona_java_javacore.Mpolimorfismo.dominio.Computador;
import Maratona_java_javacore.Mpolimorfismo.dominio.Produto;
import Maratona_java_javacore.Mpolimorfismo.dominio.Televisao;
import Maratona_java_javacore.Mpolimorfismo.dominio.Tomate;
import Maratona_java_javacore.Mpolimorfismo.servico.CalcularImposto;

public class ProdutoTest02 {
    public static void main(String[] args) {
        //Agora sim, vamos testar algumas coisas, nosso maior problema nesse momento é: temos q criar uma variavel de referencia de um certo tipo para referenciar um objeto desse mesmo tipo, por exemplo "X variavel = new X();" n ia ser mt bom se esse primeiro X pudesse se adequear a qualquer outro objeto por exemplo "X variavel = new Y();" e "X variavel = new W();", e por que não podemos fazer isso ;-;? Ai q ta, graças ao polimorfismo a gente pode hehe
        //Ja que Computador e Tomate são ambos produtos, por que não podemos simplesmente usar a classe Produto para criar uma variavel de referencia para qualquer subclasse de produto? ;-; acho q da pra fazer isso hein, vamo tentar

        Produto produto = new Computador("Ryzen 9", 3000);
        Produto produto2 = new Tomate("Tomate Vermelho", 150);
        //Oia so, não deu erro :) agora vamo ver se da pra printar esses valores

        //Vamos pegar esses valores atraves dos metodos get e set de produto ja que não estamos lidando diretamente com os objetos Computador e Tomate, mas nossas variaveis de referencia podem se adequar a qualquer objeto que seja subclasse de Produto, isso é chamado de cast de variaeis de referencia e funciona para todos os atributos de produto
        System.out.println(produto.getNome());
        System.out.println(produto.getValor());
        System.out.println(produto.calcularImposto());
        System.out.println("------------------------");
        System.out.println(produto2.getNome());
        System.out.println(produto2.getValor());
        System.out.println(produto2.calcularImposto());
        System.out.println("------------------------");

        // @ Mas vamos lembrar que nesse exato momento eu falei que isso funciona para variaveis que estão presentes em produto, ou seja, se eu declarar uma nova variavel por exemplo dataDeValidade para tomate por exemplo, Produto não terá esse atributo para referenciar a tomate, fazendo com que esse valor não possa ser chamado da forma em que a variavel de referencia foi criada, logo essa forma não é eficiente para estes casos, vamos fazer isso para testar -> Tomate -> criar novo atributo privado dataDeValidade
        //Criamos o novo atributo dataDeValidade em tomate agora vamos comprovar que realmente Produto não consegue chamar esse valor pois ele não esta entre os atributos originais de Produto herdado pelas subclasses

        //System.out.println(produto2.getdataDeValidade); //Não existe em seu escopo, impossivel fazer essa operação

        //Agora que vimos que podemos usar uma classe pai generica para a declaração de variaveis do tipo referencia em alguns casos iremos agora aprender como funcionam parametros polimorficos, vc sabe o q é isso? eu tmb n sei não, a gente vai aprender agora sobre eles
        // $ Agora mesmo vamos lá na nossa classe CalcularImposto para fazer algumas alterações -> CalcularImposto

        //Alterações feitas HeHe, agora podemos gerar um relatorio para nossos humildes objetos de referencias genericas, vamo testar p ver se deu tudo certo
        CalcularImposto.calcularImpostoGenerico(produto);
        CalcularImposto.calcularImpostoGenerico(produto2);
        //Bingo, deu certo mermo hehe :) dessa forma não precisamos mais de metodos especificos de relatorio podemos usar o polimorfismo para fazer um metodo ter diferentes comportamentos de acordo com o objeto passado a ele hehe, para termos certeza vamos criar uma nova classe Televisão e ver se funciona com esse nova classe tambem :) -> criar nova classe Televisão

        //Pronto criamos a classe Televisão agora vamos ver se realmente esse novo metodo da classe CalcularImposto funciona para todos as subclasses de Produto
        //Vamos fazer um objeto para testar isso
        Televisao tv = new Televisao("Smart TV", 3500);
        //Pronto criamos a tv agr vamos ver se ta funcionando o metodo de parametro polimorfico generico
        CalcularImposto.calcularImpostoGenerico(tv);
        //Marrapais num é q deu certo mermo hehe :)

        //Agora que vimos que podemos usar um parametro polimorfico para metodos genericos percebemos uma coisa, estamos passando um parametro pai, ou seja, basicamente independente do objeto passado ele terá os atributos da classe pai obrigatoriamente, mas e se fizessemos o caminho contrario ;-;?, usar de uma classe mais especifica com atributos não pertencentes a classe pai e referenciar a classe pai usando essa classe especifica? -> vamos fazer isso em uma nova classe test, a classe ProdutoTest03
    }
}
