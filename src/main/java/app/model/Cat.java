package app.model;

import org.springframework.stereotype.Component;

@Component
public class Cat extends Animal {
    private final String animalSaying;

    public Cat(String saying) {
        this.animalSaying = saying;
    }

    @Override
    void say() {
        System.out.println(animalSaying);
    }

    @Override
    public String toString() {
        return "Im a Cat";
    }

}
