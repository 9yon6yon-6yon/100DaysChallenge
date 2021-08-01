package OOPLab.OOPLabA.LabCLassTest;
public class Test1 {

    public static void main(String[] args) {
        Car1 text1 = new Car1("Toyota", 0);
        text1.increaseSpeedFast();
        for (int i = 0; i <= 5; i++)
            text1.increaseSpeed();
        text1.decreaseSpeed();
        text1.increaseSpeedFast();
        text1.decreaseSpeedFast();
        for (int i = 0; i < 2; i++)
            text1.decreaseSpeedFast();
        System.out.println(text1.speed);
    }

}
