package allDaysJava.day60_exceptions;

public class MultiCatchBlock {
    public static void main(String[] args) {
        //String word= "java";
        String word= null;
        try {
            System.out.println(word.length());
            System.out.println(word.substring(20));
        } catch (NullPointerException e ) {
            System.out.println("NullPointerException caught and handled, please check if string has value");
        }catch ( StringIndexOutOfBoundsException s) {
            System.out.println("StringIndexOutOfBoundsException is wrong, please check if you entered a value index");
        } catch (Throwable t ) {
            System.out.println("Exception is caught !");
            System.out.println("Type = "+ t.getCause());
        }
    }
}
