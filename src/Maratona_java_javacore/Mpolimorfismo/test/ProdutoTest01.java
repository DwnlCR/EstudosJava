package Maratona_java_javacore.Mpolimorfismo.test;

import Maratona_java_javacore.Bintroducao.metodos.dominio.Calculadora;
import Maratona_java_javacore.Mpolimorfismo.dominio.Computador;
import Maratona_java_javacore.Mpolimorfismo.dominio.Tomate;
import Maratona_java_javacore.Mpolimorfismo.servico.CalcularImposto;

public class ProdutoTest01 {
    public static void main(String[] args) {
        //Pronto, agora vamos criar alguns produtos, Computadores e Tomates
        Computador computador1 = new Computador("Notebook Samsung", 2700);
        Computador computador2 = new Computador("Notebook Acer", 3500);
        Computador computador3 = new Computador("Notebook Positivo", 1400);
        Tomate tomate1 = new Tomate("vermelho", 120);
        Tomate tomate2 = new Tomate("amarelo", 100);
        Tomate tomate3 = new Tomate("verde", 110);

        //Definimos o valor e o nome de cada computador e avaliamos o valor das caixas de tomate baseado no seu tipo, fizemos uma classe para trazer o relatorio de cada computador e tipo de tomate, agr vamo testar pra ver se o relatorio em si e o valor do imposto ta saindo certo
        // # Mas como vamos chamar a classe CalcularImposto se ela está em outro pacote e não queremos fazer um objeto só para chamar ela ;-; é ai q entra um conceito q vimos anteriormente, o conceito de static, se um metodo for estatico ele vai ser o mesmo para independente qual objeto estaremos tratando, ou seja podemos chama-lo aqui diretamente pela Chamada de classe em vez da chamada de Objeto -> vamos por um static em cada metodo que criamos em CalcularImposto
        // # agora sim podemos chamar os metodos diretamente da classe, vamos fazer isso
        CalcularImposto.calcularImpostoComputador(computador1);
        CalcularImposto.calcularImpostoComputador(computador2);
        CalcularImposto.calcularImpostoComputador(computador3);
        CalcularImposto.calcularImpostoTomate(tomate1);
        CalcularImposto.calcularImpostoTomate(tomate2);
        CalcularImposto.calcularImpostoTomate(tomate3);

        //Agora de fato vamos começar a aprender sobre o polimorfismo pq até agora só fizemos coisas que ja sabiamos, vamos criar um novo teste para exemplificar algumas coisas -> Criar ProdutoTest02
    }
}
