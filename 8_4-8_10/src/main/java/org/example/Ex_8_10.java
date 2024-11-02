package org.example;

enum TrafficLight
{
    Red(30), Green(45), Yellow(5);
    private final int duration;

    TrafficLight(int duration)
    {
        this.duration = duration;
    }
    public int getDuration()
    {
        return duration;
    }
}

public class Ex_8_10
{
    public static void main(String[] args)
    {
        for(TrafficLight light : TrafficLight.values())
        {
            System.out.printf("Traffic light: %s, Duration %d seconds%n", light, light.getDuration());
        }
    }
}
