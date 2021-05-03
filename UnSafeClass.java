import java.io.IOException;

public class UnSafeClass {
    public static void unsafeMethod() throws Exception, RuntimeException {
        System.out.println("This is an unsafe method ! ");

    }

    public static void main(String[] args) {
        try {
            unsafeMethod();
        } catch (IOException e) {
            e.printStackTrace();

        } catch (Exception e) {
            e.printStackTrace();
        }//removed catch
    }

}