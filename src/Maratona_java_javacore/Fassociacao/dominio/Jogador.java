package Maratona_java_javacore.Fassociacao.dominio;
public class Jogador {
    //Antes de falarmos sobre associação e como é o seu funcionamento
    //vamos entender um pouco sobre arrays de objetos
    private String nome;
    private Time time; //Aqui nos falamos que cada jogador tem seu time
    //por isso chamamos o objeto Time como um dos atributos privados de Jogador
    //assim fazemos nossa primeira associação entre Objetos
    //descer la em baixo no getter e setter de time
    public Jogador(String nome) {
        this.nome = nome;
    }
    //Metodo imprime
    //Adicionar o time do jogador para ser printado
    public void imprime(){
        System.out.println(this.nome);
        //Primeiro vamos saber se ele colocou algum time ne?
        //pq se ele n tiver colocado a gente n consegue printar o time
        //vai sair um null pointer, um erro de tempo de execução
        if(time != null){
            //Time agora é um objeto e n mais somente um atributo privado de Jogador
            //temos que usar o time.getNome() para pegar o nome desse time
            System.out.println(time.getNome());
        }
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    //Da forma em que esta agora os jogadores são obrigados a declarar seu time inicialmente
    //mas ao adicionarmos nosso getter e setter para time ele pode escolher depois
    //a que time ele pertence
    public Time getTime() { //O retorno será um valor do tipo Objeto Time
        return time;
    }
    public void setTime(Time time) { //Para que seja atribuido aos atributos privados iniciais
        // o usuario deve digitar algo coerente pedido pelo Objeto Time para que esse valor seja atribuido sem dar erros
        this.time = time;
    }
}
