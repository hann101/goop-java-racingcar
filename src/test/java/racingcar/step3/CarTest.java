package racingcar.step3;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CarTest {

    private Race race;

    @DisplayName("지정된 수의 Car 객체를 cars 목록을 초기화")
    @ParameterizedTest
    @ValueSource(ints = {1, 4, 7, 16, 20})
    public void move(int input) {
        race = new Race(input);
        List<Car> cars = race.getCars();
        assertEquals(input, cars.size(), "입력된 차량 갯수와 생성된 차량 걋수가 일치하지 않습니다.");
    }
}
