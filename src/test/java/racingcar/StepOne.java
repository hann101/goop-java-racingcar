package racingcar;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

import java.util.HashSet;
import java.util.Set;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;
import static org.junit.jupiter.api.Assertions.*;

class StepOne {

    @Test
    void StringTest() {
        //1
        String[] values1 = "1,2".split(",");
        String[] values1_1 = "1".split(",");
        assertThat(values1).contains("1", "2");
        assertThat(values1_1).containsExactly("1");

        //2
        String values2 = "(1,2)";
        String substring = values2.substring(1, values2.length() - 1);
        assertThat(substring).contains("1", "2");

        //3
        String word = "abc";
        assertThatThrownBy(() -> {
            word.charAt(word.length());
        })
                .isInstanceOf(StringIndexOutOfBoundsException.class)
                .hasMessageContaining("String index out of range: 3");
    }


    private Set<Integer> numbers;

    @BeforeEach
    void setUp() {
        numbers = new HashSet<>();
        numbers.add(1);
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
    }

    @Test
    void SetCollectionTest() {
        assertEquals(3, numbers.size());
    }

    @ParameterizedTest
    @ValueSource(ints = {1, 2, 3})
    void contains(int number) {
        assertThat(numbers.contains(number)).isTrue();
    }

    @ParameterizedTest
    @CsvSource({"1, true", "2, true", "3, true", "4, false", "5, false"})
    void contains2(int number, String expected) {
        assertThat(numbers.contains(number)).isTrue();
    }
}