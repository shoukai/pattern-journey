package org.apframework.filter.ap.criteria;

import org.apframework.filter.ap.Criteria;
import org.apframework.filter.ap.Person;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class OrCriteria implements Criteria {

    private Criteria first;
    private Criteria second;

    public OrCriteria(Criteria first, Criteria second) {
        this.first = first;
        this.second = second;
    }

    @Override
    public List<Person> meetCriteria(List<Person> persons) {
        Set<Person> set = new HashSet<>();
        set.addAll(first.meetCriteria(persons));
        set.addAll(second.meetCriteria(persons));
        return new ArrayList<>(set);
    }
}
