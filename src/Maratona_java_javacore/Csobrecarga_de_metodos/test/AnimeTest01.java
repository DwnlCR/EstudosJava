package Maratona_java_javacore.Csobrecarga_de_metodos.test;

import Maratona_java_javacore.Csobrecarga_de_metodos.dominio.Anime;

public class AnimeTest01 {
    public static void main(String[] args) {
        Anime anime = new Anime();
        //Voces n acham muito cansativo ter que sempre ter 3 linhas para setar os valores? q tal a gente criar um metodo que faz isso pela gente? :)
        //Vamos para a classe principal e criaremos nosso metodo init
        anime.init("Acchi Kocchi","Romance Escolar", 24); //Essa linha com esse metodo faz o mesmo que as 3 linhas comentadas abaixo
        //anime.setNome("Acchi Kocchi");
        //anime.setTipo("Romance Escolar");
        //anime.setEpisodios(24);
        anime.imprime();
        //Agora temos como opção o novo init de 4 parametros envolvendo o atributo ano que não tinha no metodo init passado
        anime.init("Acchi Kocchi","Romance Escolar", 24, 2018);
        //Mas nos ainda vamos fazer melhor, vamos voltar a classe principal Anime
        anime.imprime();
    }
}
