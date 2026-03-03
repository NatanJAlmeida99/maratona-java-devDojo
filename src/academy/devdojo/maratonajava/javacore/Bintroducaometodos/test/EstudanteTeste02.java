package academy.devdojo.maratonajava.javacore.Bintroducaometodos.test;

import academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio.Estudante;

public class EstudanteTeste02 {
    public static void main(String[] args) {
        Estudante student01 = new Estudante();
        Estudante student02 = new Estudante();

        student01.nome = "Midoriya";
        student01.idade = 15;
        student01.sexo = 'M';

        student02.nome = "Sakura";
        student02.idade = 16;
        student02.sexo = 'F';

        student01.imprime();
        student02.imprime();
    }
}
