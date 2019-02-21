import model.Person;
import model.Student;
import model.Class;
import model.Teacher;

public class Main {
    public static void main(String[] args) {
        Person person = new Person(1, "Tom", 21);
        System.out.println(person.getName());
        System.out.println(person.getAge());
        System.out.println(person.introduce());

        Class klass = new Class(2);
        Student student = new Student(1, "Tom", 21, klass);
        System.out.println(student.introduce());

        klass.assignLeader(student);
        System.out.println(student.introduce());

        Class[] classes = {new Class(2), new Class(3)};
        Teacher teacher = new Teacher(1, "Tom", 21, classes);
        System.out.println(teacher.introduce());

    }
}
