package Maratona_java_javacore.Mpolimorfismo.dominio;

//Bom, agora iremos aprender o q eu acho ser a parte mais importante de POO, e é por essa parte q iremos aprender agora q vimos tudo isso até agora
//Ta mas, o q diabos é polimorfismo ;-;?, polimorfismo é em rapidas palavras fazer com que um mesmo nome de metodo possa executar ações diferentes, de acordo com o tipo real do objeto que chamar esse metodo, vcs podem n ter entendido muito bem, mas eu tenho certeza q irão compreender fazendo isso na pratica
//Primeiro criamos a classe produto, mas se vamos falar de produtos diferentes como computadores, notebooks, celulares, fones de ouvido, essa nossa classe produto será apenas uma referencia para essas outras novas classes, ou seja, classe abstrata

public abstract class Produto implements Taxavel{ //* O implements é apenas depois, não ligue para ele nesse começo, continuando, deu 2 erros, o motivo desses erros nos ja sabemos, as classes concretas não estão usando o metodo abstrato da interface, então vamos la resolver isso -> Computador, Tomate
    private String nome;
    private double valor;

    //Agora vamos fazer o construtor os getters e os setters e logo apos isso vamos criar nosso primeiro produto -> criar Computador

    public Produto(String nome, double valor) {
        this.nome = nome;
        this.valor = valor;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }
}
