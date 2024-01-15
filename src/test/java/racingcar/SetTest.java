package racingcar;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

import java.util.HashSet;
import java.util.Set;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;
import static org.junit.jupiter.api.Assertions.assertEquals;

@DisplayName("Set Collection에 대한 학습 테스트")
class SetTest {

    private Set<Integer> numbers;

    @BeforeEach
    void setUp() {
        numbers = new HashSet<>();
        numbers.add(1);
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
    }

    @DisplayName("요구사항 1")
    @Test
    void SetCollectionTest() {
        assertThat(numbers).hasSize(3);
    }

    @DisplayName("요구사항 2")
    @ParameterizedTest
    @ValueSource(ints = {1, 2, 3})
    void contains(int number) {
        assertThat(numbers).contains(number);
    }

    @DisplayName("요구사항 3")
    @ParameterizedTest
    @CsvSource({"1, true", "2, true", "3, true", "4, false", "5, false"})
    void contains2(int number, boolean expected) {
            assertThat(numbers.contains(number)).isEqualTo(expected);
    }
}