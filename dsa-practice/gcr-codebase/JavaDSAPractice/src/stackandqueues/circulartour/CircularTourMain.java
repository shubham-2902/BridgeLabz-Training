package stackandqueues.circulartour;


	public class CircularTourMain{
	    public static void main(String[] args) {

	    	//Declaration
	        PetrolPump[] pumps = {
	            new PetrolPump(4, 6),
	            new PetrolPump(6, 5),
	            new PetrolPump(7, 3),
	            new PetrolPump(4, 5)
	        };

	        CircularTourService service = new CircularTourService();
	        int start = service.findStartingPump(pumps);

	        if (start != -1)
	            System.out.println("Starting Pump Index: " + start);
	        else
	            System.out.println("No possible circular tour.");
	    }
	}

