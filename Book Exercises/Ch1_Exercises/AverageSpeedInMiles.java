/* 
Assume that a runner runs 14 km in 45 min and 30 seconds.
Write a program that displays average speed in mph.
(1 mile = 1.6 km)
*/

public class AverageSpeedInMiles {
    public static void main(String[] args) {
        double distanceKM = 14, timeMin = 45, timeSec = 30;
        double distanceMile, speedMPH, timeHour;
        distanceMile = distanceKM / 1.6;
        timeHour = (timeMin / 60) + (timeSec / (60 * 60));
        speedMPH = distanceMile / timeHour;
        System.out.println("A runner who runs " + (int)distanceKM + " KM in " + (int)timeMin + " min and " + (int)timeSec + " sec is moving at " + speedMPH + " MPH.");
    }
}