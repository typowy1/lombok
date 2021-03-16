package pl.javastart.lombok;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class LombokApplication {

    public static void main(String[] args) {

        ConfigurableApplicationContext context = SpringApplication.run(LombokApplication.class, args);
        UserServiece bean = context.getBean(UserServiece.class);
        User user = bean.createUser();

        System.out.println(user);
    }

}
