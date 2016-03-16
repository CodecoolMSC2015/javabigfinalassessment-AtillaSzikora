package server;

import person.Person;
import java.util.List;
import java.util.Set;

public class CSVDataReader extends DataReader {

    String csvFilePath;
    List<Person> persons;

    public void CSVDataReader(String csvFilePath) {}

    @Override
    public Set<Person> getPersons(String searchCriteria, SearchType searchType) {
        return super.getPersons(searchCriteria, searchType);
    }
}