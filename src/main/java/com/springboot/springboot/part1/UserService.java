package com.springboot.springboot.part1;
public interface UserService {
    public String addUser(long Id, String name, String surname);
    public String removeUser(long Id);
    public String getUser(long Id);
}