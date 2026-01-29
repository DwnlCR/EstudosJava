package Maratona_java_javacore.Fassociacao.dominio;

public class Equipe {
    private String nome;
    private Participante [] participantes; //-> Essa é a principal diferença entre a Associação unidirecional e a Associação bidirecional, se vc olhar bem direitinho irá perceber que ambos Equipe e Participante se referenciam em seus escopos, coisa que não tinhamos na unidirecional
    //Nessa aula aprenderemos como funcionam agora as Associaçoes bidirecionais, que é basicamente no nosso exemplo quando tanto a Equipe quanto o Participante tem informações um do outro, pois quando eram unidirecionais apenas um tinha privilegios em usar o outro e ater todas as informações
    //Apos criarmos constructor getter e setter -> Participante
    public Equipe(String nome) {
        this.nome = nome;
    }

    //Sobrecarga do Construtor para adicionar array de participantes
    public Equipe(String nome, Participante [] participantes) {
        this.nome = nome;
        this.participantes = participantes;
    }

    //Metodo para imprimir
    public void imprime(){
        System.out.println(this.nome);
        if(participantes == null){
            return;
        }
        for(Participante participante : participantes){
            System.out.println(participante.getNome()); // O que fizemos nesse metodo foi usar a referencia de participantes da Classe Participante
        }
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Participante[] getParticipantes() {
        return participantes;
    }

    public void setParticipantes(Participante[] participantes) {
        this.participantes = participantes;
    }

    //Ir para EquipeTest01 e criar a estrutura basica
}

