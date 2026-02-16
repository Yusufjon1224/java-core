package oop.inheritance.obj;

public class Main extends Object {

    public static void main(String[] args) {

        Student digo = new Student("Digo", 21);
        System.out.println(digo.toString());

        PrimarySchoolStudents siroj = new PrimarySchoolStudents("Sirojiddin", 9, "Imira");
        System.out.println(siroj);
    }
}

class Student {

    private String name;
    private int age;

    // Constructor
    Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

//    @Override
//    public String toString() {
//        return super.toString();
//    }


    @Override
    public String toString() {
        return name + " is " + age + " years old ";
//        return "Student{" +
//                "name='" + name + '\'' +
//                ", age=" + age +
//                '}';
    }
}

class PrimarySchoolStudents extends Student{

    private String parentName;

    //Constructor
    PrimarySchoolStudents(String name, int age, String parentName) {
        super(name, age);
        this.parentName = parentName;
    }

    @Override
    public String toString() {
        return parentName + "'" +
                "s kid, " + super.toString();
    }
}