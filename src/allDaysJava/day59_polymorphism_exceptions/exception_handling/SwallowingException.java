package allDaysJava.day59_polymorphism_exceptions.exception_handling;

import java.util.EmptyStackException;

public class SwallowingException {
    public static void main(String[] args) {
        try {
            throw new EmptyStackException();
        }catch(EmptyStackException pew){
            System.out.println("Caught EmptyStackException");
        }
        System.out.println("it worked!");



    }
}
