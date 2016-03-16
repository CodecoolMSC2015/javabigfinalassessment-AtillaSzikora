package server;

import person.Person;
import person.Skill;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Arrays;
import java.util.List;
import java.util.Set;

public class CSVDataReader extends DataReader {

    static String csvFilePath = "C:\\Users\\Szikora Atilla\\IdeaProjects\\javabigfinalassessment-AtillaSzikora\\Documentation\\persons.csv";
    List<Person> persons;
    BufferedReader br;
    String csvLine;
    String[] lineArray;

    public CSVDataReader(String csvFilePath) {
        try {
            br = new BufferedReader(new FileReader(csvFilePath));
            csvLine = br.readLine();
                lineArray = csvLine.split(",");
                Person person = new Person(lineArray[0], lineArray[1]);
                Skill skill = new Skill(lineArray[2], lineArray[3]);
                person.addSkill(skill);
                persons.add(person);
            } catch (Exception e) {e.printStackTrace();} }

    @Override
    public Set<Person> getPersons(String searchCriteria, SearchType searchType) {
        return super.getPersons(searchCriteria, searchType); }

    public static void main(String[] args) {new CSVDataReader(csvFilePath);}
}