package exam2;
public class Test {

    public static void main(String[] args) {
        Car car1 = new Car("Toyota", 0);
        car1.increaseSpeed();
        for (int i = 0; i <= 5; i++) {
            car1.increaseSpeed();
        }
       // car1.decreaseSpeed();

        car1.increaseSpeedFast();
        car1.increaseSpeedFast();

        for (int i = 0; i < 2; i++)
            car1.decreaseSpeedFast();
        System.out.println(car1.speed);
    }
}