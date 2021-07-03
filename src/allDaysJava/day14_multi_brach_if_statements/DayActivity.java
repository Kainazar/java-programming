package allDaysJava.day14_multi_brach_if_statements;

public class DayActivity {
    public static void main(String[] args) {
        String weather ="";
        if (weather.equals("Sunny")){
            System.out.println(weather + " Go,to park, and code java");
        }else if(weather.equals("Rain")){
            System.out.println(weather + " stay at home and read about java");
        }else if(weather.equals("windy")){
            System.out.println(weather + " research about Java");
        }else if(weather.equals("Snow")){
            System.out.println(weather + "Stay warm  and write  Java code");
        }else{
            System.out.println(weather+ "Anyway go to  learn java");
        }
        System.out.println("****** STAY ALWAYS COOL AND BE SAFE *******");
    }

}
