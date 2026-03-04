package academy.devdojo.maratonajava.javacore.Bintroducaometodos.test;

import academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio.Calculadora;

public class CalculadoraTest05 {
    public static void main(String[] args) {
        Calculadora cal = new Calculadora();
        int[] numeros = {1, 2, 3, 4, 5};
        cal.somaArray(numeros);
        cal.somaVarArgs(1, 2, 3, 4, 5, 6, 7);
    }
}
