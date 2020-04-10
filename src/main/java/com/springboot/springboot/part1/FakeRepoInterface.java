package com.springboot.springboot.part1;
public interface FakeRepoInterface {
    public String insertUser(long id, String name, String surname);
    public String deleteUser(long Id);
    public String findUserById(long Id);
}