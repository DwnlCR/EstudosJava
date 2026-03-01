package Maratona_java_javacore.Fassociacao.test;
import Maratona_java_javacore.Fassociacao.dominio.Equipe;
import Maratona_java_javacore.Fassociacao.dominio.Participante;

public class ParticipanteTest01 {
    public static void main(String[] args) {
       //Basicamente como estamos usando Associação bidirecionais não importa se criamos um objeto primeiro que o outro
        //ja que os 2 funcionam como o Objeto principal
        Participante participante1 = new Participante("Joãozinho");
        Participante participante2 = new Participante("Juquinha");
        Equipe equipeClash = new Equipe("Grupo do Clash");
        Participante [] participantes = {participante1, participante2};//Estou basicamente criando um array de clash dizendo que
        //Joaozinho e Juquinha pertence a equipe Grupo do Clash
        //Agora faremos o referenciamento entre objetos para que eles tenham uma relação entre si
        participante1.setEquipe(equipeClash);
        participante2.setEquipe(equipeClash);
        equipeClash.setParticipantes(participantes);
        //Nesse momento irei exemplificar o que significa Associação bidirecional
        //antes tinhamos apenas uma Classe onde o imprime poderia ser chamado pois somente ela tinha todas as informações
        //mas agora as nossas 2 classes relacionadas entre si podem chamar esse metodo justamente pela Associação bidirecional
        System.out.println("--- Paticipantes ---");
        participante1.imprime();//Podemos usar participante para chamar o metodo imprime pois ele tem todas as informações necessarias
        System.out.println("--- Equipe ---");
        equipeClash.imprime();//Mas tambem podemos usar a equipe para chamar o metodo imprime pois ela tambem tem todas as informações necessarias
        //recomendo esse pq usa menos linhas de codigo e não repete o nome da equipe sempre
    }
}
