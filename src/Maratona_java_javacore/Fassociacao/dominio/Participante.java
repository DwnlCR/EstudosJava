package Maratona_java_javacore.Fassociacao.dominio;

public class Participante {
    private String nome;
    private Equipe equipe;

    public Participante (String nome) {
        this.nome = nome;
    }

    public void imprime() {
        System.out.println(this.nome);
        if (equipe != null) {
            System.out.println(equipe.getNome());
        }
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    //Da forma em que esta agora os jogadores são obrigados a declarar seu time inicialmente, mas ao adicionarmos nosso getter e setter para time ele pode escolher depois que time ele pertence


    public Equipe getEquipe() { //O retorno será um valor do tipo Objeto Time
        return equipe;
    }

    public void setEquipe(Equipe equipe) { //Para que seja atribuido aos atributos privados iniciais o usuario deve digitar algo coerente pedido pelo Objeto Time para que esse valor seja atribuido sem dar erros
        this.equipe = equipe;
    }
}

