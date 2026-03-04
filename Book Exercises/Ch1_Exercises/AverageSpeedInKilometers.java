/*
Assume a runner runs 24 miles in 1 hour, 40 minutes, and 35 seconds.
Write a program that displays average speed in kph.
(1 mile = 1.6 km)
*/

public class AverageSpeedInKilometers {
    public static void main(String[] args) {
        double distanceMile = 24, timeHour = 1, timeMin = 45, timeSec = 30;
        double distanceKM, speedKPH;
        distanceKM = distanceMile * 1.6;
        timeHour += (timeMin / 60) + (timeSec / (60 * 60));
        speedKPH = distanceKM / timeHour;
        System.out.println("A runner who runs " + (int)distanceMile + " Miles in " + (int)timeHour + " hour " + (int)timeMin + " min and " + (int)timeSec + " sec is moving at " + speedKPH + " KPH.");
    }
}