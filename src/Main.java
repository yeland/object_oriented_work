import model.Person;
import model.Student;
import model.Class;

public class Main {
    public static void main(String[] args) {
        Person person = new Person(1, "Tom", 21);
        System.out.println(person.getName());
        System.out.println(person.getAge());
        System.out.println(person.introduce());

        Class klass = new Class(2);
        Student student = new Student(1, "Tom", 21, klass);
        System.out.println(student.introduce());

    }
}
