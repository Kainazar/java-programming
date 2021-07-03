package allDaysJava.day25_loops;

public class FizzBuzz {
    public static void main(String[] args) {
        for( int n=1; n<=15; n++){
            if(n % 3==0 && n % 5 == 0){
                System.out.println(" \t      \tFizzBuzz "+ n);

            }else if( n % 5 == 0){
                System.out.println("\t            \t         \tBuzz " + n);

            }else if (n % 3 ==0){
                System.out.println("Fizz "+ n);
            }

            }
        }
    }

