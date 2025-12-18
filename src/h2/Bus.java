package h2;

import java.util.ArrayList;
import java.util.Iterator;

public class Bus {
    public ArrayList<Passenger> passengers;
    
    public Bus() {
    	passengers = new ArrayList<Passenger>();
    }
    
    public void enterBus(Passenger p) {
		passengers.add(p);
	}
    
    public void exitBus() {
    	ArrayList<Passenger> toRemove = new ArrayList<>();
    	
		for(Passenger p : passengers) {
			if(p.visited == p.planned) {
				toRemove.add(p);
			}
		}
		
		passengers.removeAll(toRemove);
	}
    
    public void nextStop(Passenger[] boarding) {
    	for(Passenger p : passengers) {
			p.visited++;
		}
    	exitBus();
    	for(Passenger p : boarding) {
    		passengers.add(p);
    	}
    }
    
    public void nextStop() {
    	for(Passenger p : passengers) {
			p.visited++;
		}
    	exitBus();
    }
    
    public ArrayList<Passenger> findPassengersWithoutTickets(){
    	ArrayList<Passenger> ergebniss = new ArrayList<Passenger>();
    	for(Passenger p : passengers) {
    		if(p.ticket == false) {
    			ergebniss.add(p);
    		}
    	}
    	passengers.removeAll(ergebniss);
    	return ergebniss;
    }
    
    public void  transferPassengers(Bus otherBus, String[] passengerNames) {
    	for(String name : passengerNames) {
    		Passenger passengerWithName = null;
    		for(Passenger p : passengers) {
    			if(p.name == name) {
    				passengerWithName = p;
    				break;
    			}
    		}
    		passengers.remove(passengerWithName);
    		otherBus.enterBus(passengerWithName);
    	}
    }
}
