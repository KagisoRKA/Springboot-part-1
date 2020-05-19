package com.springboot.springboot.part1.DAO;
import com.springboot.springboot.part1.Model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import java.util.ArrayList;
@Repository
public class FakeRepo implements FakeRepoInterface {
    @Autowired
    static ArrayList<User> users = new ArrayList<>();
    @Override
    public String insertUser(long id, String name, String surname){
        users.add(new User(id, name, surname));
        return name + " entered";
    }
    @Override
    public String findUserById(long Id) {
        for(User user:users){
            long userId = user.getId();
            if(userId == Id){
                return "Hello "+user.getName();
            }
        }
        return null;
    }
    @Override
    public String deleteUser(long Id) {
        for (User user:users){
            long userId = user.getId();
            if(userId == Id){
                users.remove(user);
                return user.getName()+" removed";
            }
        }
        return null;
    }
}