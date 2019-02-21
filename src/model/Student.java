package model;

public class Student extends Person{
    private Klass klass;

    public Student(int id, String name, int age, Klass klass) {
        super(id, name, age);
        this.klass = klass;
    }

    @Override
    public String introduce() {
        if(this.klass.getLeader().getId() == this.id) {
            return super.introduce()+"I am a student.I am leader of class"+this.klass+".";
        }
        return super.introduce()+"I am a student.I am at class"+this.klass+".";
    }
}

