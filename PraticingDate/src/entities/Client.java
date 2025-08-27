package entities;

import java.util.Date;

public class Client {

    String nameClient;
    String emailClient;
    Date birthDate;

    Client client;

    public Client() {
    }

    public Client(String name, String email, Date birthDate) {
        this.nameClient = name;
        this.emailClient = email;
        this.birthDate = birthDate;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }

    public String getEmailClient() {
        return emailClient;
    }

    public void setEmailClient(String emailClient) {
        this.emailClient = emailClient;
    }

    public String getNameClient() {
        return nameClient;
    }

    public void setNameClient(String nameClient) {
        this.nameClient = nameClient;
    }
}