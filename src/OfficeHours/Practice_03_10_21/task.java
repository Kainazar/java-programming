package OfficeHours.Practice_03_10_21;

public class task {
    public static void main(String[] args) {
        int judgesScore = 1;
        int personScore = 0;
        switch( judgesScore){
            case 1:
                System.out.println("First Place");
                personScore=2;
                break;
            case 2:
                System.out.println("Second Place");
                personScore=3;
                break;
            case 3:
                System.out.println("Third Place");
                personScore =1;
                break;
        }
        System.out.println("WINNER IS NUMBER "+"\""+ personScore +"\" OUR CONGRATULATIONS");

    }
}
