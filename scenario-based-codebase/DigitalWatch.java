//16. Digital Watch Simulation
//Simulate a 24-hour watch:
//Print hours and minutes in a nested for-loop.
//Use a break to stop at 13:00 manually (simulate power cut).
//Core Java Scenario Based Problem Statements

public class DigitalWatch
{
   public static void main(String args[])
   {
     int hour = 24;
     int minute = 60;
     for(int i= 0; i<hour;i++){
        for( int j= 0; j<minute;j++)
            {
              if(i==13 && j==0)
              {
                System.out.println("Power Cut");
                break;
               }
              System.out.println(i+" "+j);
              }
         }
    }

}