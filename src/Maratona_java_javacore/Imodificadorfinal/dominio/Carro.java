package Maratona_java_javacore.Imodificadorfinal.dominio;

public class Carro { //Aula03, colocar final entre public e class, fazendo isso nenhuma classe pode herdar nada da classe Carro até q o final seja retirado
    //Aula01 De volta ao carro ;-;, mas precisamos dele para entender o modificador final
    private String nome;
    //private static double velocidadeLimite = 250; //Rapaz agora imagina q por exemplo virou uma lei nos USA falando q a velocidade limite em que um carro pode atingir é de 250 Km/h, mas sempre tem aqueles engraadinhos q querem editar as coisas p os carro ficar rapido q só o cão e do jeito q esta essa variavel agora apenas todos os carros terão a mesma velocidade limite, mas essa variavel nn é imutavel ;-; qlqlr pessoa pode mudar pelo CarroTest01 atravez de um set ;-;, o q q a gente vai fazer p isso n mudar mais?, é aqui q entra nosso novo comando massa :)
    public static final double VELOCIDADE_LIMITE = 250; //Digam ola para o modificador final, imutavel, começou 250 agora é 250 para sempre hehe, so tem um probleminha, ele tem q ter um valor se deixarmos por exemplo private final double velocidadeLimite; vai dar erro, pq o final gera uma constante, e para ser uma constante isso tem q ter um valor, alem disso a gente tem que GRITAR O NOME DELA PQ ELA É UMA CONSTANTE E CONSTANTES EM JAVA SÃO COLOCADAS EM CAPSLOCK E SEPARADAS POR _ CASO NECESSARIO -> modificador final em um tipo primitivo
    //Aula02 *
    public final Comprador COMPRADOR = new Comprador(); //Ta, criamos um modificador final   para um atributo de referencia, maas o q diabo significa public final Comprador COMPRADOR = new Comprador(); ;-;?? EU NEM SABIA Q DAVA P FZR ESSA BAGAÇA ;-;, basicamente essa é uma variavel final onde seu valor ja é definido inicialmente, da forma que estamos fazendo estamos praticamente dizendo que COMPRADOR = nulo inicialmente, pois estamos falando que é o novo objeto que vai definir o valor de COMPRADOR -> CompradorTest01
    //*

    //Aula03 -> Ferrari -> olhar a public class Carro e ver o conportamento apos a adição do final
    //Bom, o q podemos pensar é que se podemos fazer isso com a classe principal, por que não podemos aderir isso aos metodos tambem ;-;? ai q ta, a gente pode, e é isso q vamos fazer agora
    //Vamo fazer um imprime final aqui, por que não queremos que ninguem mais possa sobrecarregar esse metodo
    public final void imprime(){
        System.out.println(this.nome);
    }

    //Não precisamos de getters e setters para a constante pois ela é publica

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
