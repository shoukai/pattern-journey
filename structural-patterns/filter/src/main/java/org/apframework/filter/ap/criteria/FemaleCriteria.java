package org.apframework.filter.ap.criteria;

import org.apframework.filter.ap.Criteria;
import org.apframework.filter.ap.Person;

import java.util.List;
import java.util.stream.Collectors;

public class FemaleCriteria implements Criteria {

    @Override
    public List<Person> meetCriteria(List<Person> persons) {
        return persons.stream().filter(p -> "FEMALE".equalsIgnoreCase(p.getGender())).collect(Collectors.toList());
    }
}
