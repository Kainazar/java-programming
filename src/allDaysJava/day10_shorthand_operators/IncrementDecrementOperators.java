package allDaysJava.day10_shorthand_operators;

public class IncrementDecrementOperators {
    public static void main(String[] args) {
        int i =1;
        System.out.println("i = " + i);
        ++i;
        System.out.println("i = " + i);
        i++;
        i++;
        System.out.println("i = " + i);
//                                                ++linesOfCode++ will be error.
        int linesOfCode = 15;
        System.out.println("linesOfCode = " + linesOfCode);
        linesOfCode = linesOfCode + 1;
        linesOfCode+= 1;
        linesOfCode++;
        ++linesOfCode;
        System.out.println("linesOfCode = " + linesOfCode);

        // TYPE 4 DIFFERENT WAYS OF DECREASING BY 1
        
        int money=12;
        System.out.println("money = " + money);
        --money;
        System.out.println("money = " + money);
        money--;
        System.out.println("money = " + money);
        money = money -1;
        System.out.println("money = " + money);
        money-=1;
        System.out.println("money = " + money);
        
char letter='a';
        System.out.println("letter = " + letter);
        letter++;
        System.out.println("letter = " + letter);
        letter++;
        ++letter;
        System.out.println("letter = " + letter);
        letter+=1;
        System.out.println("letter = " + letter);
        
        letter--;
        System.out.println("letter = " + letter);
        --letter;
        System.out.println("letter = " + letter);
        --letter;
        System.out.println("letter = " + letter);
        letter--;
        System.out.println("letter = " + letter);
       long a = 3_000L;
       double b =(float ) a;
        System.out.println(b);
        


    }
}
