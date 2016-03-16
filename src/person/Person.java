package person;

import java.util.List;

public class Person {

    String name;
    String email;
    List<Skill> skillSet;

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

    public void addSkill(Skill skill) {}
}
