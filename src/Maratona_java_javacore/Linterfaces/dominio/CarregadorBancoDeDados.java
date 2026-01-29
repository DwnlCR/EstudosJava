package Maratona_java_javacore.Linterfaces.dominio;

//Pronto criamos nossa classe concreta, agora vamos extender nossa interface né? Nada disso meu brother, a gente n vai herdar nada, n estamos mais trabalhando com apenas classes, o q vamos fazer é implementar nossa interface, ou seja public class CarregadorBancoDeDados -> public class CarregadorBancoDeDados implements CarregadorDeDados
public class CarregadorBancoDeDados implements CarregadorDeDados{ //Marrapaz, eu acabei de implementar e ja ta dando erro ;-;?, é pq a gente n ta cumprindo com o contrato, la tem um metodo, então aqui tem q ter esse mesmo metodo, vamos colocar o metodo void carregar no escopo de CarregadorBancoDeDados
    //*** Pronto agora é só a gente implementar nossa segunda interface na classe Carregador de Arquivos, para isso é so colocar uma virgula e a nova interface a ser implementada hehe :), vamos fazer isso
    //*** Assim que fizermos isso vai dar erro por que temos que implementar tambem o metodo abstrato remover() q está no escopo de RemovedorDeDados -> linha 14

    @Override
    public void carregar() { //Pronto ele ta aqui, mas ele ta tão sequin, passando fome, vamo botar esse coitado pra imprimir alguma coisa
        System.out.println("Carregando dados do banco de dados...");
    }
    //Agora vamos ver se essa interface serve pra 2 classes ao mesmo tempo -> Criar CarregadorDeArquivos

    //***Implementação do metodo remover();
    public void remover(){
        System.out.println("Removendo dados do banco de dados...");
    }
    //Agora vamos testar para ver se realmente tudo isso que fizemos funciona de verdade -> CarregadorDeDadosTest01

    //Sobreescrevendo metodo concreto da interface
    @Override
    public void checarPermissao() {
        System.out.println("Carregador de Banco de Dados: Permissão concedida");
    }

    //Agora vamos tentar sobreescrever o metodo imprime_tamanho_Max_De_Carregamentos
    //@Override //Erro no Override pois não podemos sobreescrever um metodo estatico da interface
    public static void imprime_tamanho_Max_De_Carregamentos(){ //Sem Override pode mas nos estamos criando uma classe totalmente diferente da classe interface sem relação alguma entre elas alem do tamanho_Max_De_Carregamentos
        System.out.println("Dentro do imprime_tamanho_Max_De_Carregamentos na classe concreta CarregadorBancoDeDados, tamanho maximo de carregamentos = " + tamanho_Max_De_Carregamentos); //Agora podemos testar para ver se esse metodo está funcionando corretamente -> CarregadorDeDadosTest01
    }
}
