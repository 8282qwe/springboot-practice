package ex02;

import ex02.runner.HelloWorldRunner;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;

import java.util.Map;

@SpringBootApplication // Meta 어노테이션 (어노테이션에 어노테이션이 달려있음)
public class ExApplication { // Bootstrapping Class

    @Bean
    public Map<?,?> myMap() {
        return Map.of("greeting", "Hello World");
    }

    @Bean
    public ApplicationRunner applicationRunner() {
        return new HelloWorldRunner(myMap());
    }

    public static void main(String[] args) {
        ConfigurableApplicationContext ac = SpringApplication.run(ExApplication.class, args);
    }
}
