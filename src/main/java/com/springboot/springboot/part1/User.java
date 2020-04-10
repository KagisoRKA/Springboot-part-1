package com.springboot.springboot.part1;
public class User {
    private long Id;
    private String name;
    private String surname;
    public User(long Identity, String Name, String Surname){
        this.Id = Identity;
        this.name = Name;
        this.surname = Surname;
    }
    public long getId() {
        return Id;
    }
    public String getName() {
        return name;
    }
    public String getSurname() {
        return surname;
    }
    public void setId(long id) {
        Id = id;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setSurname(String surname) {
        this.surname = surname;
    }
}