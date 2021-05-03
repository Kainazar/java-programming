package OfficeHours.practice_03_29_21;

public class sandwich {
    public static void main(String[] args) {
        String str = "breadbread";  // 0 + 5 = 5 -> substring(5) -> jam.contain(bread)

        if (str.contains("bread")) { // 5,5

            int firstBread = str.indexOf("bread");

            if (str.substring(firstBread + 5).contains("bread")) { //jambread

                int secondBread = str.lastIndexOf("bread");
                String result = str.substring(firstBread + 5, secondBread);

                if (result.isEmpty()) {
                    System.out.println("nothing");
                } else {
                    System.out.println(result);
                }

            } else {
                System.out.println("nothing");
            }

        } else {
            System.out.println("nothing");
        }
    }
}