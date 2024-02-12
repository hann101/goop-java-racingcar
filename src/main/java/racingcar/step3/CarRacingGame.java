package racingcar.step3;


public class CarRacingGame {
    public static void main(String[] args) {

        int numberOfCars = InputView.getNumberOfCars();
        Race race = new Race(numberOfCars);

        int numberOfAttempts = InputView.getNumberOfAttempts();
        race.start(numberOfAttempts);
    }
}


