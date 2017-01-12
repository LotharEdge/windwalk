package xyz.x20a.windwalk.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * Created by crl on 16/12/29.
 */

@EnableAutoConfiguration
@ComponentScan(basePackages = "xyz.x20a.windwalk")
@Configuration
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}
