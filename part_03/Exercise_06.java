package part_03;


import java.util.Scanner;

class Exercise_06 {

    // the goal of this method is to print out the local time in any given timezone
    public static void main(String[] strings) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter the time zone offset to GMT (ie, -8 or 8): ");
        long timeZoneChange = input.nextInt();

        // Get total milliseconds since midnight, 1/1/1970
        long totalMilliseconds = System.currentTimeMillis();
        System.out.println("Total time in milliseconds is: " + totalMilliseconds);

        // Get total seconds since midnight, 1/1/1970
        //1000ms = 1seconds

        long totalSeconds = totalMilliseconds/1000;
        System.out.println("Total seconds " + totalSeconds);
        // Get the current second within the minute within the hour

        long secondsInThisMinute = totalSeconds % 60;
        System.out.println("The number of seconds in this minute is: " + secondsInThisMinute);

        // Get total minutes

        long numberOfMinutes = totalSeconds / 60;
        System.out.println("The total number of minutes since 1970: " + numberOfMinutes);

        // Get the current minute in the hour

        long minutesInThisHour = numberOfMinutes % 60;
        System.out.println("The total number of minutes in this hour are: " + minutesInThisHour);

        // Get the total hours

        long hoursInThisDay = numberOfMinutes / 60;
        System.out.println("The total number of minutes in this day: " + hoursInThisDay);

        // Get the current hour

        long currentHour = (hoursInThisDay + timeZoneChange) % 24;
        System.out.println("The current hour is: " + currentHour);

        // Display results using a 12 hour clock, include AM or PM
        String ampm = "";

        if (currentHour > 12 ){

            currentHour -=12;

            ampm = "pm";

        }else {
            ampm = "am";
        }

        System.out.println("Current time is : " + currentHour + ":"+ minutesInThisHour + ":"+ secondsInThisMinute + " " + ampm);

    }
}
