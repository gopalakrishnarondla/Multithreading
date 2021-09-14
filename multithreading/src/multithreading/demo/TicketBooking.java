package multithreading.demo;

public class TicketBooking extends Thread {
	
		private String pass_name;
		private int required_tick;
		private Ticketcounter ticketcount;
		
		

		public TicketBooking(String pass_name, int required_tick, Ticketcounter ticketcount) {
			super();
			this.pass_name = pass_name;
			this.required_tick = required_tick;
			this.ticketcount = ticketcount;
		
		}
		public void run() {
			ticketcount.checkavial(pass_name, required_tick);
		}
	
		


}
