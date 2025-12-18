package h2;

import java.util.ArrayList;

public class H2_main {
    public static void main(String[] args) {
		Bus A = new Bus();
		Bus B = new Bus();
		A.enterBus(new Passenger("Anna", 3, true));
		A.enterBus(new Passenger("Ben", 2, true));
		A.enterBus(new Passenger("Clara", 4, false));
		
		A.nextStop();
		
		A.transferPassengers(B, new String[]{"Anna", "Ben"});
		
		
		A.nextStop();
	    B.nextStop();
	    ArrayList<Passenger> removed = A.findPassengersWithoutTickets();
	    A.nextStop();
	    B.nextStop();
	    A.nextStop();
	    B.nextStop();
	    A.nextStop();
	    B.nextStop();
	    
	    System.out.println("finished");
	}
}
