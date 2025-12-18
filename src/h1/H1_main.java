package h1;

public class H1_main {
    public static void main(String[] args) {
		PrioListe liste = new PrioListe();
		liste.addPatient(new Patient("A", 1));
		liste.addPatient(new Patient("B", 10));
		liste.addPatient(new Patient("C", 5));
		liste.addPatient(new Patient("D", 3));
		liste.addPatient(new Patient("E", 11));
		liste.addPatient(new Patient("F", 7));
		
		liste.getNextPatient();
		liste.getNextPatient();
		
		System.out.println("finished");
	}
}
