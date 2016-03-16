package person;

import java.io.Serializable;

public class Skill implements Serializable {

    String name;
    String description;
    double rate;

    public Skill(String name, String description) {
        this.name = name;
        this.description = description; }

    public String getName() {
        return name;
    }
    public String getDesciption() {
        return description;
    }
    public double getRate() {
        return rate;
    }

    @Override
    public String toString() {
        return "Skill{" +
                "name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", rate=" + rate +
                '}';
    }
}
