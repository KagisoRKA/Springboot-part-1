package com.springboot.springboot.part1;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import static org.junit.jupiter.api.Assertions.*;
@SpringBootTest
class UserServiceImplTest {
    UserServiceImpl user = new UserServiceImpl();
    @Test
    void addUser() {
        assertEquals("David entered",user.addUser(1,"David","Samuels"));
    }
    @Test
    void getUser() {
        //adding a user before use of getUser() method
        user.addUser(1,"David","Samuels");
        assertEquals("Hello David",user.getUser(1));
    }
    @Test
    void removeUser() {
        //adding a user before use of removeUser() method
        user.addUser(1,"David","Samuels");
        assertEquals("David removed",user.removeUser(1));
    }
}