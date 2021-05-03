package day18_conditions_practice_string_intro;

public class SwitchSeasonFinder {
    public static void main(String[] args) {
String season ;
        int month = 7;
        switch (month){
            case 1: case 2: case 12:
                season = "Winter";
                System.out.println("Winter  ");
                break;
            default :
                System.out.println(" Invalid season ");
                break;
            case 3: case 4: case 5:
                season = "Spring";
                System.out.println("Spring ");
                break;
            case 6: case 7: case 8:
                season = "Summer ";
                System.out.println("Summer");
                break;
            case 9 : case 10: case 11:
                season = "Fall";
                System.out.println("Fal");
                break;


        }


    }
}
