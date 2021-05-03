package day35_method_tiwh_param;

public class Email {
    public static void main(String[] args) {
buildEmail("java","gmail.com");
buildEmail("John Ward III", "VERSION");
    }
    public static void buildEmail(String name,String domain){
        name = name.replace(" ","_");
        System.out.println("Email: "+ name.replace(" ","_").toLowerCase());
        System.out.println("Email: "+name+ "_@" + domain);

    }

}
