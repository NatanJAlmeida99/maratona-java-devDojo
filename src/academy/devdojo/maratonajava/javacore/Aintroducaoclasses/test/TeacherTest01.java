package academy.devdojo.maratonajava.javacore.Aintroducaoclasses.test;

import academy.devdojo.maratonajava.javacore.Aintroducaoclasses.dominio.Teacher;

public class TeacherTest01 {
    public static void main(String[] args) {
        Teacher teacher = new Teacher();
        teacher.nome = "Mestre Kami";
        teacher.age = 140;
        teacher.sex = 'M';
        System.out.println("Name: " + teacher.age + " Age: " + teacher.nome + " Sex: " + teacher.sex);
    }
}
