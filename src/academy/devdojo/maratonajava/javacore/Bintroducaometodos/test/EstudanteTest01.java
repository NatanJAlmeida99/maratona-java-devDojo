package academy.devdojo.maratonajava.javacore.Bintroducaometodos.test;

import academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio.Estudante;
import academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio.ImpressoraEstudante;

public class EstudanteTest01 {
    public static void main(String[] args) {
        Estudante student01 = new Estudante();
        Estudante student02 = new Estudante();
        ImpressoraEstudante printer = new ImpressoraEstudante();

        student01.nome = "Midoriya";
        student01.idade = 15;
        student01.sexo = 'M';

        student02.nome = "Sakura";
        student02.idade = 16;
        student02.sexo = 'F';

        printer.imprime(student01);
        printer.imprime(student02);
    }

}
