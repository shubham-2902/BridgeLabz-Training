//** School Bus Attendance System
//Track 10 students' presence.
//Use for-each loop on names
//Ask "Present or Absent?"
// Print total present and absent counts. **//


import java.util.Scanner;
public class BusAttendance
{
   public static void main(String args[])
  {
   // String array which store the stdents name
   String studentList[] = {"Ram","Shyam","A","B","C","D","E","F","G","H"};
   int presentCount =0;
   int absentCount =0;
    Scanner sc = new Scanner(System.in);
   System.out.println("---Please note instruction carefully either type p for present and a for absent. Any other respond will lead to absentism---\n");
   // for each loop for traversing the array
   for(String str: studentList)
    {
       System.out.println("Is "+str+ " present or not");
       String status= sc.nextLine();
      if(status.equals("p"))
       { 
          System.out.println("Marked Present");
          presentCount++;
         }
      else{        
          System.out.println("Marked Absent");
          absentCount++;
         }
 
      }
   System.out.println("------- Attendance Marked Successfully----------");
   System.out.println("Number of Present Students is "+ presentCount);
   System.out.println("Number of Absent Students is "+ absentCount);

 }

}