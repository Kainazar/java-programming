package home_Work.practice;

public class grows1Cm {
    public static void main(String[] args) {
        int cm = 0;
        int years = 1;
        int growth = 0;
        while(years <= 10){
            if(years <= 3){
                cm += 1;
                growth = 1;
            }else if( years > 3){
                cm += 2;
                growth = 2;
            }
            System.out.println("year "+ years +" - growth " +growth+ " cm");
            System.out.println("tree size: "+cm +"cm");
            years++;


        }


    }
}


