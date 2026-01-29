package Maratona_java_javacore.Aintroducao.classes.test;

import Maratona_java_javacore.Aintroducao.classes.dominio.Professor;

public class ProfessorTest01 {
    public static void main(String[] args) {
        Professor professor = new Professor();
        professor.nome = "Mestre Kami";
        professor.idade = 78;
        professor.sexo = 'M';
        System.out.println("Nome: "+professor.nome+", Idade: "+professor.idade+" anos, Sexo: "+professor.sexo);
    }
}
