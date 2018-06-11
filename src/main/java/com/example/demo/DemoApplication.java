package com.example.demo;


import com.example.demo.data.models.Person;
import com.example.demo.data.repo.PersonRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.Banner;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication implements CommandLineRunner {

    @Autowired
    private PersonRepo personRepo;

    public static void main(String[] args) {
        //disabled banner, don't want to see the spring logo
        SpringApplication app = new SpringApplication(DemoApplication.class);
        app.setBannerMode(Banner.Mode.OFF);
        app.run(args);


    }

    @Override
    public void run(String... args) throws Exception {

        Person person = new Person();
        person.setName("person 1");
        person.setAddress("address 1");
        person.setIsGroup((byte)0);
        personRepo.save(person);

        person = new Person();
        person.setName("person 2");
        person.setAddress("address 2");
        person.setIsGroup((byte)0);
        personRepo.save(person);

        personRepo.findAll();
    }
}
