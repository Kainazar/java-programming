package allDaysJava.day10_shorthand_operators;

public class ShortHandOperators {
    public static void main(String[] args) {
        int cars = 10;
        System.out.println("cars in the parking lots  = " + cars);
        cars = cars + 2;
        System.out.println("cars in the parking lots  = " + cars);
        cars += 5;
        System.out.println("cars in the parking lots =  " + cars);
        cars -= 6;
        System.out.println("cars in the parking lots  = " + cars);
        cars -= 1;
        System.out.println("cars in the parking lots  = "  +cars);
        int electricCars = 13;
        cars += electricCars;
        System.out.println("cars in the parking lots = " + cars);
        System.out.println();
        String word = "Java";
        System.out.println("word = " + word);
        word = word +  " programming "; // longer code
        word += " is fun";
        System.out.println(" word = " + word);
        String selenium = "but \"selenium\" is more fun";
        System.out.println("selenium = " + selenium);
        word +=  12345;
        System.out.println(" word = " + word);
        char letter = 'A';
        System.out.println("letter = " + letter);
        letter += 3;
        System.out.println("letter = " + letter);
        letter += 1;
        System.out.println("letter = " + letter);
        letter +=5;
        System.out.println("letter = " + letter);
        System.out.println();
        double parkingFee = 7.5;
        System.out.println("normal parking fee = $ " + parkingFee);
        parkingFee /= 2;
        System.out.println("parkingFee  with discount = " + parkingFee);
        //parkingFee-=parkingFee;
           parkingFee = 0;
        System.out.println("parkingFee = $ " + parkingFee);





        
        
        


    }
}
