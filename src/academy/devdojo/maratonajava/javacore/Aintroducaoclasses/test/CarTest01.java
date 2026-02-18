package academy.devdojo.maratonajava.javacore.Aintroducaoclasses.test;

import academy.devdojo.maratonajava.javacore.Aintroducaoclasses.dominio.Car;

public class CarTest01 {
    public static void main(String[] args) {
        Car car1 = new Car();
        Car car2 = new Car();

        car1.nome = "Corolla";
        car1.year = 2015;
        car1.model = "Toyota";

        car2.nome = "FlashBack";
        car2.year = 2024;
        car2.model = "FIAT";

        car2 = car1;

        System.out.println("Carro 1");
        System.out.println("Name: " + car1.nome + "\nYear: " + car1.year + "\nModel: " + car1.model);
        System.out.println("-----------------");
        System.out.println("Carro 2");
        System.out.println("Name: " + car2.nome + "\nYear: " + car2.year + "\nModel: " + car2.model);

    }
}
