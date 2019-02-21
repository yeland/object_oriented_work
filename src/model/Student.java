package model;

public class Student extends Person{
    private int klass;

    public Student(int id, String name, int age, int klass) {
        super(id, name, age);
        this.klass = klass;
    }

    @Override
    public String introduce() {
        return super.introduce()+"I am at class"+klass+".";
    }
}

