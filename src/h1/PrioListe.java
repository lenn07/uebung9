package h1;

import java.util.ArrayList;

public class PrioListe {
	public ArrayList<Patient> myList = new ArrayList<Patient>();

	public void addPatient(Patient p) {

		int stelle = 0;
		for (Patient pt : myList) {
			if (pt.prio > p.prio) {
				stelle = myList.indexOf(pt);
				break;
			}
			if(pt == myList.getLast() && pt.prio < p.prio) {
				stelle = myList.indexOf(pt) + 1;
			}
		}
		myList.add(stelle, p);

	}
	
	public Patient getNextPatient() {
		if (!myList.isEmpty()) {
			Patient ergebnisPatient = myList.getFirst();
			myList.remove(0);
			return ergebnisPatient;
		}
		return null;
	}
	
	public int getPosition(Patient p) {
		return myList.indexOf(p);
	}
}
