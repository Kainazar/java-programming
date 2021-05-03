package day30_arrays;

public class StudentsArray {
    public static void main(String[] args) {
        String[] student1 = new String[5];
        student1[0] = "AD1234";
        student1[1] = "Adam";
        student1[2] = "Smith";
        student1[3] = "B22";
        student1[4] = "202-543-1234";
        System.out.println("student data length: " +student1.length);
        System.out.println();
        System.out.println("**********************************");
        System.out.println();

        String [] student2 = {"as1234", "john", "Smith","B22", "347-588-6545"};
        System.out.println("Student ID: "+ student2[0]);
        System.out.println("First Name: "+ student2[1]);
        System.out.println( "Last Name: "+ student2[2]);
        System.out.println("Batch number: "+ student2[3]);
        System.out.println("Phone Number: "+ student2[4]);
        System.out.println("student data length: " +student2.length);

        if (student1.length== 5){
            System.out.println("Pass: Data array has correct length");
        }else {
            System.out.println("Fail: Data arrays incorrect ");
        }
        if (student1.length == student2.length){
            System.out.println("Pass: Data array has correct length");
        }else{
            System.out.println("Fail: Data arrays incorrect ");

        }
        String mobileNum = student1[4];
        System.out.println("mobile Num: "+ student1[4]+" -- "+student2[4]);

        System.out.println(student1[1].toUpperCase()+ "  "+student1 [2].toUpperCase());
        System.out.println((student2[1] +" "+student2[2]).toUpperCase()); // () reads first when print UpperCase
    }
}
