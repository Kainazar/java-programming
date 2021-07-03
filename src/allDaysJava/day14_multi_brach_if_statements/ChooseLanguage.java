package allDaysJava.day14_multi_brach_if_statements;

public class ChooseLanguage {
    public static void main(String[] args) {
        System.out.println("Choose your Language !!");
      int selection = 4;
      if(selection ==1){
          System.out.println("Hello, thank you for your call");
      }else if( selection ==2){
          System.out.println("hol, gracias para llamar");
      }else if (selection == 3){
          System.out.println("mehaba, aradiginiz icintecekular");
      }else if( selection ==4){
          System.out.println("Russian\nPrivet, spasibo za vash zvonok");
      }else if (selection == 5){
          System.out.println("Merci, pour votre appel");
      }else{
            System.out.println("Let's talk Java and English, Hello ");
        }

    }
}
