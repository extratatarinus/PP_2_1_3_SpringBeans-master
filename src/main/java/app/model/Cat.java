package app.model;

import org.springframework.stereotype.Component;

@Component
public class Cat extends Animal {
    private String saing;

    public Cat(String saing) {
        this.saing = saing;
    }

    @Override
    void say() {
        System.out.println(saing);
    }

    @Override
    public String toString() {
        return "Im a Cat";
    }

}
