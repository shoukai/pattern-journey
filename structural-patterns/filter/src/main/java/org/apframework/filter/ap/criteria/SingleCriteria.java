package org.apframework.filter.ap.criteria;

import org.apframework.filter.ap.Criteria;
import org.apframework.filter.ap.Person;

import java.util.List;
import java.util.stream.Collectors;

public class SingleCriteria implements Criteria {
    @Override
    public List<Person> meetCriteria(List<Person> persons) {
        return persons.stream().filter(p -> "SINGLE".equalsIgnoreCase(p.getMaritalStatus())).collect(Collectors.toList());
    }
}
