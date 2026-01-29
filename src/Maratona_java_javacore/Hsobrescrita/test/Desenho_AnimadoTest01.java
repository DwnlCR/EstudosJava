package Maratona_java_javacore.Hsobrescrita.test;

import Maratona_java_javacore.Hsobrescrita.dominio.Desenho_Animado;

public class Desenho_AnimadoTest01 {
    public static void main(String[] args) {
        //Agora iremos aprender sobre a sobreescrita do metodo toString
        //Mas antes vamos criar nosso objeto de desenho animado e dar um sout(nome do objeto)
        Desenho_Animado desenho = new Desenho_Animado("Os 7 monstrinhos");
        System.out.println(desenho);//Quando fizermos isso receberemos o hash code do objeto desenho e é nisso q vamos focar agora, pois como ja sabemos java é uma linguagem orientada a Objetos, ou seja, apesar de não vermos, esta implicito que por exemplo na nossa Classe Desenho_AnimadoTest01 possui um extends Object e é por causa desse extends Objects que por exemplo quando escrevemos "Desenho." automaticamente começa a surgir varios metodos que nunca vimos nem a cor, q a gente n faz a menor ideia de onde veio, esses metodos são de Origem da Classe Object que está extendida em cada classe criada
        //Agora nós iremos focar em um metodo especifico dessa Classe Objeto implicita, q é o metodo toString
        desenho.toString(); //Esse daqui, eu num falei q ela existia :)
        //Agora a pergunta é, pra q diab esse metodo serve mermo atualmente ;-;? , a resposta é simples, ele é responsavel por mostrar o pacote em que atualmente aquele objeto q chama o to string esta alem de por um @ e logo em seguida o hash code desse objeto, tipo assim: package + @ + hash code, mas a gente n precisa disso, o sout ja faz isso por nos, mas porque o sout faz isso por nos ;-;??? A resposta é simples, o sout chama o to String por debaixo dos panos, quando apenas fazemos System.out.println(desenho); o q realmente acontece é: System.out.println(desenho.toString); mas isso fica oculto
        //Então por que não sobreescrever esse metodo ao nosso favor? afinal podemos reescreve-lo pela regra da herança que diz q qualquer classe filha pode usar ou sobreescever metodos da classe pai em seu escopo -> Desenho_Animado

        //Ta reescrevido HeHe :) Agora se a gente chamar o metodo toString ele vai se comportar como um imprime e vai mostrar o nome do Desenho que nos atribuimos ao objeto
    }
}
