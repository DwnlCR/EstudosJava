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
            System.out.println(equipe.getNome());//O que fizemos nesta linha foi:
            //usar a referencia de equipe da Classe Equipe para acessar seus métodos
            //get e set para pegar ou alterar o valor de seus atributos privados, nesse caso pegar
        }
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    //Da forma em que esta agora os jogadores são obrigados a declarar seu time inicialmente
    //mas ao adicionarmos nosso getter e setter para time ele pode escolher depois que time ele pertence
    public Equipe getEquipe(){//O retorno será um objeto do tipo Equipe
        return equipe;
    }
    public void setEquipe(Equipe equipe){//A entrada será um objeto do tipo Equipe
        this.equipe = equipe;
    }
}

