package multithreading.demo;

public class Ticketcounter  {
	
	private int nooftickets=3;
	
	public synchronized void checkavial(String passenger_name,int requiredtickets) {
		if(requiredtickets<=nooftickets) {
			System.out.println("Hi "+passenger_name+" Tickets booked succesfully");
			nooftickets=nooftickets-requiredtickets;
		}
		else {
			System.out.println("Tickets not avialable");
		}
		
	}

}
