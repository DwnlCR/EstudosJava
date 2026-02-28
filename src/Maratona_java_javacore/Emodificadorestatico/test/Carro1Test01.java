package Maratona_java_javacore.Emodificadorestatico.test;
import Maratona_java_javacore.Emodificadorestatico.dominio.Carro1;

public class Carro1Test01 {
    public static void main(String[] args) {
        Carro1 carro1 = new Carro1("BMW", 280);
        Carro1 carro2 = new Carro1("Mercedes", 275);
        Carro1 carro3 = new Carro1("Audi", 290);
        //Todos os 3 objetos criados acima tem algo em comum
        //que é a lei de que todos esses carros não podem passar da sua velocidade limite
        //em seus contadores de 250, porem em todos eles sua velocidadeMaxima é > velocidadeLimite
        //e ate então esta tudo bem, mas temos um problema
        //Queremos fazer com que a velocidade limite seja a mesma para os 3 carros
        //para q seja justo então vamos ao codigo fonte para ver isso
        carro1.setVelocidadeLimite(270); //Eu posso apenas vir aqui e editar a velocidade limite da minha BMW
        //fazendo com que ela esteja fora da lei de padronização de limite de velocidade
        //poderiamos apenas retirar o nosso set que acessa os valores e pode altera-los como fizemos em aulas passadas
        //mas tambem temos uma forma nova, muito melhor e muito mais eficaz de fazer isso
        //e é nessa aula que iremos aprender isso

        //Agora que fizemos as ediçoes necessarias teremos que, se quisermos alterar a velocidade limite de um carro
        //teremos que fazer o mesmo com os outros tambem, afinal isso tem q ser justo
        //e faremos essas alterações todas de uma vez somente usando o comando abaixo com as alterações feitas na classe principal
        Carro1.velocidadeLimite = 270; //Isso vai dar erro pois atualmente nossa velocidadeLimite esta privada
        //vamos transforma-la em publica
        carro1.imprime();
        carro2.imprime();
        carro3.imprime();
    }
}
