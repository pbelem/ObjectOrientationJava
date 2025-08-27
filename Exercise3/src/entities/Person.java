package entities;

public class Person {

    private String namePerson;
    private static double heightPerson;
    private static boolean sexMale;

    public Person(String namePerson, double heightPerson, boolean sexMale) {
        this.namePerson = namePerson;
        heightPerson = heightPerson;
        sexMale = sexMale;
    }

    public String getNamePerson() {
        return namePerson;
    }

    public void setNamePerson(String namePerson) {
        this.namePerson = namePerson;
    }

    public double getHeightPerson() {
        return heightPerson;
    }

    public void setHeightPerson(double heightPerson) {
        Person.heightPerson = heightPerson;
    }

    public boolean isSexMale() {
        return sexMale;
    }

    public void setSexMale(boolean sexMale) {
        Person.sexMale = sexMale;
    }

    public static double idealWeight(boolean sexMale, double heightPerson) {
        if (sexMale) {
            return (72.7 * heightPerson) - 58;
        } else {
            return (62.1 * heightPerson) - 44.7;
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Name: " + namePerson + "\n").append("Weight: " + Person.idealWeight(isSexMale(), getHeightPerson()) + "\n");
        return sb.toString();
    }
}