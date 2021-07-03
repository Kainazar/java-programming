package allDaysJava.day40_arrayList;
import  java.util.*;

public class ArrayListMethod {
    public static void main(String[] args) {

        List<String> shoppingList = new ArrayList<>();
        System.out.println("size= "+ shoppingList); // [] empty
        System.out.println("size = "+ shoppingList.isEmpty());
        if (shoppingList.isEmpty()){
            System.out.println("List is empty, keep coding Java");
        }else{
            System.out.println("List is not empty, code java then go to Mall");
        }
        shoppingList.add("Starbucks");
        shoppingList.add("Mask");
        shoppingList.add("Wooden Spoon");
        shoppingList.add("Java Book");
        shoppingList.add("Scooter");
        shoppingList.add("Tesla");
        if (shoppingList.isEmpty()){
            System.out.println("List is empty, keep coding Java");
        }else{
            System.out.println("List is not empty, code java then go to Mall");
        }

        System.out.println(shoppingList.isEmpty());

        int count =shoppingList.size();
        System.out.println("Items is to buy = "+ count);
        System.out.println("Is Java Book in my List: "+ shoppingList.contains("Java Book"));
        if (shoppingList.contains("Java Book")){
            System.out.println("Java Book in my List!");
        }else{
            System.out.println("Java Book is not in my List!");
        }
        System.out.println("Buying Book ... $99 ");

        shoppingList.remove("Java Book");

        System.out.println("All List -"+ shoppingList);
        System.out.println("Done shopping get back to coding");
        shoppingList.clear();
        System.out.println(shoppingList);
    }
}
