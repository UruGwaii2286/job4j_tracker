package ru.job4j.condition;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;
public class MaxTest {

    @Test
    public void whenMax1To4Then4() {
        int left = 1;
        int right = 2;
        int a = 3;
        int b = 4;
        int result = Max.max(left, right, a, b);
        int expected = 4;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void whenMax1To8Then2() {
        int left = 1;
        int right = 4;
        int a = 5;
        int b = 8;
        int result = Max.max(left, right, a, b);
        int expected = 8;
        assertThat(result).isEqualTo(expected);
    }
}