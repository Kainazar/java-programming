package allDaysJava.day08_casting_scanner;

public class CastingExamples {
    public static void main(String[] args) {
        // byte- short -int - longer.
        byte num1 = 100;
        short num2 = num1;
        int num3 = num1;
        int num4 = 1000;
        long num5 =  num4;
        float num6 = 124.4F;
        double num7 = num6;
        int num8 = 3456;
        double num9 = num8;
        System.out.println(num8);
        System.out.println( "num9 = " + num9);
        // all this implicit....

        System.out.println("=====================");
        int num10 =22;
        byte num11 = (byte)num10;
        short num12 = (short) num10;
        System.out.println("num10 = " + num10);
        System.out.println("num11 = " + num11);
        System.out.println("num12 = " + num12);


        double num13 = 55.3;
        float num14 = (float) num13;
        System.out.println("num13 = " + num13);
        System.out.println("num14 = " + num14);
        
        
        double num15 = 55.6;
        float  num16 = (float)num15;
        System.out.println("num16 = " + num16);
        
       double num17 = 1234.5;
       int num18 = (int)num17;
        System.out.println("num18 = " + num17);
        System.out.println("num17 = " + num18);
        int num20 = 300;
        byte num21 = (byte)num20;
        System.out.println("num21 = " + num21);
        
        char letter ='B';
        int num19 = letter;
        System.out.println("Letter = " + num19);
        char letter1 = 'A';
        char letter2 = 'K';
        char letter3 = 'Y';
        char letter4 = 'T';
        System.out.println("letter4 = " + letter4);
        //66,65,75,89,84.

//byte b = 65;
//byte a = 66;
//byte k = 75;
//byte y = 89;
//byte t = 84;
       // char b,a,k,y,t = (char);



    }
}
