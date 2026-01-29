package Maratona_java_javacore.Csobrecarga_de_metodos.dominio;

public class Anime {
    private String nome;
    private String tipo;
    private int episodios;
    private int ano;

    //Vamos criar nosso metodo init para facilitar o processo de inicialização dos atributos privados
    public void init(String nome, String tipo, int episodios) {
        this.nome = nome;
        this.tipo = tipo;
        this.episodios = episodios;
    }
    //Agora sim vamos começar a falar sobre a sobrecarga de metodos
    //Digamos por exemplo que o metodo init esta ja funcionando em um site a anos com varias pessoas acessando exatamente essa estrutura
    //Porem seu instrutor chegou e falou q agora o metodo init deve ter mais um parametro, então teremos que atualizar os atributos privados, oss getters e setters, e por fim o init, mas isso faria com que os clientes ficassem insatisfeitos por gostar da versão anterior
    //Poderiamos fazer um init2 com a mesma estrutura do init porem com um parametro a mais e funcionaria, mas isso ficaria muito feio :/
    //Então vamos usar o conceito de sobrecarga de metodos aqui do java para fazer essa situação ficar bonita, a sobrecarga de metodos basicamente é ter 2 ou mais metodos com o mesmo nome porem com parametros diferentes, porem os 2 ou mais funcionam, dependendo de quais parametros voce colocar entrara no init correspondente
    //Agora criaremos nosso novo init com um parametro a mais que o passado
    public void init(String nome, String tipo, int episodios, int ano) {
        //this.nome = nome; //Vemos um padrão, aqui temos nome, ou seja, um parametro do 1° init
        //this.tipo = tipo; //Vemos um padrão, aqui temos tipo, ou seja, um parametro do 1° init
        //this.episodios = episodios; //Vemos um padrão, aqui temos episodios, ou seja, um parametro do 1° init
        //Visto que os 3 parametros acima tambem são parametros do 1° init podemos apenas substituilos por uma chamada no 1° metodo init
        this.init(nome, tipo, episodios);
        this.ano = ano;
    }

    public void imprime() {
        System.out.println(this.nome);
        System.out.println(this.tipo);
        System.out.println(this.episodios);
        System.out.println(this.ano);
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public void setEpisodios(int episodios) {
        this.episodios = episodios;
    }

    public String getNome() {
        return this.nome;
    }

    public String getTipo() {
        return this.tipo;
    }

    public int getEpisodios() {
        return this.episodios;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }
}
