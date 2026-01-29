package Maratona_java_javacore.Mpolimorfismo.dominio;

//Computador extende Produto
public class Computador extends Produto{ //Deu erro pq na classe pai tem construtor e aqui ainda não, vamos fazer
    // * Agora vamos criar uma variavel IMPOSTO constante ja q esse valor não pode ser alterado para usar no metodo calcularImposto
    public static final double IMPOSTO = 0.21; //static por que é o mesmo valor pra não importa qual seja o valor do computador, se ele é da samsung ou acer ou positivo o imposto continuará sendo o mesmo, e final pois esse valor não vai poder ser alterado, é uma constante
    public Computador(String nome, double valor) {
        super(nome, valor);
    }
    //Agora vamos criar um novo produto, q tal, tomate :), tomate da certo ué, ele é um produto com nome e valor -> Criar Tomate

    // * Sobreescrita do metodo abstrato da interface calcularImposto();
    @Override
    public double calcularImposto() {
        return  this.getValor() * IMPOSTO;
    }
    //Pronto agora q terminamos nosso calcular imposto para ambos os casos podemos finalmente testar para ver se tudo isso está funcionando mesmo ne? ainda não, vamos fazer logo uma classe que faz um relatorio bonitinho para essa saida, depois a gente ve como ficou -> Criar Pacote servico
}
