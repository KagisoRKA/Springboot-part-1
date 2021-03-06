package com.springboot.springboot.part1.Service;
import com.springboot.springboot.part1.DAO.FakeRepo;
import org.springframework.beans.factory.annotation.Autowired;

public class UserServiceImpl implements UserService {
    //dependency injection
    @Autowired
    private FakeRepo fakeRepo;
    @Override
    public String addUser(long Id, String name, String surname) {
        fakeRepo = new FakeRepo();
        return fakeRepo.insertUser(Id, name, surname);
    }
    @Override
    public String getUser(long Id) {
        fakeRepo = new FakeRepo();
        return fakeRepo.findUserById(Id);
    }
    @Override
    public String removeUser(long Id) {
        fakeRepo = new FakeRepo();
        return fakeRepo.deleteUser(Id);
    }
}