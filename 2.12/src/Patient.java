import java.time.Instant;
import java.time.temporal.ChronoUnit;

public class Patient {

	
	String nom;
	String prenom;
	Instant datenaissance;
	String sexe;
	Diagnostic diagnostic;
	Soin soin;
	
	
	// constructeur avec diagnostic uniquement
	public Patient (String nom, String prenom, Instant datenaissance, String sexe, Diagnostic diagnostic) {
		this.nom = nom;
		this.prenom = prenom;
		this.datenaissance = datenaissance;
		this.sexe = sexe;
		this.diagnostic = diagnostic;
	}
	
	// Constructeur avec diagnostic et soin
	public Patient (String nom, String prenom, Instant datenaissance, String sexe, Diagnostic diagnostic, Soin soin) {
		this.nom = nom;
		this.prenom = prenom;
		this.datenaissance = datenaissance;
		this.sexe = sexe;
		this.diagnostic = diagnostic;
		this.soin = soin;
	}
	
	// constructeur avec soin uniquement
	public Patient (String nom, String prenom, Instant datenaissance, String sexe, Soin soin) {
		this.nom = nom;
		this.prenom = prenom;
		this.datenaissance = datenaissance;
		this.sexe = sexe;
		this.soin = soin;
	}
	
	
	
	// afficher l'age du patient
	public void afficheAge () {
		System.out.println( ( datenaissance.until(Instant.now(), ChronoUnit.DAYS)/365 ) +" ans");
	}
	
	// afficher l'age du patient
	public long getAge () {
		return  ( datenaissance.until(Instant.now(), ChronoUnit.DAYS)/365 );
	}
	
	
	// afficher nombre de medicament que le client doit prendre par jour
	public void afficheFrequenceMedocParJour() {
		
		try {
			System.out.println("nombre de médicament à prendre par jour : "+soin.nbPriseMedocParJour);
		} catch (Exception e) {
			System.out.println("Ce patient n'a pas encore reçu de soin");
		}
		
	}
	
	
}
