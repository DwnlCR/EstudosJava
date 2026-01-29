package Maratona_java_javacore.Mpolimorfismo.repositorio;

public interface Repositorio {
    //Pronto, pacote e interface criados com sucesso, agora vamos definir algum metodo a essa interface
    //Vamos criar o metodo abstrato salvar
    public abstract void salvar();
    //Mas voce concorda comigo que esse metodo salvar deve estar em muitas partes desse nosso "projeto" uma vez que temos que salvar dados em bancos de dados, salvar dados na memoria, salvar arquivos, então vamos criar um repositorio para cada um dos que eu citei no pacote servico -> criar RepositorioBancoDeDados, RepositorioMemoria, RepositorioArquivo e implementar em cada uma delas a interface Repositorio
}
