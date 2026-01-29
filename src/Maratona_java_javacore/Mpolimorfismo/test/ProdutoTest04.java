package Maratona_java_javacore.Mpolimorfismo.test;

import Maratona_java_javacore.Mpolimorfismo.repositorio.Repositorio;
import Maratona_java_javacore.Mpolimorfismo.repositorio.RepositorioArquivo;
import Maratona_java_javacore.Mpolimorfismo.repositorio.RepositorioBancoDeDados;
import Maratona_java_javacore.Mpolimorfismo.repositorio.RepositorioMemoria;

public class ProdutoTest04 {
    //Agora vamos testar para ver se o que criamos esta funcionando
    public static void main(String[] args) {
        //Vamos testar dessa forma especifica pq é a mais simples para ver se esta tudo dando certo
        RepositorioBancoDeDados repositorio1 = new RepositorioBancoDeDados();
        repositorio1.salvar();
        //Ta mais ainda sim, vamos lembrar da aula anterior, eu n posso fazer aquele negocio de usar um X pai generico para mostrar todas as subclasses advindas desse X generico não ;-;? e a resposta é sim hehe, podemos fazer isso, olha aqui
        Repositorio repositorio2 = new RepositorioMemoria();
        repositorio2.salvar();
        Repositorio repositorio3 = new RepositorioArquivo();
        repositorio3.salvar();
        //Bingo, funcionou hehe :) e vc pode achar isso bobo a principio, mas futuramente se vc tiver interesse ao se aprofundar no java, pode ter certeza que esse conceito vai se repetir inumeras vezes em todos os dias da sua vida
    }
}
