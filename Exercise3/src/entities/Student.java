package entities;

import calculator.MathOperations;

public class Student {

    private String nameStudent;
    private double firstScoreStudent;
    private double secondScoreStudent;
    private double thirdScoreStudent;

    public Student() {
        super();
    }

    public Student(String nameStudent, double firstScoreStudent, double secondScoreStudent, double thirdScoreStudent) {
        this.nameStudent = nameStudent;
        this.firstScoreStudent = firstScoreStudent;
        this.secondScoreStudent = secondScoreStudent;
        this.thirdScoreStudent = thirdScoreStudent;
    }

    public String getNameStudent() {
        return nameStudent;
    }

    public void setNameStudent(String nameStudent) {
        this.nameStudent = nameStudent;
    }

    public double getFirstScoreStudent() {
        return firstScoreStudent;
    }

    public void setFirstScoreStudent(double firstScoreStudent) {
        this.firstScoreStudent = firstScoreStudent;
    }

    public double getSecondScoreStudent() {
        return secondScoreStudent;
    }

    public void setSecondScoreStudent(double secondScoreStudent) {
        this.secondScoreStudent = secondScoreStudent;
    }

    public double getThirdScoreStudent() {
        return thirdScoreStudent;
    }

    public void setThirdScoreStudent(double thirdScoreStudent) {
        this.thirdScoreStudent = thirdScoreStudent;
    }

    public double averageScore(double score1, double score2, double score3) {
        return MathOperations.averageOfThree(firstScoreStudent, secondScoreStudent, thirdScoreStudent);
    }
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("NameStudent: " + nameStudent).append("\n").append("Average score: " + averageScore(firstScoreStudent, secondScoreStudent, thirdScoreStudent)).append("\n");
        return sb.toString();
    }
}