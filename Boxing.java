public class Boxing {
    public void boxing() {
        int pInt = 420;
        Integer wInt = new Integer(pInt);// boxing
        int p2 = wInt.intValue();// unboxing
    }

    public void autoboxing() {
        int pInt = 420;
        Integer wInt = pInt;// autoboxing
        int p2 = wInt;// auto unboxing
    }

}
