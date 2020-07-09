import java.time.Instant;

public class Diagnostic {

	String soignant;
	Instant date;
	Maladie maladie;
	int validite; // fiabilité du diagnostic, entre 0 et 100%
	
	
	public Diagnostic(String soignant, Instant date, Maladie maladie, int validite) {
		this.soignant = soignant;
		this.date = date;
		this.maladie = maladie;
		this.validite = validite;
	}
	
}
