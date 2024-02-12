package racingcar.step3;

import java.util.ArrayList;
import java.util.List;

class Race {
    public List<Car> getCars() {
        return cars;
    }

    private List<Car> cars = new ArrayList<>();

    public Race(int numberOfCars) {
        for (int i = 0; i < numberOfCars; i++) {
            cars.add(new Car());
        }
    }

    public void start(int attempts) {
        System.out.println("실행 결과");
        for (int i = 0; i < attempts; i++) {
            for (Car car : cars) {
                if (i != 0) {
                    car.move();
                }
                ResultView.displayRace(car);
            }
            System.out.println(" \n ");
        }
    }
}
