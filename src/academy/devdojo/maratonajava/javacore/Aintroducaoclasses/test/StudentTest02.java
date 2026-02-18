package academy.devdojo.maratonajava.javacore.Aintroducaoclasses.test;

import academy.devdojo.maratonajava.javacore.Aintroducaoclasses.dominio.Student;

public class StudentTest02 {
    public static void main(String[] args) {
        Student student = new Student();
        Student student2 = new Student();

        student.nome = "Sanji";
        System.out.println(student.age);
        System.out.println(student.sex);
        System.out.println(student.nome);

        System.out.println("-----------------");

        System.out.println(student2.age);
        System.out.println(student2.sex);
        System.out.println(student2.nome);
    }
}
