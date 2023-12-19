package exercice4;
public class Temps{
	private int h,min,sec;

public Temps() {
}
public Temps(int h ) {
	this.h=h;
	
}
public Temps(int h,int min ) {
	this.h=h;
	this.min=min;
}
public Temps(int h,int min,int sec ) {
	this.h=h;
	this.min=min;
	this.sec=sec;
}
public Temps(Temps temps) throws CloneNotSupportedException {
	this.clone();
}

public int geth() {
	return h;
}
public int getmin() {
	return min;
}
public int getsec() {
	return sec;
}
public void seth(int h) {
	this.h=h;
}
public void setmin(int min) {
	this.min=min;
}
public  void setsec(int sec) {
	this.sec=sec;
}
public void ajouterHeures(int h) {
	this.seth(this.geth()+h);
}
public void ajouterMinutes(int min) {
	min+=this.getmin();
	ajouterHeures(min/60);
	this.setmin(min%60);
	
}
public void ajouterSecondes(int sec) {
	sec+=this.getsec();
	ajouterMinutes(sec/60);
	this.setsec(sec%60);
}
@Override
public String toString() {
    return "Temps{" +
            "s=" + sec +
            ", m=" + min +
            ", h=" + h +
            '}';
}
}
