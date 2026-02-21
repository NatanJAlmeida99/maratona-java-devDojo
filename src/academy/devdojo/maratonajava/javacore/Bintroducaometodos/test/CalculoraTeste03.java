package academy.devdojo.maratonajava.javacore.Bintroducaometodos.test;

import academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio.Calculadora;

public class CalculoraTeste03 {
    public static void main(String[] args) {
        Calculadora cal = new Calculadora();
        double result = cal.divideDoisNumeros(20, 0);
        System.out.println(result);
        System.out.println(cal.divideDoisNumeros02(20 ,0));
        System.out.println("--------------");
        cal.imprimeDivisaoDeDoisNumeros(86, 0);
    }
}
