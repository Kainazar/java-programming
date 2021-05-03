package day30_arrays;

import com.sun.jmx.snmp.SnmpUnknownMsgProcModelException;

public class ForLoopArray {
    public static void main(String[] args) {
        int[] data = {115, 2450, 310, 777, 50, 60, 750, 80, 120, 999};
        for (int ham : data) {
            System.out.print(ham+ " ");

        }
        System.out.println();
        for (int i = 0; i < data.length; i++) {
            System.out.print(data[i]+" ");

        }
        System.out.println("\n"+data[data.length-1]);
        System.out.println("************ reverse For Loops*******");

        for (int b = data.length-1; b >= 0; b--) {
            System.out.print(data[b]+" ");
        }

        }
    }

