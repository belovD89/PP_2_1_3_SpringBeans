package app.model;

import org.springframework.stereotype.Component;

@Component                   // указание, что класс является компонентом управляемым контейнером Spring
public class Dog extends Animal {
    @Override
    public String toString() {
        return "Im a Dog";
    }
}
