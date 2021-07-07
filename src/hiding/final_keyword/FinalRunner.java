package hiding.final_keyword;

public class FinalRunner {
    public static void main(String[] args) {


        System.out.println(TestData.ADMIN_USERNAME);
      //  TestData.ADMIN_USERNAME = "change";  ERROR YOU CANNOT CHANGE VALUE OF FINAL VARIABLES

        final int SSN = 12453478;
        //  SSN = 2134577;  ERROR YOU CANNOT CHANGE VALUE OF FINAL VARIABLE


    }
}
