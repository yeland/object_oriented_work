package model;

public class Teacher extends Person {
    private Class[] classes;

    public Teacher(int id, String name, int age, Class[] classes) {
        super(id, name, age);
        this.classes = classes;
    }

    public Class[] getClasses() {
        return this.classes;
    }

    public void setClasses(Class[] classes) {
        this.classes = classes;
    }

    public void setTeacherForClasses() {
        for (int i = 0;i<this.classes.length;i++) {
            this.classes[i].setTeacher(this);
        }
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
        for (Class klass: classes) {
            if(isIn(student,klass)){
                return true;
            }
        }
        return false;
    }

    public boolean isIn(Student student, Class klass) {
        if(student.getKlass().getNumber() == klass.getNumber()) {
            return true;
        }
        return false;
    }


}
