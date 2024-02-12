package racingcar.step3;

import java.util.Random;

class Car {
    private int position = 0;

    public void move() {
        Random random = new Random();
        if (random.nextInt(10) >= 4) {
            position++;
        }
    }

    public int getPosition() {
        return position;
    }
}
