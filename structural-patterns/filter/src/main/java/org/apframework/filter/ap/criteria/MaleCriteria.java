package org.apframework.filter.ap.criteria;

import org.apframework.filter.ap.Criteria;
import org.apframework.filter.ap.Person;

import java.util.List;
import java.util.stream.Collectors;

public class MaleCriteria implements Criteria {
    @Override
    public List<Person> meetCriteria(List<Person> persons) {
        return persons.stream().filter(p -> "MALE".equalsIgnoreCase(p.getGender())).collect(Collectors.toList());
    }
}
