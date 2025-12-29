import java.util.Scanner;
public class ParkingSystem
{
 public static void main(String args[])
 {
   int capacity = 10;
   int occupancy =0;
   int input;
   Scanner sc = new Scanner(System.in);
   while(capacity>0)
       {
        
        System.out.println("Enter your choice: 1 for Parking , 2 for exiting and -1 for exiting the program");
        input = sc.nextInt();
        if( input==-1)
        {
          System.out.println(" Exited from the program Successfully");
          break;
        }
         switch(input)
         {
		case 1:
		System.out.println(" Car parked Successfully");
		occupancy++;
		capacity--;
                System.out.println("The updated capacity is "+capacity+" and occupancy is: "+ occupancy);
                System.out.println("-------------------------------------------------------------");
		break;
		case 2:
		if(occupancy>=1)
		{
		System.out.println(" Car exited Successfully");
		occupancy--;
		capacity++;
                System.out.println("The updated capacity is "+capacity+" and occupancy is: "+ occupancy);
                System.out.println("-------------------------------------------------------------");

		}
		else
		{
		System.out.println(" Please Park Your Car firstly");
                System.out.println("-------------------------------------------------------------");

		}
		break;
		default:
		System.out.println("Wrong choice");
                System.out.println("-------------------------------------------------------------");
	}
      }
        if(capacity==0){System.out.println("We are unable to provide you parking space since parking lot is full \n Sorry for the inconvenience!");}
   }
}