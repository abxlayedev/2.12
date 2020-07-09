import java.time.Instant;

public class Application {
	


	public static void main(String[] args) {
		
		// instanciation des objets diagnostics
		Diagnostic diagnosticDrTqtPas = new Diagnostic("Dr TqtPas", Instant.now(), Maladie.GRIPPE, 100);
		Diagnostic diagnosticDrPasSur = new Diagnostic("Dr PasSur", Instant.now(), Maladie.CHOLERA, 50);
		Diagnostic diagnosticDrJveuxLargent = new Diagnostic("Dr JveuxLargent", Instant.now(), Maladie.PESTE, 10);

		// instanciations des objets soins
		Soin soinDrTqtPas = new Soin("Dr TqtPas", Instant.now(), 99);
		Soin soinDrPasSur = new Soin("Dr TqtPas", Instant.now(), 1, 3, 60);
		Soin soinDrJveuxLargent = new Soin("Dr TqtPas", Instant.now(), 4, 3, 30);
					
		// instanciations des objets patients
		Patient patientA = new Patient("Alobo", "Eurido", Instant.parse("1990-02-03T11:25:30.00Z"), "Homme", diagnosticDrTqtPas);
		Patient patientB = new Patient("Elecito", "Poluni", Instant.parse("1978-02-03T11:25:30.00Z"), "Homme", diagnosticDrPasSur, soinDrPasSur);
		Patient patientC = new Patient("Alobo", "Eurido", Instant.parse("2000-02-03T11:25:30.00Z"), "Homme", soinDrJveuxLargent);

		
		// aficher l'age du patient en année
		patientA.afficheAge();
		System.out.println(patientA.getAge());
		
		
		// patient qui n'a pas reçu de soin (+ traitement des exceptions)
		// normalement j'ai une erreur ici mais j'ai traité l'exeption avec try catch
		patientA.afficheFrequenceMedocParJour();
		
		// patient qui a reçu un soin
		patientB.afficheFrequenceMedocParJour();
		
	}

}
