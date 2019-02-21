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

        Class[] classes = {klass, new Class(3)};
        Teacher teacher = new Teacher(1, "Tom", 21, classes);
        System.out.println(teacher.introduce());

        Teacher anotherTeacher = new Teacher(1, "Mary", 22, new Class[0]);
        System.out.println(anotherTeacher.introduce());

        Class anotherClass = new Class(3);
        anotherClass.assignLeader(student);

        teacher.setTeacherForClasses();
        klass.assignLeader(student);

        Student anotherStudent = new Student(2, "Jerry", 21, anotherClass);
        klass.appendMember(anotherStudent);

    }
}
