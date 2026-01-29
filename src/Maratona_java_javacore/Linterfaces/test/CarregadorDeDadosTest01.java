package Maratona_java_javacore.Linterfaces.test;

import Maratona_java_javacore.Linterfaces.dominio.CarregadorBancoDeDados;
import Maratona_java_javacore.Linterfaces.dominio.CarregadorDeArquivos;
import Maratona_java_javacore.Linterfaces.dominio.CarregadorDeDados;

public class CarregadorDeDadosTest01 {
    public static void main(String[] args) {
        //Vamos criar um carregador de banco de dados e um carregador de arquivos, depois disso vamo ver se eles conseguem chamar o metodo carregar
        CarregadorBancoDeDados carregadorBancoDeDados = new CarregadorBancoDeDados();
        CarregadorDeArquivos carregadorDeArquivos = new CarregadorDeArquivos();
        //Agr é so testar pra ver se o metodo abstrato da interface funciona ou não
        carregadorBancoDeDados.carregar();
        carregadorDeArquivos.carregar();
        //Bingo hehe :) estão funcionando perfeitamente

        //Agora q ja vimos como q funciona a base das coisas usando interfaces, vamos nos aprofundar mais um pouquinho em como utilizar elas de forma eficiente
        //Em primeiro lugar vamos criar uma nova interface, ja temos o CarregadorDeDados, agora vamos fazer o RemovedorDeDados -> Criar interface RemovedorDeDados

        //Pronto, fizemos a implementação de duas diferentes interfaces em apenas uma classe, agora vamos testar para ver se funciona mermo
        carregadorBancoDeDados.remover();
        carregadorDeArquivos.remover();
        //Marrapaz e num é que o negocio ta funcionando mermo :), agr vamos recaptular o q aprendemos ate agora
        //Ou seja, o q acabamos de aprender é que não existem limites paea a quantidade de interfaces que podemos implementar em uma só classe, diferente do conceito de herança em que nos aprendemos em aulas anteriores que uma classe so pode extender outra classe e nada mais alem disso
        //Mas agora vamos explorar mais uma das vantagens de se usar interfaces, quando tinhamos classes abstratas podiamos fazer metodos concretos, e nessa de criar metodos concretos na classe abstrata os filhos dessa classe abstrata podiam chamar esse metodo diretamente como se estivesse em seu escopo, bom o q acontece é que isso tambem funciona para interfaces hehe, vamo so testar pra ver se realmente é verdade isso , vamos fazer um metodo para checar permissão (obviamente um metodo não abstrato) -> CarregadorDeDados

        //Agora vamo ver se o metodo concreto checarPermissão da interface CarregadorDeDados pode ser utilizado pelas classes concretas que implementam essa interface
        carregadorBancoDeDados.checarPermissao();
        carregadorDeArquivos.checarPermissao();
        //Bingo, deu certo, acabamos de descobrir q da pra fazer tudo que uma classe abstrata faz usando uma interface e a interface é melhor ainda por permitir uma "herança multipla" para as classes concretas
        //A, e se quisermos podemos sobreescrever esse metodo concreto em qualquer uma das nossas classes concretas, por exemplo podemos dar permissão negada para CarregadorDeArquivos e dar permissão concedida para CarregadorBancoDeDados, ou podemos fazer qualquer outra coisa ne, mas vamos fazer esse pq é mais facil de exemplificar -> permissão negada para CarregadorDeArquivos e dar permissão concedida para CarregadorBancoDeDados

        //Alteramos o conteudo de checarPermissao para ambas as classes, vamo ver como q ta saindo agora

        //Agora iremos aprender algo novo hehe, vamos declarar atributos na interface,sim hehe podemos tambem nas interfaces criar atributos assim como nas classes concretas e abstratas :) -> vamos criar em CarregadorDeDados o atributo TamanhoMax para definir o tamanho maximo de carregamentos
        //Pronto, criamos o atributo e o metodo estatico, agora vamos testar se ambos estão funcionando
        CarregadorDeDados.imprime_tamanho_Max_De_Carregamentos();
        //Mas vc ja percebeu que n deu erro nas classes que importam CarregadorDeDados não deram erro quando criamos o novo metodo imprime_tamanho_Max_De_Carregamentos? Bom o motivo é porque quando criamos um metodo estatico em uma interface as classes que importam a interface não recebem esse novo metodo, se elas quiserem usar esse metodo elas terão que criar esse metodo, e olha que eu falei Criar não Sobreescrever
        //Vamos lá em CarregadorDancoDeDados por exemplo para criar esse metodo e ver que não tem como sobreescrever o metodo da interface -> CarregadorDancoDeDados

        //Pronto, agora temos um novo metodo em CarregadorBancoDeDados
        CarregadorBancoDeDados.imprime_tamanho_Max_De_Carregamentos();
    }
}
