package person;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Person implements Serializable{

    String name;
    String email;
    List<Skill> skillSet = new ArrayList<>();

    public Person(String name, String email) {
        this.name = name;
        this.email = email; }

    public Person() {}

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public List<Skill> getSkillSet() {
        return skillSet;
    }
    public void setSkillSet(List<Skill> skillset) {
        this.skillSet = skillSet;
    }

    public void addSkill(Skill skill) {skillSet.add(skill);}

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", skillSet=" + skillSet +
                '}';
    }
}
