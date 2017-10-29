package uk.co.britishgas.httpstudent;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBootHttpStudentApplication {

    public static void main(String[] args) {

        SpringApplication.run(
                new Object[] { SpringBootHttpStudentApplication.class }, args);
    }
}
