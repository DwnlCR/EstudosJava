package Maratona_java_javacore.Fassociacao.dominio;

public class SeminarioEx {
    private String titulo;
    //Seminario pode ter nenhum ou varios alunos
    private AlunoEx[] alunos; //Array com varios alunos e futuramente com uma condição saberemos que alunos são ou se não tem nenhum aluno inscrito -> fazer getters e setters de alunos e sobrecarregar o construtor
    //Seminario precisa ter um local
    private LocalEx local; //Um local para o seminario -> fazer getters e setters e fazer a sobrecarga de construtor novamente

    public SeminarioEx(String titulo) {
        this.titulo = titulo;
    }

    //Sobrecarga de construtor para alunos -> Professor: um professor pode ministrar varios seminarios

    public SeminarioEx(String titulo, AlunoEx[] alunos) {
        this.titulo = titulo;
        this.alunos = alunos;
    }

    //Sobrecarga de construtor para local -> Esqueleto de nossa aplicação esta pronto, agora veremos se esta tudo funcinando em

    public SeminarioEx(String titulo, AlunoEx[] alunos, LocalEx local) {
        this.titulo = titulo;
        this.alunos = alunos;
        this.local = local;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    //getters e setters de alunos

    public AlunoEx[] getAlunos() {
        return alunos;
    }

    public void setAlunos(AlunoEx[] alunos) {
        this.alunos = alunos;
    }

    //getters e setters de local

    public LocalEx getLocal() {
        return local;
    }

    public void setLocal(LocalEx local) {
        this.local = local;
    }
}
