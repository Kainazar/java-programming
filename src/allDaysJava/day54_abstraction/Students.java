package allDaysJava.day54_abstraction;

public abstract class Students {

   public void code (String language) {
        System.out.println("Students is coding "+ language);
    }

    public  abstract  void attendClass ();

   }
    class Online extends Students{
    @Override
        public void attendClass() {
        System.out.println("Students attending the java class");
    }
}
