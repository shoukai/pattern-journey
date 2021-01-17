package org.apframework.filter.ap;

import java.util.List;

public interface Criteria {
    public List<Person> meetCriteria(List<Person> persons);
}
