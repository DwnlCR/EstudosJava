package Maratona_java_javacore.Dconstrutores.dominio;

public class Series {
    private String nome;
    private String tipo;
    private int episodios;
    private int ano;

    //Agora vamos ver como os construtores funcionam fazendo um na pratica
    //A primeira regra é: Construtores não podem retornar exatamente nada
    //A segunda regra é: que graças a essa limitação temos uma forma especifica de criar construtores
    //que é modificador de acesso (public ou private) + NomeDaClasse + () + {}
    //-> NÃO PODE POR NEM VOID NEM NENHUM TIPO POIS ASSIM O CONSTRUTOR VIRA UM METODO
    public Series(){} //Pronto criamos nosso construtor Vazio
    //Mas isso basicamente ja existia, pois o java ja faz esse construtor caso n façamos
    //apenas isso fica oculto, pois é impossivel criar um objeto sem um construtor
    //Mas agora pensando bem, pra que q criariamos um construtor vazio se o java ja faz isso?
    //é ai q ta, quem disse que a gente vai criar construtores vazios?
    //antes basicamente criavamos o construtor vazio e apos isso entregavamos valores a ele,
    //mas agora não queremos mais isso por que se o usuario n passar valor algum tem q dar erro,
    //é quase como se tivessemos uma caixa vazia que pode ou não ser enchida
    //mas agora queremos que ela seja enchida sem que o usuario possa ter a opçaõ de não encher
    //Vamos agora criar nosso construtor otimizado:
    public Series(String nome, String tipo, int episodios){
        this.nome = nome;
        this.tipo = tipo;
        this.episodios = episodios;
    }
    //Mas pensando bem ;-;? esse construtor é uma variação do original
    //N poderiamos utilizar ele para fazer parte do trabalho do construtor de 4 parametros não?
    //vamos tentar fazer isso assim como fizemos no metodo init
    public Series(String nome, String tipo, int episodios, int ano){
        //Vamos passar os parametros necessarios para o construtor ser usado
        //-> veremos um erro no SeriesTest01
        //this.nome = nome; //Vamos trocar esses 3 this pelo construtor de 3 parametros
        //this.tipo = tipo;
        //this.episodios = episodios;
        //this.Series(nome, tipo, episodios); //Ué num ta funcionando ;-;?
        //acontece que para um construtor chamar outro construtor existe uma sintaxe especial q é:
        //this(parametros do construtor); somente isso
        this(nome, tipo, episodios);//Regras para o uso dessa nomenclatura:
        //Essa nomenclatura de chamada de construtores tem 2 regras que são
        //1°: só pode acontecer dentro de construtores
        //2°: a chamada de outro construtor deve acontecer na primeira linha do construtor que está chamando
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
