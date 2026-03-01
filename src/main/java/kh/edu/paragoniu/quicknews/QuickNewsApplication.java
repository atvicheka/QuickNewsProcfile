package kh.edu.paragoniu.quicknews;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class QuickNewsApplication {
    @RestController
    public class HelloController {

        @GetMapping("/")
        public String hello() {
            return "Hello World!";
        }
    }

    public static void main(String[] args) {
        SpringApplication.run(QuickNewsApplication.class, args);
    }

}
