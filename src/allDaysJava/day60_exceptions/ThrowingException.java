package allDaysJava.day60_exceptions;

public class ThrowingException {
    public static void main(String[] args) {
        System.out.println("Let's create Exceptions");
//        RuntimeException ex = new RuntimeException();
//        throw ex;
        // throw new RuntimeException();
        String userNmae ="";
        if (userNmae.isEmpty()) {
            throw new RuntimeException("username can't be empty");
        }

    }
}
