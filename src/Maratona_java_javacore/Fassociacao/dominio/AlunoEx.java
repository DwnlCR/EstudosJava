package Maratona_java_javacore.Fassociacao.dominio;

public class AlunoEx {
    private String nome;
    private int idade;
    //Vamos começar com: aluno deve estar em apenas um seminario
    private SeminarioEx seminario; //apenas um Seminario: Adicionar os getters e setters e sobrecarregar o construtor

    public AlunoEx(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    //Sobrecarga de construtor -> Agora vamos em seminario para fazer Seminario pode ter nenhum ou varios alunos

    public AlunoEx(String nome, int idade, SeminarioEx seminario) {
        this.nome = nome;
        this.idade = idade;
        this.seminario = seminario;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    //getters e setters de seminario

    public SeminarioEx getSeminario() {
        return seminario;
    }

    public void setSeminario(SeminarioEx seminario) {
        this.seminario = seminario;
    }
}
