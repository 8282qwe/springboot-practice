package ex01;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.context.annotation.Bean;

@SpringBootConfiguration
public class MyApplication01 {

    @Bean("MyComponent01")
    public MyComponent myComponent(){
        return new MyComponent();
    }

    public static void main(String[] args) {
        SpringApplication.run(MyApplication01.class, args);
    }
}
