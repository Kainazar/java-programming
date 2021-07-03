package allDaysJava.day48_constructor_static;

import java.util.Arrays;

public class CybretekGroups {
    public static void main(String[] args) {

        //dependency injection. Group object creation depends on String name
        Group group1 = new Group("Cyberbugs");
        //print size of members
        System.out.println(group1.getMembers().size());
        group1.addMember("Berk");
        group1.addMember("Pavel");
        group1.addMember("Elvin");
        group1.addMember("Ali");
        group1.addMember("Parvin");
        group1.addMember("Rasim");
        group1.addMember("Maria");

        System.out.println(group1.getMembers().size());
        System.out.println(group1.toString());

        Group group2 = new Group("CyberCats");
        group2.setMembers(Arrays.asList("Stephen", "Wakshum", "Akrem", "Bulent", "Andreea", "Andrei"));
        //print all members. not toString()
        System.out.println("group2 members = " + group2.getMembers());
        //use if statement to check if Akrem is in group2
        if (group2.getMembers().contains("Akrem")) {
            System.out.println("Akrem is a member of group2");
        } else {
            System.out.println("Akrem is not in group2");
        }
    }
}

