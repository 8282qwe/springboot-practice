package ex02.runner;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;

import java.util.Map;

public class HelloWorldRunner implements ApplicationRunner {
    private Map<?,?> map;

    public HelloWorldRunner(Map<?, ?> map) {
        this.map = map;
    }

    @Override
    public void run(ApplicationArguments args) throws Exception {
        System.out.println("ExApplication runs... " + map.get("greeting"));
    }
}
