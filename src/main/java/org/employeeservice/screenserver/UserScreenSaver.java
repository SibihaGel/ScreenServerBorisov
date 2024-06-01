package org.employeeservice.screenserver;


//import lombok.Setter;
import org.springframework.stereotype.Component;

//@Setter
@Component
public class UserScreenSaver {

    private String name;

    public UserScreenSaver() {
        System.out.println("bean user screen saver");
    }

    public UserScreenSaver(String name) {
        System.out.println("bean user screen saver");
    }


    public void print() {
        System.out.println("Bean UserScreenSaver");
    }
}