package exercice3;
public class Livre {
private String titre,auteur;
private double prix;
private int annee;
public final int s;

public Livre() {
	this.s=0;
}
public Livre(String titre)  {
	this.s = 0;
	this.titre=titre;
}
public Livre(String titre,String auteur) {
	this.s = 0;
	this.titre=titre;
	this.auteur=auteur;
}
public Livre(String titre,String auteur,double prix) {
	this.s = 0;
	this.titre=titre;
	this.auteur=auteur;
	this.prix=prix;
	
}
public Livre(String titre,String auteur,double prix,int annee) {
	this.s = 0;
	this.titre=titre;
	this.auteur=auteur;
	this.prix=prix;
	this.annee=annee;
}
Livre(Livre l ){

    this(l.getTitre(), l.getAuteur(),l.getPrix(), l.getAnnee());
}

public String getTitre() {
    return titre;
}

public void setTitre(String titre) {
    this.titre = titre;
}

public String getAuteur() {
    return auteur;
}

public void setAuteur(String auteur) {
    this.auteur = auteur;
}

public double getPrix() {
    return prix;
}

public void setPrix(double prix) {
    this.prix = prix;
}

public int getAnnee() {
    return annee;
}

public void setAnnee(int annee) {
    this.annee = annee;
}
@Override
public String toString() {
    return "Livre{" +
            "titre='" + this.titre + '\'' +
            ", auteur='" + this.auteur + '\'' +
            ", prix=" + this.prix +
            ", annee=" + this.annee +
            ", s=" + s +
            '}';
}
}

