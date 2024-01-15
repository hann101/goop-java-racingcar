package racingcar;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

@DisplayName("String 클래스에 대한 학습 테스트")
class StringTest {


    @DisplayName("요구사항 1")
    @Test
    void stringTestOne() {
        String[] values1 = "1,2".split(",");
        String[] values1_1 = "1".split(",");
        assertThat(values1).contains("1", "2");
        assertThat(values1_1).containsExactly("1");
    }

    @DisplayName("요구사항 2")
    void stringTestTwo(){
        String values2 = "(1,2)";
        String substring = values2.substring(1, values2.length() - 1);
        assertThat(substring).contains("1", "2");
    }

    @DisplayName("요구사항 3")
    void stringTestThree(){
        String word = "abc";
        assertThatThrownBy(() -> {
            word.charAt(word.length());
        })
                .isInstanceOf(StringIndexOutOfBoundsException.class)
                .hasMessageContaining("String index out of range: 3");
    }
}
