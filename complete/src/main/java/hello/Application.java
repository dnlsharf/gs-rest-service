package hello;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

// To run the app: mvn spring-boot:run
// OR java -jar target/gs-rest-service-0.1.0.jar
// To access your app in a browser: http://localhost:8080/greeting?name=User
@SpringBootApplication
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}
