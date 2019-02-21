package model;

public class Student extends Person {
    private Class klass;

    public Student(int id, String name, int age, Class klass) {
        super(id, name, age);
        this.klass = klass;
    }

    public Class getKlass() {
        return this.klass;
    }

    public void setKlass(Class klass) {
        this.klass = klass;
    }

    @Override
    public String introduce() {
        if (this.klass.getLeader().getId() == this.id) {
            return super.introduce() + "I am a student.I am leader of class" + this.klass + ".";
        }
        return super.introduce() + "I am a student.I am at class" + this.klass + ".";
    }
}

