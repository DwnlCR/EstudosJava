package Maratona_java_javacore.Kclasses_abstratas.test;

import Maratona_java_javacore.Kclasses_abstratas.dominio.Desenvolvedor;
import Maratona_java_javacore.Kclasses_abstratas.dominio.Funcionario;
import Maratona_java_javacore.Kclasses_abstratas.dominio.Gerente;

public class FuncionarioTest01 {
    public static void main(String[] args) {
        //Antes do abstract -> 2 linhas a baixo não comentadas, Depois do abstract 2 linhas a baixo comentadas, o construtor de Funcionario não pode mais ser utilizado
        //Funcionario funcionario = new Funcionario("Joãozin da quebrada", 2500); //Apos o abstract: Encontramos o erro, mas pq q ta dando erro mermo ;-;?, é simples, a partir do momento em que usamos o abstract na classe Funcionario, ela n pode mais construir funcionarios, pq ela n pode fazer mais nada concreto, tudo em q ela pode ser utilizada agr é ser referencia extendida para outras novas classes filhas.
        //System.out.println(funcionario);
        //Ta funcionando, mas temos um problema, aqui estamos apenas dizendo q ele é um funcionario, mas ele é o q mais alem d funcionario ;-;? qual o cargo dele?
        //Vamos dizer q o Joãozin da quebrada é o gerente da empresa, ou seja, vamos criar uma nova classe gerente para herdar funncionario e seus atributos -> Criar Gerente

        //Criamos a classe Gerente agr vamo ver se vai
        Gerente gerente = new Gerente("Joãozin da quebrada", 2500);
        System.out.println(gerente);
        //Ta conseguimos fazer o Joãozin da quebrada ser um gerente, mas ainda sim estamos dizendo q ele é apenas um funcionario, mas n qremos isso, qremos q mostre q ele é o gerente dessa bagaça toda
        //O q descobrimos aq é q Gerente é apenas um funcionario só q especializado em gestão, mas se sabemos q todos nessa empresa são funcionarios pra q q a gente vai mostra q eles são funcionarios? n é melhor só mostrar o q eles são d vdd nn ;-;? então o q vamos fazer é impedir q mais Funcionarios sem cargo sejam criados mas que Funcionarios com cargos herdem as funcionalidades de Funcionario e tenham cada um a sua formação.
        //Vamos fazer isso usando o nosso novo conceito hehe, classes abstratas, a forma de classes advindas de um escopo de classe padrão, vamo ver como q isso funciona d verdade agora -> Funcionario

        //Apos a chegada do abstract em Funcionario -> linha 8
        //Agora vamos ver se ao chamarmos o metodo toString para gerente vai dar tudo certo
        System.out.println(gerente);
        //Continua dizendo Funcionario em vez de gerente ;-;, a gente tem q tirar aql toString sobreescrito de funcionario e colocar ele em gerente, vamos fazer isso

        //Pronto, alteramos o toString, retiramos ele de Funcionario, colocamos em gerente e mudamos a nomenclatura apresentada, agr vamo rodar p ver se deu tudo certo :)
        //E num é q deu certo mermo hehe, agr vamos criar uma nova classe para testar novamente, q tal -> Criar Desenvolvedor

        //Criamos nosso novo tipo de Funcionario com cargo de Desenvolvedor, agora vamos atribuir um nome e um salario a cada pessoa q trabalha nessa area
        Desenvolvedor dev = new Desenvolvedor("Gustavo", 1000); //A situação financeira dos desenvolvedor ta triste, agr vamo ver se deu certo
        System.out.println(dev);
        //Pronto agora sim está tudo correto

        //Abstract em metodos

        //Agora que sabemos utilizar o abstract em classes, vamos aprender a utilizar esse mesmo abstract em metodos, ou seja, criar metodos q irão servir apenas como referencia ou base para outros metodos
        //Nesse caso iremos fazer um metodo que retorne o bonus no salario de cada Funcionario, afinal, a partir do momento q vc é um funcionario de cargo diferente de outro funcionario o bonus é diferente tambem -> Funcionario

        //Terminamos o metodo calculaBonus para ambas classes filhas de Funcionario, os desenvolvedores agora recebem 15% e os gerentes recebbem 20% a mais em seus salarios, na verdade não, pois tanto Gerente como Desenvolvedor são filhas de Funcionario, ou seja, Desenvolvedor está recebendo 15% de bonus por ser desenvolvedor + 10% apenas por ser um funcionario, o mesmo para gerente, e não queremos isso, vamos ver agora o q faremos para resolver isso -> Funcionario
        //Mas vc ja percebeu que a gente n ta mais usando o metodo calcularBonus em Funcionario? e q sua unica utilidade é servir de exemplo para suas classes filhas? ou seja, podemos colocar um abstract lá ja q ela n vai mais ser utilizada para nada alem de fazer raiva pra gente botando dinheiro a mais onde não deve e referencia para novas futuras classes filhas -> Funcionario

        //Pronto, agora ta dando tudo certo :) o acrescimo ta vindo certinho, mas agr vamos pensar mais a fundo, antes de serem desenvolvedores e gerentes eles eram funcionarios né? mas e antes de funcionarios, eles n eram pessoas n ;-;? dito isso, vamos fazer uma classe abstrata pessoa q sera pai de funcionario e consequentemente avo de desenvolvedor e gerente -> Criar Pessoa

        //Criado a classe abstrata pessoa, ela fez com q pelo meno um filho ou os netos dela utilizassem seu metodo, pois se o filho usar o metodo automaticamente os netos herdarão esse metodo, ou podemos especificar como os netos querem usar esse metodo assim como fizemos, agr vamo testar pra ver se funciona :)

        dev.imprime();
        gerente.imprime();
        //UUUUAAAAAUUUUU I NUM É Q FUNCIONA MERMO :0, ENTÃO BASICAMENTE O Q DESCOBRIMOS AGORA É Q APESAR DO JAVA N TER EM SEU PADRÃO HERANÇAS MULTIPLAS, PODEMOS AINDA SIM FORJAR UMA HERANÇA ENCADEADA COM A FUNCIONALIDADE DE HERANÇAS MULTIPLAS, Só da um trabalhinho a mais mas da certo hehe :)


    }
}
