package fr.eseo.pdlo.exercices.utilisateurs;

public class Etudiant extends Personne{
	private int numEtudiant;
	public Etudiant(String prenom, String nom, String nationalite, int anneeDeNaissance, int numEtudiant) {
        this .nom=nom;
        this . prenom = prenom ;
        this . nationalite = nationalite ;
        this . anneeDeNaissance = anneeDeNaissance ;
        this.numEtudiant=numEtudiant;
        Personne . incrementeNbPersonnes ();
	}
	public Etudiant( String prenom, String nom, int anneeDeNaissance, int numEtudiant) {
		setNom (nom );
        setPrenom ( prenom );
        setAnneeDeNaissance (anneeDeNaissance);
        setNationalite ( Personne.NATIONALITE_PAR_DEFAUT );
        this.numEtudiant=numEtudiant;
        Personne . incrementeNbPersonnes ();
	}
	public int getNumEtudiant() {return numEtudiant;} 
	public void setNumEtudiant(int numEtudiant) {this.numEtudiant=numEtudiant;}
	//public String toString() {return "";}
	@Override
	public String toString() {
		return "Etudiant [numEtudiant=" + numEtudiant + "]";
	}
}
