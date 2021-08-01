package OOPLab.OOPLabA.LabCLassTest;
public class Q2 {
    public static void main(String[] args) {
        Battery battery = new Battery();
        battery.getValues(5, 10.0);

    }

}

class Battery {
    private int capacity;
    private double percentFull;

    public int setCapacity() {
        return capacity;
    }

    public double setpercentFull() {
        return percentFull;
    }

    public void getValues(int capacity, double percentFull) {
        this.capacity = capacity;
        this.percentFull = percentFull;

    }
}
