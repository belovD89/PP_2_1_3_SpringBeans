package app.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component      // указание, что класс является компонентом  управляемым контейнером Spring
public class AnimalsCage {

    @Autowired          //пытается найти соответствующий бин, который можно внедрить
    @Qualifier("dog")
    private Animal animal;

    @Autowired
    private Timer timer;

    public Timer getTimer() {
        return timer;
    }

    public void whatAnimalSay() {
        System.out.println("Say:");
        System.out.println(animal.toString());
        System.out.println("At:");
        System.out.println(new Timer().getTime());
        System.out.println("________________________");
    }
}
