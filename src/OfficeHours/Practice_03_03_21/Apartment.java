package OfficeHours.Practice_03_03_21;

public class Apartment {
    public static void main(String[] args) {

String address = "777 111 ave New York 10077";

String ownerOfBuilding = " US PRIME LLC ";
int numberOfApt = 75;
double sizeOfApt = 1200;
int monthRent = 3000;
int washer = 6;
int dryer = 6;
String hasPool = " Yes. ";
String allowedPets = " Yes. ";
int residentsOfBuilding = 350;
long managemedNumber = 312412512L;
String hasBasment = " Yes. ";
String isGasNer = " No. ";
int parkingSpace = 150;
String hasAc = " Yes. ";
String hasWheel = " Yes. ";
String numReviewStars =" 5 out of 5 ";
double rentAfter3years = (monthRent * 0.9);
double rentAfter6Year = (monthRent * 0.80);
double myProcent = 4000;
myProcent = (4000 + 10);
        System.out.println("********* Welcome  Home ********");
        System.out.println();
        System.out.println("Address: " + address);
        System.out.println("Number of Units: "+ residentsOfBuilding + " Number of Apt "+ numberOfApt);
        System.out.println("Monthly rent: $ " + monthRent );
        System.out.println("Has a Pool:\t\t"+hasPool);
        System.out.println("Pets Allowed: \t" +allowedPets);
        System.out.println("Has AC: \t\t"+ hasAc);
        System.out.println("Has Basement:\t" +hasBasment+"\nIs Gas Near By: "+isGasNer);
        System.out.println("Has Wheel Ramp: "+ hasWheel);
        System.out.println("Rating Review : " +numReviewStars );
        System.out.println("Contact numbers: "+ managemedNumber + " \n Email: Usprimellc@.com ");
        System.out.println("********************--------------***********************");
        System.out.println("Monthly rent after 3 year 10% discount $ " +  rentAfter3years +  " off original rent.");
        System.out.println("Monthly rent after 6 year 20% discount $ " +rentAfter6Year + " off from original price.");
        System.out.println();
        System.out.println();
        System.out.println("myProcent = " + myProcent);



    }

}