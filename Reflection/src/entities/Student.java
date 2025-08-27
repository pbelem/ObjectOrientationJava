package entities;

public class Student {
    private String nameStudent;
    private int registrationStudent;

    public Student() {
    }

    public Student(String nome, int matricula) {
        this.nameStudent = nome;
        this.registrationStudent = matricula;
    }

    public String getNameStudent() {
        return nameStudent;
    }

    public int getRegistrationStudent() {
        return registrationStudent;
    }

    private void showInfo() {
        System.out.println("Student: " + nameStudent + " - " + registrationStudent);
    }

}

