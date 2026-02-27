package Maratona_java_javacore.Bintroducao.metodos.dominio;
public class Funcionario_exe {
    public String nome = null;
    public int idade = 0;
    public double[] salarios = null;

    public void imprime() {
        System.out.println(this.nome);
        System.out.println(this.idade);
        //System.out.println(this.salarios); forma errada -> retorna o endereço do array
        if (salarios == null) {
            return;
        }
        for (double salario : salarios) {
            System.out.println(salario);
        }
        mediaSalarios();
    }
    public void mediaSalarios() {
        if (salarios == null) { //Se salarios não for inicializado
            return;
        }
        double media = 0;
        for (double salario : salarios) {
            media += salario;
        }
        media = media / salarios.length;
        System.out.println("A média salarial desse vendedor nesses " + salarios.length + " meses foi de: " + media);
    }
}
