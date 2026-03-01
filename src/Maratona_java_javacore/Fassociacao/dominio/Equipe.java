package Maratona_java_javacore.Fassociacao.dominio;
public class Equipe {
    private String nome;
    private Participante [] participantes;
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
            System.out.println(participante.getNome());//O que fizemos nesta linha foi:
            //usar a referencia de participantes da Classe Participante para acessar seus métodos
            //get e set para pegar ou alterar o valor de seus atributos privados, nesse caso pegar
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
}

