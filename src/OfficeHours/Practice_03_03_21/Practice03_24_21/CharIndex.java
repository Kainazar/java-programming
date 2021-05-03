package OfficeHours.Practice_03_03_21.Practice03_24_21;

public class CharIndex {
    public static void main(String[] args) {
        /*

        Index

        java is
        0123456

        charAt (number) -> gives a char
        indexOf(char ) -> gives a int (index)
         */
        String s = "java";
////
//        System.out.println(s.charAt(s.length()-1));
//        System.out.println();
//        System.out.println(s.charAt(0));
//        System.out.println(s.charAt(1));
//        System.out.println(s.charAt(2));
//        System.out.println(s.charAt(3));

        System.out.println(s.charAt(0)+ "" + s.charAt(3));
        String upper = ""+  s.toUpperCase().charAt(0) + s.toUpperCase().charAt(3);
        System.out.println(upper);


    }
}
