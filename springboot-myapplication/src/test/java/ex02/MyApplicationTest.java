package ex02;

import ex02.component.MyComponent;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;

import static org.junit.jupiter.api.Assertions.assertNotNull;

@SpringBootTest
class MyApplicationTest {
    @Autowired
    private ApplicationContext applicationContext;

    @Test
    public void testMyComponentNotNull() {
        MyComponent myComponent = applicationContext.getBean("MyComponent", MyComponent.class);
        assertNotNull(myComponent);
    }
}