package Maratona_java_javacore.Mpolimorfismo.dominio;

//Agora vamos extender e implementar respectivamente a classe Produto e a Interface Taxavel
//Apos isso voce vera alguns erros mas isso é normal, ele apenas quer que vc sobreescreva e implemente respectivamente o construtor e o metodo da interface calcularImposto
public class Televisao extends Produto implements Taxavel{
    public static final double IMPOSTO = 0.16; //Porcentagem cobrada em cima do preço original do produto Televisão

    //Sobreescrita do construtor
    public Televisao(String nome, double valor) {
        super(nome, valor);
    }

    //Implementação do calcularImposto
    @Override
    public double calcularImposto() {
        return this.getValor() * IMPOSTO;
    }

    //E pronto hehe, n precisamos mais fazer nada, só isso é o suficiente para podermos criar um novo objeto tipo produto ou tipo Televisão e chama-lo no metodo generico que criamos anteriormente, vamos la testar -> ProdutoTest02
}
