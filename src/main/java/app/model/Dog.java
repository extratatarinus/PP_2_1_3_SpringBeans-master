package app.model;

import org.springframework.stereotype.Component;

@Component
public class Dog extends Animal {
    private final String animalSaying;

    public Dog(String saying) {
        this.animalSaying = saying;
    }

    @Override
    void say() {
        System.out.println(animalSaying);
    }

    @Override
    public String toString() {
        return "Im a Dog";
    }
}
