package Maratona_java_javacore.Mpolimorfismo.dominio;

public class Tomate extends Produto{
    // @ Fazer isso apenas apos a criação de ProdutoTest02
    private String dataDeValidade;

    // * Agora vamos criar uma variavel IMPOSTO constante ja q esse valor não pode ser alterado para usar no metodo calcularImposto
    public static final double IMPOSTO = 0.06; //static por que é o mesmo valor pra não importa qual seja o valor do tomate, se ele é verde ou amarelo ou vermelho o imposto continuará sendo o mesmo e final pois esse valor não vai poder ser alterado, é uma constante
    public Tomate(String nome, double valor) {
        super(nome, valor);
    }
    //Pronto criamos nosso produto tomate, agora vamos pensar assim, todos os produtos são taxados pelo governo, mas é claro q essa taxa varia de acordo com que produto estamos falando, ou seja, obviamente a taxa cobrada pelo produto Tomate é totalmente diferente da taxa cobrada pelo produto Computador, mas o q temos certeza é q alguma taxa sera cobrada, então vamos criar o metodo abstrato valorTaxa em Produto,  ou podemos usar do nosso novo conceito de interface para nos auxiliar nessa parte, ja que sabemos que todos os produtos são taxados -> Produto (Caso vc prefira utilizar herança), Criar interface Taxavel com o metodo calcularImposto, eu usarei essa opção da interface principalmente para reforçar o q aprendemos sobre interfaces -> Criar interface Taxavel

    // * Sobreescrita do metodo abstrato da interface calcularImposto para Tomate -> linha 4 -> primeiro vamos definir qual o valor q será cobrado em cima do preço dos tomates
    @Override
    public double calcularImposto() {
        return this.getValor() * IMPOSTO;
    }
    //Pronto agora q terminamos nosso calcular imposto para ambos os casos podemos finalmente testar para ver se tudo isso está funcionando mesmo ne? ainda não, vamos fazer logo uma classe que faz um relatorio bonitinho para essa saida, depois a gente ve como ficou -> Criar Pacote servico

    // @ Vamos declarar o novo atributo dataDeValidade -> linha 4

    // @ Criar getters e setters de dataDeValidade -> Voltar a ProdutoTest02 para testar se Produto consegue chamar esse novo atributo
    public String getDataDeValidade() {
        return dataDeValidade;
    }

    public void setDataDeValidade(String dataDeValidade) {
        this.dataDeValidade = dataDeValidade;
    }
}
