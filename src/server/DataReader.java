package server;

import person.Person;
import java.util.HashSet;
import java.util.Set;

public class DataReader {

    String searchCriteria;
    SearchType searchType;

    public Set<Person> getPersons (String searchCriteria, SearchType searchType) {
        Set<Person> personsSet = new HashSet<>();
        return personsSet; }

    public void setSearchCriteria(String searchCriteria) {
        this.searchCriteria = searchCriteria;
    }
    public void setSearchType(SearchType searchType) {
        this.searchType = searchType;
    }
}