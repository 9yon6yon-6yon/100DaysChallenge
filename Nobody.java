public class Nobody {
    public static void main(String[] args) {
        Somebody person = new Somebody() {
            String name = "nobody";

            public void printName() {
                System.out.println("I am " + name);
            }

            public void printName(String name) {
                System.out.println("I am " + name);

            }
        };
        person.printName();//The method printName() in the type Somebody is not applicable for the arguments (String)
        //removed argument from printName()
    }

}

interface Somebody {
    public void printName();
}
