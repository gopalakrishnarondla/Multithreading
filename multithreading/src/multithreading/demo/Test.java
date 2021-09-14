package multithreading.demo;

public class Test {
	
	
	public  void check(String[] args) {
		Ticketcounter tc=new Ticketcounter();
		TicketBooking t1=new TicketBooking("Gopal",2,tc);
		TicketBooking t2=new TicketBooking("Bunny",2,tc);
		
		t1.start();
		t2.start();
		
		
	}

}
