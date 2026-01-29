package Maratona_java_javacore.Fassociacao.dominio;

public class ProfessorEx {
    private String nome;
    private String especialidade;
    //Agora faremos aqui o relacionamento entre o professor e os seminarios que ele pode ministrar: um professor pode ministrar varios seminarios
    private SeminarioEx[] seminarios; //Array de seminarios que o professor pode ministrar -> fazer getters e setters e sobrecarga de construtor

    public ProfessorEx(String nome, String especialidade) {
        this.nome = nome;
        this.especialidade = especialidade;
    }

    //Sobrecarga de Construtor -> Agora vamos ir para a classe seminario novamente por que: seminario precisa ter um local

    public ProfessorEx(String nome, String especialidade, SeminarioEx[] seminarios) {
        this.nome = nome;
        this.especialidade = especialidade;
        this.seminarios = seminarios;
    }

    //Metodo imprime ☺

    public void imprime() {
        System.out.println("Professor: " + this.nome);
        System.out.println("Especialidade: " + this.especialidade);
        //Agora vamos ver se tem seminarios cadastrados ne? vai q n tem
        if (seminarios == null) {
            return;
        }
        System.out.println("### Seminarios Cadadstrados ###");
        //Vamos mostrar seminario por seminario dentro do array usando um foreach
        for (SeminarioEx seminario : this.seminarios) {
            //Não podemos apenas printar "seminario" achando que todas as informações vao vir de uma vez só, temos que ir usando os metodos get de SeminariosEx para pegar valor por valor
            System.out.println("Titulo: " + seminario.getTitulo());
            System.out.println("Local: " + seminario.getLocal().getEndereco());//Aqui queremos pegar o local do evento, mas esse local está dentro da Classe local, e só é possivel acessar esse valor atravez do getEndereço, então vamos mandar SeminarioEx chamar o metodo getLocal que chamará o metodo getEndereço para recebermos esse valor
            if(seminario.getAlunos() == null || seminario.getAlunos().length == 0) { //Fizemos isso basicamente para saber se o Array Alunos esta vazio ou se ele nem existe, se ele estiver vazio ou não existir o codigo volta para o inicio e continua iterando sobre seminarios sem passar do if por causa do continue
                continue;
            }
            System.out.println("### Alunos ###");
            //Alunos é um array, então temos que mostrar aluno por aluno atravez de um foreach
            //Lembrando que ainda estamos dentro do foreach de seminarios para olhar seminario por seminario e ver cada aluno de cada seminario, ou seja é uma iteração de 2 for's basicamente como se estivessemos olhando um vetor de endereços em que cada bloco de endereço do vetor principal seminarios aponta para um vetor diferente de alunos
            for (AlunoEx aluno : seminario.getAlunos()) {//aqui a variavel local tipo Objeto Aluno se transformara em aluno por aluno com nome e idade que esta sendo recebido pelo getAlunos que esta dentro de cada seminario
                System.out.println("Aluno: "+aluno.getNome()+" idade: "+aluno.getIdade());//Agora usamos nossa copia aluno de cada Objeto Aluno que esta presente no Array Alunos de seminario e usamos o getNome para pegar o nome e a idade de cada aluno da copia de Objeto de cada aluno
            }
        }
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    //getters e setters de seminarios

    public SeminarioEx[] getSeminarios() {
        return seminarios;
    }

    public void setSeminarios(SeminarioEx[] seminarios) {
        this.seminarios = seminarios;
    }
}
