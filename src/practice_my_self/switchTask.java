package practice_my_self;

public class switchTask {
    public static void main(String[] args) {
        int grade=5;
        int numGroup = 0;
        String location= "";
        String teacherCharge="";
        switch (grade){
            case 1:
                grade=1;
                location = "Apple Orchard";
                teacherCharge = "Ms.Smith";
                numGroup = 3;
                break;
            case 2:
                grade = 2;
                location = "Zoo";
                teacherCharge = "Mr.Lee";
                numGroup = 7;
                break;
            case 3:
                grade = 3;
                location = "Aquarium";
                teacherCharge = "Ms.Wilson";
                numGroup = 5;
                break;
            case 4:
                grade = 4;
                location = "Movie Theater";
                teacherCharge = "Ms.Reyes";
                numGroup = 2;
                break;
            case 5:
                grade = 5;
                location = "Museum";
                teacherCharge = "Ms.Lela";
                numGroup = 5;
                break;
            case 6:
                grade = 6;
                location = "Six Flags";
                teacherCharge = "Mr.Watt";
                numGroup = 8;
                break;
            default:
                System.out.println(" Enter valid grade");
        }
        System.out.println("**************** WELCOME TO SCHOOL**************");
        System.out.println("Grade \""+grade+ "\" will be visiting the " +location+ " with our lovely teachers " +teacherCharge+ " at Group \""+numGroup +"\"");
        System.out.println("Please wear mask and 6 Feet distance ");
        System.out.println(" Enjoy  your School");



    }

}
