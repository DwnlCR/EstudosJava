package Maratona_java_javacore.Bintroducao.metodos.test;
import Maratona_java_javacore.Bintroducao.metodos.dominio.Funcionario;
public class FuncionarioTest01{
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario();
        funcionario.setNome("Sanji"); //Alterações -> De funcionario.nome = "Sanji"; para funcionario.setNome("Sanji");
        funcionario.setIdade(24); //Alterações -> De funcionario.idade = 24; para funcionario.setIdade(24);
        funcionario.setSalarios(new double[] {1550, 890.50, 3040.75, 5000});
        //Alterações -> De funcionario.salarios = new double[] {1550, 890.50, 3040.75, 5000};
        //para funcionario.setSalarios(new double[] {1550, 890.50, 3040.75, 5000});

        funcionario.imprime();
        //Podemos também ver a media atravez do get :)
        System.out.println("Ver media pelo get: "+funcionario.getMedia());
        //Porem temos um problema :( dessa forma tambem conseguimos alterar o valor de media usando funcionario.setMedia(Algum valor)
        //e isso n pode acontecer :(
        //por exemplo: funcionario.setMedia(90000);
        //System.out.println("Ver media pelo get: "+funcionario.getMedia()+" :(");
        //Por isso que faremos o seguinte vamos nos livrar do metodo setMedia pois so precisamos do seu get ;)
    }
}
