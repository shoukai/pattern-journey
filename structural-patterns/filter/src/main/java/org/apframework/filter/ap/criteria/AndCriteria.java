package org.apframework.filter.ap.criteria;

import org.apframework.filter.ap.Criteria;
import org.apframework.filter.ap.Person;

import java.util.List;

public class AndCriteria implements Criteria {

    private Criteria first;
    private Criteria second;

    public AndCriteria(Criteria first, Criteria second) {
        this.first = first;
        this.second = second;
    }

    @Override
    public List<Person> meetCriteria(List<Person> persons) {
        return second.meetCriteria(first.meetCriteria(persons));
    }
}
