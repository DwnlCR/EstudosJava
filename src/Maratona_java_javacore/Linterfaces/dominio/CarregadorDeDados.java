package Maratona_java_javacore.Linterfaces.dominio;

public interface CarregadorDeDados {
    // # Esse bloco apenas depois da linha 24
    //Vamos finalmente declarar nosso primeiroatributo hehe
    public static final int tamanho_Max_De_Carregamentos = 10; //Ta a gente criou nosso atributo dessa forma, mas vc ja imaginou o porque d eu ter colocado public static final antes de declarar a variavel e porque esse trecho do codigo está cinza ou seja redundante, basicamente o motivo foi porque eu queria motrar a voces que não importa que atributo for declarado, o padrão normal a ser adotado pela interface é definir estes como public static final
    // # -> linha 28

    // Ja começamos bem, criando um negocio q a gente nem sabe para oq serve, pq q diab em vez de class ou enum a gente tem essa tal de interface ;-;?, vamos lá, nessa aula iremos aprender o q são interfaces e para oq elas servem
    //Bom em primeiro lugar ja deu para notar que criamos uma interface, não uma classe, ou nenhuma classe especial, ou seja ja começou meio confuso
    //O q são interfaces: por incrivel q pareça, podemos relacionar interface a uma coisa que vimos anteriormente, lembra q quando a gente criava classes abstratas e extendiamos essa classe a uma classe concreta, faziamos algo como uma especie de contrato entre a classe concreta e a abstrata onde a concreta deveria obrigatoriamente utilizar dos metodos presentes na classe abstrata?
    //Então ai q ta a sacada, as interfaces são basicamente classes abstratas sem ser classes abstratas :) ,ou seja, fazem a mesma coisa que as classes abstratas mas não são classes abstratas, por isso assim como nas classes abstratas não podemos usar o modificador de acesso final ja q assim como nas classes abstratas as interfaces foram feitas para serem "herdadas" não utilizadas

    //Ta, então em tese, a gente consegue fazer metodos aqui assim como lá nas classes abstratas, vamos tentar criar o metodo carregar então
    public abstract void carregar(); //Ta realmente da para criar metodos aqui dentro, mas todos os metodos devem ser abstratos, e eu n sei se vcs perceberam, mas o public abstract ta cinza, ou seja, eles são desnecessarios, afinal em interfaces todos os metodos obviamente são publicos e abstratos uma vez que é basicamente uma classe abstrata, então podemos retirar, mas vamos deixar ai por enquanto
    //Pronto agora criamos nosso primeiro metodo dentro de uma interface, agora é hora de implementa-lo, vamos criar uma classe concreta -> Criar CarregadorBancoDeDados

    //Agora vamos criar nosso novo metodo, dessa vez não abstrato para mostrar a voces que apesar de interfaces em si serem uma especie de classe abstrata em que podemos fazer uma "herança multipla", aqui tambem dá pra fazer isso
    //Mas temos um problema, la em n sei quando e bolinha que vieram pensar nessa possibilidade da interface de fato ter metodos concretos e abstratos, mas quando isso foi pensado ja existiam muitas mas muitas coisas feitas em java, e tipo assim, meio q se vc colocar um metodo concreto, assim como um abstrato em uma interface todas as classes que implementam essa interface terão que aderir esse novo metodo, pra gente é facil ja q estamos mexendo apenas com 2 classes, mas imagina uma empresa q tem milhares de classes, n ia dar certo né, e como o java é uma linguagem que usa do conceito de sistemas legados eliminar coisas da versão atual ou alguma antiga é inconcebivel, mas podemos adicionar mais funcionalidades e foi ai que nasceu o default
    //O q q é o default, é basicamente o q vamos utilizar no lugar do public abstract para gerar um metodo concreto, mas nada muda o fato de wue vamos ter q implementar esse mesmo metodo classe por classe não é mesmo ;-;?, errado amigo, o default não obriga a classes implementadoras da interface a criar esse metodo em seu escopo, vc cria se vc quiser, agr vamos ver como q ele fica no codigo
    default void checarPermissao(){ //public void checarPermissão(); -> default void checarPermissão(), hehe agora podemos fazer metodos concretos dentro de uma interface graças ao default, e se notarmos, nenhuma das classes concretas reclamou que existe um metodo concreto aqui e lá elas precisariam obrigatoriamente usar esse mesmo metodo -> agora vamos mandar esse metodo fazer algo
        System.out.println("Fazendo checagem de permissões...");
    }
    //Agora podemos fazer nossas 2 classes concretas chamar o nosso novo metodo concreto dentro de uma interface -> CarregadorDeDadosTest01

    //# Ja vimos que esta tudo funcionando, agora vamos fazer nosso primeiro atributo tamanhoMaximoDeCarregamentos -> linha 4

    //Agora que criamos nosso primeiro atributo dentro de uma interface vamos criar agora nosso primeiro metodo estatico ué, se a gente pode criar atributos estaticos devemos conseguir tambem criar metodos estaticos
    //Vamos criar o metodo imprime_tamanho_Max_De_Carregamentos

    public static void imprime_tamanho_Max_De_Carregamentos(){
        System.out.println("Dentro do imprime_tamanho_Max_De_Carregamentos na interface, tamanho maximo de carregamentos = " + tamanho_Max_De_Carregamentos); //Agora podemos testar para ver se esse metodo está funcionando corretamente -> CarregadorDeDadosTest01
    }
}
