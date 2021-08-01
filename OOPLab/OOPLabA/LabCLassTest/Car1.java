package OOPLab.OOPLabA.LabCLassTest;
public class Car1 {
    String model;
    int speed;

    public Car1(String model, int speed) {
        this.model = model;
        this.speed = speed;
    }

    void increaseSpeed() {
        speed = speed + 2;

    }

    void increaseSpeedFast() {
        speed = speed + 10;

    }

    void decreaseSpeed() {
        speed = speed - 2;

    }

    void decreaseSpeedFast() {
        speed = speed - 15;

    }
}

