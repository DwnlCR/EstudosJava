package Maratona_java_javacore.Mpolimorfismo.dominio;

public interface Taxavel { //Bom como todos os metodos aqui nas interfaces ja são abstratos por padrão apenas vamos criar como se estivessemos criando um metodo abstrato qualquer em uma classe
    public abstract double calcularImposto(); // * Agora vamos implementar essa interface para nossa classe abstrata Produto ja que queremos que nossas classes concretas recebam tudo q vier de Produto e Produto receberá tudo que vier de Taxavel -> implementar em Produto a interface Taxavel
}
