public class TimeOfDay
{

    private int hour;
    private int minute;


    /**
     * Constructor for objects of class TimeOfDay
     */
    public TimeOfDay( int h, int m )
    {
        setHr( h );
        setMin( m );
    String time = "17:46";
    String [] values = time.split(":");

    }

    public TimeOfDay()
    {

    }




    /**
    - set the hour using an input parameter h
    - set the minute using an input parameter m
    - add one hour (increase hour by 1)
    - add one minute (increase minute by 1)
    - output the current time in HH:MM format
         (single digit hour or minute must have a leading 0, e.g. 04:09) 
     */


   public void setHr (int h )
   {
       if (0 <= h && h < 23 )
        hour = h;
       else 
        hour = 0;
    }

    public void setMin (int m)
    {
       if (0 <= m && m < 59)
        minute = m;
       else
        minute = 0;
    }

    public void addHour()
    {
        hour++;

        if ( hour > 23 )
        hour = 0;
    }

    public void addMinute()
    {
        minute++;

        if ( minute > 59 )
        {
            minute = 0;
            addHour(); //increment hour
        }
    }

    public int  printCurrentTime()
    {
        if (hour < 10)
        System.out.print( "0" + hour + ":");

        if (minute < 10)
        System.out.print( "0" + minute);

        return time.split;


    }
}
