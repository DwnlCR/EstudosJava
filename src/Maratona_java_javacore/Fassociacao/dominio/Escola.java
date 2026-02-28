package Maratona_java_javacore.Fassociacao.dominio;
public class Escola {
    //Aqui começaremos nosso estudo relacionado a associação unidirecional de muitos para 1
    //levando em consideração que precisamos de muitos professores para 1 escola mas o professor so pode trabalhar em uma escola
    private String nome;
    private Professor[] professores; //Um array de objetos professores com nomes e caracteristicas distintas
    //pois uma escola precisa de muitos professores
    public Escola(String nome){ //Para criarmos uma escola estritamente n precisamos de professores ainda ;-;
        //o q a gente precisa mesmo é de um nome, os professor a gente arruma depois por isso o obrigatorio para o construtor de escolas é um nome
        this.nome = nome;
    }
    //Sobrecarga de Construtor
    public Escola(String nome, Professor[] professores){
        this.nome = nome;
        this.professores = professores;
    }
    //Agora vamos criar nosso metodo imprime inicialmente apenas com o nome da escola e depois faremos nossa condição
    //se professor == nulo -> não podemos imprimir professor pq ele tem q existir primeiro né?
    public void imprime(){
        System.out.println(this.nome);
        if(professores == null){
           return; //break dos if nos metodos
        }
        //Agora vamos ver como seria a impressão dos professores agora com pelo menos um existindo, Vamos usar o foreach para isso
        for(Professor professor : professores){//Aqui o que fizemos foi, criamos um atributo temporario
            //com a mesma estrutura do array professores declarado inicialmente para pegar professor por professor e printar atravez do sout
            //Lembrando que aqui temos que buscar o nome do professor em outro Objeto então usamos o get ja que é um atributo privado privado
            System.out.println(professor.getNome());
        }
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
}
