package Maratona_java_javacore.Mpolimorfismo.test;

import Maratona_java_javacore.Mpolimorfismo.dominio.Computador;
import Maratona_java_javacore.Mpolimorfismo.dominio.Produto;
import Maratona_java_javacore.Mpolimorfismo.dominio.Televisao;
import Maratona_java_javacore.Mpolimorfismo.dominio.Tomate;
import Maratona_java_javacore.Mpolimorfismo.servico.CalcularImposto;

import static Maratona_java_javacore.Mpolimorfismo.servico.CalcularImposto.calcularImpostoGenerico;

public class ProdutoTest03 {
    public static void main(String[] args) {
        Produto produto = new Computador("Ryzen 9", 3000);
        Tomate produto2 = new Tomate("Tomate Vermelho", 150); //Produto -> Tomate

        //Vamos lá, digamos que a gente ta precisando da dataDeValidade desse Tomate Vermelho, mas se tentarmos procurar ou settar esse valor não vai dar certo ja que o objeto foi criado a partir da classe generica Produto e a dataDeValidade só pertence a classe especifica tomate, então o q deveriamos fazer para solucionar esse problema?
        //É simples vamos alterar a classe generica para que ela se torne especifica novamente e possamos ter accesso aos metodos get e set dataDeValidade -> linha 14
        //Agora que fizemos essa alteração podemos enfim designar a data de validade deste produto tipo Tomate
        produto2.setDataDeValidade("21/01/2026");

        // ! Mas beleza, vc concorda comigo que quando tivermos o relatorio dos tomates por exemplo temos que retornar essa informação da data de validade tambem, mas se por acaso for um computador não faz sentido retornar uma data de validade, ou seja, podemos apenas manter aquele antigo processo de fazer um relatorio para cada objeto ou podemos apenas alterar nosso metodo generico para que ele faça isso por nos, vamos fazer isso -> CalcularImposto

        //Pronto hehe, fizemos a adição da dataDeValidade ao relatorio dos tomates, vamos ver se ta tudo funcionando agora
        CalcularImposto.calcularImpostoGenericoEspecifico(produto2); //Passando um objeto tomate como parametro
        //BINGO HEHE, FUNCIONOU :)
        //Mas temos um problema, e se o objeto passado for um computador e não um tomate ;-;? tipo assim
        CalcularImposto.calcularImpostoGenericoEspecifico(produto);
        //Meu amigo, q erro feio da desgraça, mas tambem o q q a gente esperava ne, nesse momento o q fizemos foi praticamente trair o java dizendo que em momento algum enviariamos um objeto sem ser um tomate e logo em seguida enviando um computador, o cast simplesmente deu pane no sistema
        // % Mas nos vamos resolver esse problema agora mesmo, por que simplesmente não fazemos uma condição para descobrir se oo objeto passado é um tomate ou não? vamos la tentar fazer isso -> CalcularImposto

        // % Problema resolvido, agora vamos ver se esta dando tudo certo hehe, vamos rodar o codigo
        // % Bingo deu tudo certo, so vamos ajeitar essa data de validade de lugar pq ela ta bem feia depois do valor total, mas isso eu farei na sala

        //Agora nos entraremos no ultimo topico desse curso, a programação orientada a interfaces e como é eficiente a sua manutenção e usabilidade, primeiro vamos criar um novo pacote chamado repositorio e dentro dele criaremos a interface Repositorio
    }
}
