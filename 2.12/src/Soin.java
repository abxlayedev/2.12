import java.time.Instant;

public class Soin {

	String soignant;
	Instant date;
	int posologie;
	int nbPriseMedocParJour;
	double amelioration;
	
	// pour la questiona
	public Soin (String soignant, Instant date, double amelioration) {
		this.soignant = soignant;
		this.date = date;
		this.amelioration = amelioration;
	}
	
	// pour la suite de la quesiton a
	public Soin (String soignant, Instant date, int posologie, int nbPriseMedocParJour, double amelioration) {
		this.soignant = soignant;
		this.date = date;
		this.posologie = posologie;
		this.nbPriseMedocParJour = nbPriseMedocParJour;
		this.amelioration = amelioration;
	}
}
