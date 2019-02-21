package model;

public class Klass {
    private int number;
    private Student leader;

    public Klass(int number) {
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
        if(leader.getKlass().number!= this.number) {
            System.out.println("It is not one of us.");
        } else {
            this.leader = leader;
        }
    }

    public void appendMember(Student student) {
        student.setKlass(this);
    }
}
