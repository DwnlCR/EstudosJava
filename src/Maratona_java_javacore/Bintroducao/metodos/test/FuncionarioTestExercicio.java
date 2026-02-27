package Maratona_java_javacore.Bintroducao.metodos.test;

import Maratona_java_javacore.Bintroducao.metodos.dominio.Funcionario_exe;

public class FuncionarioTestExercicio {
    public static void main(String[] args) {
        Funcionario_exe funcionario = new Funcionario_exe();
        funcionario.nome = "Sanji";
        funcionario.idade = 24;
        funcionario.salarios = new double[] {1550, 890.50, 3040.75, 5000};

        funcionario.imprime();
    }
}
