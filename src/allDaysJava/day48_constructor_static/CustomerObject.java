package allDaysJava.day48_constructor_static;

import java.util.ArrayList;
import java.util.List;

public class CustomerObject {
    public static void main(String[] args) {
        Customer one = new Customer();
        System.out.println(one);
        one.setId(123456);
        one.setName("Smith");
        System.out.println(one);

        Customer cs2 = new Customer("Mike", 2); // create object and assign values in same statement;
        Customer cs3 = new Customer("John Halib", 4873);
        System.out.println(cs2);
        System.out.println(cs3);

        // array of Customers

        Customer [] todayCustomer = {one, cs2, cs3, new Customer("Bashir ", 449)  };

        // ArrayList of Customer objets;

       List< Customer > customers = new ArrayList<>();
       customers.add(one);
       customers.add(cs2);
       customers.add(cs3);
       customers.add(new Customer("Bashir ", 777));
       customers.add(new Customer("Suleyman ", 555));
       customers.add(new Customer("Erkin ", 7777));


       // Print infor of first customer object in array and arrayList.

        System.out.println(todayCustomer[0].toString());
        System.out.println(todayCustomer[1]);
        System.out.println(customers.get(0));
      //  System.out.println(customers); will print info will print everything on cutomers
        System.out.println("========= FOR LOOP ==================");
        for (int i = 0; i < customers.size(); i++) {
            System.out.println(customers.get(i));
        }
        System.out.println("======== FOR EACH LOOP ==============");
        for (Customer each : customers) {
            System.out.println(each);
        }
        System.out.println("======== PRINT ONLY NAMES ===========");
        for (Customer eachCustomer : customers) {
            System.out.println(eachCustomer.getName());
        }
        System.out.println("========== Landa Expression =========");
        customers.forEach(each -> System.out.println(each.getName()));
        }

        }





