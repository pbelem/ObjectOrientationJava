package entities;

public class Person {

    private String namePerson;
    private int agePerson;
    private boolean genderPerson;

    public Person(String namePerson, int agePerson, boolean genderPerson) {
        this.namePerson = namePerson;
        this.agePerson = agePerson;
        this.genderPerson = genderPerson;
    }

    public String getNamePerson() {
        return namePerson;
    }

    public void setNamePerson(String namePerson) {
        this.namePerson = namePerson;
    }

    public int getAgePerson() {
        return agePerson;
    }

    public void setAgePerson(int agePerson) {
        this.agePerson = agePerson;
    }

    public boolean isGenderPerson() {
        return genderPerson;
    }

    public void setGenderPerson(boolean genderPerson) {
        this.genderPerson = genderPerson;
    }
}
