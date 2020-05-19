package com.springboot.springboot.part1;
import com.springboot.springboot.part1.DAO.FakeRepo;
import com.springboot.springboot.part1.Service.UserServiceImpl;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
@SpringBootApplication
public class SpringbootPart1Application {
	public static void main(String[] args) {
		SpringApplication.run(SpringbootPart1Application.class, args);
//		UserServiceImpl user = new UserServiceImpl();
//		System.out.println(user.addUser(1,"David","Beckham"));
//		System.out.println(user.getUser(1));
//		System.out.println(user.removeUser(1));
		FakeRepo fRobj = new FakeRepo();
		System.out.println(fRobj.insertUser(1,"Kagiso","Raseroka"));
		System.out.println(fRobj.insertUser(2,"John","Doe"));
		System.out.println(fRobj.insertUser(3,"Samuel","Eto'o"));
		System.out.println(fRobj.findUserById(3));
		System.out.println(fRobj.deleteUser(2));
	}
}