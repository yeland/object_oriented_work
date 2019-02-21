package model;

public class Class {
    private int number;
    private Student leader;
    private Teacher teacher;

    public Class(int number) {
        this.number = number;
    }


    public int getNumber() {
        return this.number;
    }

    public void setNumber(int number) {
        this.number = number;
    }


    public Student getLeader() {
        return this.leader;
    }

    public void assignLeader(Student leader) {
        if (leader.getKlass().number != this.number) {
            System.out.println("It is not one of us.");
        } else {
            this.leader = leader;
            System.out.println("I am " + this.teacher.name + ".I know " + leader.name + " has become the Leader of Class " + this.number + ".");
        }
    }

    public void appendMember(Student student) {
        student.setKlass(this);
        if (this.teacher != null) {
            System.out.println("I am " + this.teacher.name + ".I know " + student.name + " has joined Class " + this.number + ".");
        }
    }

    public Teacher getTeacher() {
        return this.teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }
}
