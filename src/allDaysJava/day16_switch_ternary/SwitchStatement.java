package allDaysJava.day16_switch_ternary;

public class SwitchStatement {
    public static void main(String[] args) {
        int floorNum = 4;
        switch (floorNum) {

            case 1:
                System.out.println("Floor 1 selected:  Companies: Lobby, Verizon, Starbucks");
                break;
            case 2:
                System.out.println("Floor 2 selected: Companies: Cybertek, NASA, Intelsat");
                break;
            case 3:
                System.out.println("Floor 3 selected. Companies: Lyft, BofA, Stake house");
                break;
            default:
                System.out.println("Wrong input");
        }

    }
}
