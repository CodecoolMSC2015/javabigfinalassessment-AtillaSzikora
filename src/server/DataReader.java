package server;

import person.Person;
import java.util.HashSet;
import java.util.Set;

public abstract class DataReader {

    String searchCriteria;
    SearchType searchType;
    Set<Person> personsSet = new HashSet<>();

    public Set<Person> getPersons (String searchCriteria, SearchType searchType) {
        return personsSet; }

    public void setSearchCriteria(String searchCriteria) {
        this.searchCriteria = searchCriteria;
    }
    public void setSearchType(SearchType searchType) {
        this.searchType = searchType;
    }
}