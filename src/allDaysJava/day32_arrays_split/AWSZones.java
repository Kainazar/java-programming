package allDaysJava.day32_arrays_split;
import java.util.*;
public class AWSZones {
    public static void main(String[] args) {
        System.out.println(" ==== Starting deployment of etsy app to AWS zones ==========");
        String app = "etsy";
        String zones = "us-east-1,us-west-2,us-west-1";
        String [] westSide = zones.split(",");
        System.out.println(Arrays.toString(westSide));
        System.out.println();
        System.out.println("Zone #1 "+ westSide[0]);
        System.out.println("Zone #2 "+ westSide[1]);
        System.out.println("Zone #3 "+ westSide[2]);
        System.out.println();
        for( String each : westSide){
            //System.out.println("each = " + each);
            System.out.println("Deploying [" + app +"] to "+  each);
            System.out.println("=== Deployment completed for "+ each+".....");
            System.out.println("------All deployment complete, traffic enabled -----");
        }

    }
}
