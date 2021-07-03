package allDaysJava.day54_abstraction;

public class School {
    public static void main(String[] args) {
        Online st1 = new Online() ;
        st1.code("!");
        st1.attendClass();

        CampusStudent st2 = new CampusStudent();
        st2.attendClass();
        st2.code("They will there all the time!!!");

       // Students st3 = new Students() {  Error - cannot create Students object

        }

        }


