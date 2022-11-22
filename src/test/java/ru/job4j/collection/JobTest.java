package ru.job4j.collection;

import org.junit.jupiter.api.Test;
import java.util.Comparator;
import static org.assertj.core.api.Assertions.assertThat;

public class JobTest {
    @Test
    public void whenComparatorByNameAndPriority() {
        Comparator<Job> cmpNamePriority = new JobDescByName().thenComparing(new JobDescByPriority());
        int rsl = cmpNamePriority.compare(
                new Job("Impl task", 0),
                new Job("Impl task", 1)
        );
        assertThat(rsl).isLessThan(2);
    }

    @Test
    public void whenComparatorAcsByName() {
        Comparator<Job> compareNameHigh = new JobAcsByName();
        int rsl = compareNameHigh.compare(
                new Job("Impl task", 0),
                new Job("Fix bug", 1)
        );
        assertThat(rsl).isLessThan(6);
    }

    @Test
    public void whenComparatorDescByName() {
        Comparator<Job> compareNameLow = new JobDescByName();
        int rsl = compareNameLow.compare(
                new Job("Impl task", 0),
                new Job("Fix bug", 1)
        );
        assertThat(rsl).isLessThan(0);
    }

    @Test
    public void whenComparatorAcsByPriority() {
        Comparator<Job> comparePriorityHigh = new JobAcsByPriority();
        int rsl = comparePriorityHigh.compare(
                new Job("Impl task", 0),
                new Job("Fix bug", 1)
        );
        assertThat(rsl).isLessThan(0);
    }

    @Test
    public void whenComparatorDescByPriority() {
        Comparator<Job> comparePriorityLow = new JobDescByPriority();
        int rsl = comparePriorityLow.compare(
                new Job("Impl task", 0),
                new Job("Fix bug", 1)
        );
        assertThat(rsl).isLessThan(2);
    }
}