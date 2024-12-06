package org.example.Ex_10_17;

import java.util.ArrayList;

public class Ex_10_17
{
    public static void main(String[] args)
    {
        ArrayList<CarbonFootprint> carbonFootprints = new ArrayList<>();

        carbonFootprints.add(new Building(100));
        carbonFootprints.add(new Car(8, 1500));
        carbonFootprints.add(new Bicycle());

        for(CarbonFootprint footprint: carbonFootprints)
        {
            System.out.println(footprint);
            System.out.printf("Carbon footprint: %.2f kg CO2 \n\n", footprint.getCarbonFootprint());
        }
    }
}
