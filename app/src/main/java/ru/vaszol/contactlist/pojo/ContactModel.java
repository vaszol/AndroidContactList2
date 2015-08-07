package ru.vaszol.contactlist.pojo;

/**
 * Created by vas on 07.08.2015.
 */
public class ContactModel {
    private long id;
    private String name;
    private String lastName;
    private String mail;

    public ContactModel(long id, String name, String lastName, String mail) {
        this.id = id;
        this.name = name;
        this.lastName = lastName;
        this.mail=mail;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }
}
