package academy.devdojo.maratonajava.javacore.Bintroducaometodos.test;

import academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio.Funcionario;

public class FuncionarioTest {
    public static void main(String[] args) {
        Funcionario fun = new Funcionario();
        fun.nome = "Natan";
        fun.idade = 23;
        fun.salarios = new double[]{1200, 987.32, 2000};

        fun.imprime();
    }
}
