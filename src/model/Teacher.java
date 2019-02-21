package model;

public class Teacher extends Person {
    private Klass[] classes;

    public Teacher(int id, String name, int age, Klass[] classes) {
        super(id, name, age);
        this.classes = classes;
    }

    public Klass[] getClasses() {
        return this.classes;
    }

    public void setClasses(Klass[] classes) {
        this.classes = classes;
    }

    public String introduce() {
        if (classes.length == 0) {
            return super.introduce()+"I am a Teacher.I teach No Class.";
        }
        return super.introduce()+"I am a Teacher.I teach Class" + getClassesNumber();
    }

    public String getClassesNumber() {
        String[] classesNumber = new String[this.classes.length];
        for (int i = 0; i<this.classes.length;i++) {
            Integer number = this.classes[i].getNumber();
            classesNumber[i] = number.toString();
        }
        return String.join(",",classesNumber);
    }

    public boolean isTeaching(Student student) {
        for (Klass klass: classes) {
            if(isIn(student,klass)){
                return true;
            }
        }
        return false;
    }

    public boolean isIn(Student student, Klass klass) {
        if(student.getKlass().getNumber() == klass.getNumber()) {
            return true;
        }
        return false;
    }
}
