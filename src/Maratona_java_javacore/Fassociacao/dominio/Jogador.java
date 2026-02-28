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
    public void setTime(Time time) {//Para que seja atribuido ao atributo privado time
        //o metodo setTime(); tem q receber um objeto Time
        this.time = time;
    }
}
